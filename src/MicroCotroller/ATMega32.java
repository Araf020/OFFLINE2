package MicroCotroller;

import com.Storage.SDcard;
import com.WeightMeasurement.WeightMeasure;
import com.display.LCD;
import com.display.LED;
import com.identification.RFID;
import com.internet.InternetConnection;


public class ATMega32 implements SDcard {

    private WeightMeasure weightMeasurement;
    private InternetConnection internetConnection;
    private RFID idcard;
    private LCD display;

    public ATMega32() {
        /**
         * your code
         */
        System.out.println("ATMega32 created");

    }

    public WeightMeasure getWeightMeasurement() {
        return this.weightMeasurement;
    }

    public void setWeightMeasurement(WeightMeasure weightMeasurement) {
        this.weightMeasurement = weightMeasurement;
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

    public LCD getDisplay() {
        return display;
    }

    public void setDisplay(LCD display) {
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

    /**
     * storage implementation ends here
     */


}
