package Manufacturer;

import Device.Device;
import WebServers.Django;
import WebServers.FrameWorks;
import WebServers.Laravel;
import WebServers.Spring;
import component.Controller.Button;
import component.Controller.ControlUnit;
import component.MicroControllerandProcessors.ArduinoMega;
import component.MicroControllerandProcessors.Micro;
import component.Storage.SDcard;
import component.WeightMeasurement.WeightMeasure;
import component.WeightMeasurement.Weight_Module;
import component.display.Display;
import component.display.LED;
import component.identification.ID;
import component.identification.RFID;
import component.internet.Ethernet;
import component.internet.GSM;
import component.internet.InternetConnection;
import component.internet.Wifi;

public class buildWithArduinMega {


    private Micro micro;
    private SDcard sDcard;
    private WeightMeasure weightMeasure;
    private FrameWorks frameWorks;
    private Display display;
    private ID id;
    private InternetConnection internetConnection;
    private ControlUnit controlUnit;




    protected buildWithArduinMega setArduino(){
        this.micro = new ArduinoMega();
        return this;
    }


    protected buildWithArduinMega setWeightMeasurement() {
        this.weightMeasure = new Weight_Module();
        return this;
    }

    protected buildWithArduinMega setInternet(String internetOption){
        if (internetOption.toLowerCase().equals("wifi"))
            return setWifi();
        else if (internetOption.toLowerCase().equals("gsm"))
            return  setGsm();
        else
            return setEthernet();
    }

    private buildWithArduinMega setWifi() {
        this.internetConnection = new Wifi();
        return this;
    }

    private buildWithArduinMega setGsm() {
        this.internetConnection = new GSM();
        return this;
    }



    private buildWithArduinMega setEthernet() {
        this.internetConnection = new Ethernet();
        return this;
    }

    protected buildWithArduinMega setIdcard() {
        this.id = new RFID();
        return this;
    }



    protected buildWithArduinMega setDisplay() {
        this.display = new LED();
        return this;
    }


   protected buildWithArduinMega setWebserver(String server){
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





    protected buildWithArduinMega setsDcard() {
        this.sDcard = new SDcard();
        return this;
    }
    protected   buildWithArduinMega setController(){
        this.controlUnit = new Button();

        return this;

    }

    protected Device getDevice() {
        return new Device(weightMeasure, internetConnection, id, display, sDcard, controlUnit);


    }
}
