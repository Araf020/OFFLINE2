package Device;

import component.Controller.ControlUnit;
import component.Storage.SDcard;
import component.Storage.Storage;
import component.WeightMeasurement.WeightMeasure;
import component.display.Display;
import component.identification.ID;
import component.internet.InternetConnection;

public class Device implements TeaGasDevice {

    private WeightMeasure weightMeasurement;
    private InternetConnection internetConnection;
    private ID idcard;
    private Display display;
    private Storage storage;
    private SDcard sDcard;
    private ControlUnit controller;
    private Double sdCardSize;




    /**
     *
     * @param weightMeasurement
     * @param internetConnection
     * @param idcard
     * @param display
     * @param sDcard
     * @param controller
     *
     * your Constructor
     */

    public Device(WeightMeasure weightMeasurement, InternetConnection internetConnection, ID idcard, Display display, SDcard sDcard, ControlUnit controller) {
        this.weightMeasurement = weightMeasurement;
        this.internetConnection = internetConnection;
        this.idcard = idcard;
        this.display = display;
        this.sDcard = sDcard;
        this.controller = controller;

        System.out.println("Device Created");

    }

    /**
     *
     * @param weightMeasurement
     * @param internetConnection
     * @param idcard
     * @param display
     * @param touch
     *
     * your overLoaded Constructor
     */

    public Device(WeightMeasure weightMeasurement, InternetConnection internetConnection, ID idcard, Display display, ControlUnit touch) {
        this.weightMeasurement = weightMeasurement;
        this.internetConnection = internetConnection;
        this.idcard = idcard;
        this.display = display;
        this.storage = new Storage();
        this.controller = touch;

        System.out.println("Device Created");

    }

    @Override
    public void startActivity() {

    }

}
