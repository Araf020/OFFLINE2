package builder;
import Device.Device;
import component.MicroControllerandProcessors.ATMega32;
import Device.ArduinoMega;
import Device.MicroController;
import component.MicroControllerandProcessors.RaspberryPi;
import component.WeightMeasurement.Load_Sensor;
import component.WeightMeasurement.weight_Module;
import component.display.LCD;
import component.display.LED;
import component.display.TouchScreen;
import component.identification.NFC;
import component.identification.RFID;
import component.internet.GSM;
import component.internet.Wifi;



public class TeaGasBuilder
{

    /**
     * AtMeGa32 Builder

     */

    public Device getSilver(String weightMeasurement, String internetConnection){

        Device atMega32 = new Device();

        if (weightMeasurement.toUpperCase().equals("LOADSENSOR")){

                atMega32.setWeightMeasurement(new Load_Sensor());
        }
        else {
            atMega32.setWeightMeasurement(new weight_Module());
        }

        if (internetConnection.toUpperCase().equals("WIFI")){
            atMega32.setInternetConnection(new Wifi());
        }

        else if (internetConnection.toUpperCase().equals("GSM")){
            atMega32.setInternetConnection(new GSM());
        }

        atMega32.setDisplay(new LCD()); /** display settings*/
        atMega32.setIdcard(new RFID()); /** identification setting */
        atMega32.setFunctions();
        /**
         * controller settings is incomplete
         */

        return atMega32;

    }


    /**
     * Arduino Builder

     */

    public  Device getArduinoMega(String weightMeasurement,
                                             String internetConnection ){
        Device arduinoMega = new Device();

        arduinoMega.setFunctions();
        arduinoMega.setDisplay(new LED());
        arduinoMega.setIdcard(new RFID());

        if (weightMeasurement.toUpperCase().equals("WEIGHTMODULE"))
            arduinoMega.setWeightMeasurement(new weight_Module());

        else
            arduinoMega.setWeightMeasurement(new Load_Sensor());

        if (internetConnection.toUpperCase().equals("GSM"))
            arduinoMega.setInternetConnection(new GSM());
        else
            arduinoMega.setInternetConnection(new Wifi());

       return arduinoMega;
    }



    /**
     * RaspberryPiBuilder

     */
    public Device getRaspberryPi(String weightMeasurement){

        Device device = new Device();
        device.setFunctions();
        device.setDisplay(new TouchScreen());

        device.setIdcard(new NFC());

        if (weightMeasurement.toUpperCase().equals("WEIGHTMODULE"))
            device.setWeightMeasurement(new weight_Module());

        else
            device.setWeightMeasurement(new Load_Sensor());



        return device;
    }

    /** with internet choice */

    public  Device getRaspberryPi(String wmt, String internet) {

        Device device = getRaspberryPi(wmt);

        if (internet.toUpperCase().equals("GSM"))
         device.setInternetConnection(new GSM());
        else
            device.setInternetConnection(new Wifi());

        return device;
    }




}
