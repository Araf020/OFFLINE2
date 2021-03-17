package MicroCotroller;

import com.Storage.SDcard;
import com.WeightMeasurement.Load_Sensor;
import com.WeightMeasurement.WeightMeasure;
import com.display.LCD;
import com.display.LED;
import com.identification.NFC;
import com.identification.RFID;
import com.internet.InternetConnection;

public class ArduinoMega implements SDcard {

    private WeightMeasure weightMeasurement;
    private InternetConnection internetConnection;
    private RFID idcard;
    private LED display;

    public ArduinoMega() {
        /**
         * your code
         */
        System.out.println("ArduinoMega created");

    }
    public  void  setFunctions(){
        /**
         * your code
         */
    }

    public WeightMeasure getWeightMeasurement() {
        return weightMeasurement;
    }

    public InternetConnection getInternetConnection() {
        return internetConnection;
    }

    public void setInternetConnection(InternetConnection internetConnection) {
        this.internetConnection = internetConnection;
    }

    public RFID getIdcard() {
        return idcard;
    }

    public void setIdcard(RFID idcard) {
        this.idcard = idcard;
    }

    public LED getDisplay() {
        return display;
    }

    public void setDisplay(LED display) {
        this.display = display;
    }

    /**
     * this part is for storage implementation
     *
     * write your code
     */
    @Override
    public void setSize() {

    }

    @Override
    public void setFunctionality() {

    }

    @Override
    public void setType() {

    }

    @Override
    public void customize() {

    }

    public void setWeightMeasurement(WeightMeasure weightMeasurement) {
    }
    /**
     * storage implementation ends here
     */


}
