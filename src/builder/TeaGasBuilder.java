package builder;
import MicroCotroller.ATMega32;
import MicroCotroller.ArduinoMega;
import MicroCotroller.RaspberryPi;
import com.WeightMeasurement.Load_Sensor;
import com.WeightMeasurement.weight_Module;
import com.display.LCD;
import com.display.LED;
import com.display.TouchScreen;
import com.identification.NFC;
import com.identification.RFID;
import com.internet.GSM;
import com.internet.Wifi;



public class TeaGasBuilder
{



    /**
     * AtMeGa32 Builder

     */
    public static  ATMega32 getATMega32(String weightMeasurement,String internetConnection){

        ATMega32 atMega32 = new ATMega32();

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
        atMega32.setFunctionality();
        /**
         * controller settings is incomplete
         */

        return atMega32;

    }


    /**
     * Arduino Builder

     */



    /**
     * Arduino Builder

     */

    public static ArduinoMega getArduinoMega(String weightMeasurement,
                                             String internetConnection ){
        ArduinoMega arduinoMega = new ArduinoMega();
        arduinoMega.setFunctionality();
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
    public  static RaspberryPi getRaspberryPi(String weightMeasurement){

        RaspberryPi raspberryPi = new RaspberryPi();
        raspberryPi.setDisplay(new TouchScreen());
        raspberryPi.setIdcard(new NFC());

        if (weightMeasurement.toUpperCase().equals("WEIGHTMODULE"))
            raspberryPi.setWeightMeasurement(new weight_Module());

        else
            raspberryPi.setWeightMeasurement(new Load_Sensor());



        return raspberryPi;
    }
/** with internet choice */

    public  static RaspberryPi getRaspberryPi(String wmt, String internet) {

        RaspberryPi raspBerryPi = getRaspberryPi(wmt);

        if (internet.toUpperCase().equals("GSM"))
         raspBerryPi.setInternetConnection(new GSM());
        else
            raspBerryPi.setInternetConnection(new Wifi());

        return raspBerryPi;
    }




}
