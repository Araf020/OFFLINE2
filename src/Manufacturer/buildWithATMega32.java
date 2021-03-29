package Manufacturer;

import Device.Device;
import WebServers.Django;
import WebServers.FrameWorks;
import WebServers.Laravel;
import WebServers.Spring;
import component.Controller.Button;
import component.Controller.ControlUnit;
import component.MicroControllerandProcessors.ATMega32;
import component.MicroControllerandProcessors.Micro;
import component.Storage.SDcard;
import component.WeightMeasurement.Load_Sensor;
import component.WeightMeasurement.WeightMeasure;
import component.display.Display;
import component.display.LCD;
import component.identification.ID;
import component.identification.RFID;
import component.internet.Ethernet;
import component.internet.GSM;
import component.internet.InternetConnection;
import component.internet.Wifi;



public class buildWithATMega32 {

    private Micro micro;
    private SDcard sDcard;
    private WeightMeasure weightMeasure;
    private FrameWorks frameWorks;
    private Display display;
    private ID id;
    private InternetConnection internetConnection;
    private ControlUnit controlUnit;





    protected buildWithATMega32 setATMega32(){
        this.micro = new ATMega32();
        return this;
    }



    protected buildWithATMega32 setWeightMeasurement() {
        this.weightMeasure = new Load_Sensor();
        return this;
    }




    private buildWithATMega32 setWifi() {
        this.internetConnection = new Wifi();
        return this;
    }

    private buildWithATMega32 setGsm() {
        this.internetConnection = new GSM();
        return this;
    }
    private buildWithATMega32 setEthernet() {
        this.internetConnection = new Ethernet();
        return this;
    }



    protected buildWithATMega32 setIdcard() {
        this.id = new RFID();
        return this;
    }

    protected buildWithATMega32 setInternet(String internetOption){
        if (internetOption.toLowerCase().equals("wifi"))
            return setWifi();
        else if (internetOption.toLowerCase().equals("gsm"))
            return  setGsm();
        else
            return setEthernet();
    }



    protected buildWithATMega32 setDisplay() {
        this.display = new LCD();
        return this;
    }


    protected buildWithATMega32 setWebserver(String server){
        if (server.toLowerCase().equals("spring")){
            this.frameWorks = new Spring();
        }
        else  if (server.toLowerCase().equals("django")){
            this.frameWorks = new Django();
        }
        else {
            this.frameWorks = new Laravel();
        }

        return this;
    }





    protected buildWithATMega32 setsDcard() {
        this.sDcard = new SDcard();
        return this;
    }


    protected   buildWithATMega32 setController(){
        this.controlUnit = new Button();

        return this;

    }


    protected Device getDevice() {
        return new Device(weightMeasure, internetConnection, id, display, sDcard, controlUnit);


    }
}
