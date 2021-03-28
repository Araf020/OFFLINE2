package Device;

import WebServers.Admin;
import component.Storage.SDcard;
import component.Storage.Storage;
import component.WeightMeasurement.WeightMeasure;
import component.display.Display;
import component.display.LED;
import component.identification.ID;
import component.identification.RFID;
import component.internet.InternetConnection;

public class Device implements TeaGasDevice {

    private WeightMeasure weightMeasurement;
    private InternetConnection internetConnection;
    private RFID idcard;
    private LED display;
    private Admin admin;
    private Storage storage;
    private SDcard sDcard;
    private Double sdCardSize;


    public Device() {
        /**
         * your code
         */

        System.out.println("Device created");

    }


    public void setsDcard() {

        this.sDcard.setFreeSpace(this.sdCardSize);
        this.sDcard.setFunctionalities();

    }

    public void setSdCardSize(Double size){

        this.sdCardSize = size;

    }



    /**
     * implement below methods as needed
     */

    @Override
    public void setWebserver() {
     //   admin = new Admin();

    }

    @Override
    public void setFrameWork(String frameWorkname) {
        //admin.setFrameWork(frameWorkname);

    }
    @Override
    public  void  setFunctions(){
        /**
         * your code
         */
    }
    public void setWeightMeasurement(WeightMeasure weightMeasurement) {
        /**
         * your code
         */
    }

    @Override
    public WeightMeasure getWeightMeasurement() {
        return null;
    }

    @Override
    public InternetConnection getInternetConnection() {
        return null;
    }

    @Override
    public void setInternetConnection(InternetConnection internetConnection) {

    }

    @Override
    public ID getIdcard() {
        return null;
    }

    @Override
    public void setIdcard(ID idcard) {

    }

    @Override
    public Display getDisplay() {
        return null;
    }

    @Override
    public void setDisplay(Display display) {

    }



    /**
     * storage implementation ends here
     */


}
