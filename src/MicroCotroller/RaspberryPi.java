package MicroCotroller;

import com.Storage.Storage;
import com.WeightMeasurement.WeightMeasure;
import com.display.LCD;
import com.display.TouchScreen;
import com.identification.NFC;
import com.identification.RFID;
import com.internet.Ethernet;
import com.internet.InternetConnection;

public class RaspberryPi {

    private Ethernet ethernet;
    private WeightMeasure weightMeasurement;
    private InternetConnection internetConnection;
    private NFC idcard;
    private TouchScreen display;
    private Storage storage;


    public RaspberryPi() {
        /**
         * your code
         */
        storage = new Storage(); /** attached storage along with it */
        ethernet = new Ethernet(); /** ethernet connection along with it */;

        System.out.println("RaspberryPi created");

    }


    public void setWeightMeasurement(WeightMeasure weightMeasurement) {
        this.weightMeasurement = weightMeasurement;
    }

    public void setInternetConnection(InternetConnection internetConnection) {
        this.internetConnection = internetConnection;
    }

    public void setIdcard(NFC idcard) {
        this.idcard = idcard;
    }

    public void setDisplay(TouchScreen display) {
        this.display = display;
    }
}
