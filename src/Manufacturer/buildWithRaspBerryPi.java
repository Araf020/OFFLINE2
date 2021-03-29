package Manufacturer;

import Device.Device;
import WebServers.Django;
import WebServers.FrameWorks;
import WebServers.Laravel;
import WebServers.Spring;
import component.Controller.ControlUnit;
import component.Controller.TouchscreenControll;
import component.MicroControllerandProcessors.Micro;
import component.MicroControllerandProcessors.RaspberryPi;
import component.Storage.SDcard;
import component.WeightMeasurement.Load_Sensor;
import component.WeightMeasurement.WeightMeasure;
import component.WeightMeasurement.Weight_Module;
import component.display.Display;
import component.display.TouchScreen;
import component.identification.ID;
import component.identification.NFC;
import component.internet.Ethernet;
import component.internet.GSM;
import component.internet.InternetConnection;
import component.internet.Wifi;

public class buildWithRaspBerryPi {

    private Micro micro;
    private SDcard sDcard;
    private WeightMeasure weightMeasure;
    private FrameWorks frameWorks;
    private Display display;
    private ID id;
    private InternetConnection internetConnection;
    private ControlUnit controlUnit;



    protected buildWithRaspBerryPi setRaspBerryPi(){
        this.micro = new RaspberryPi();
        return this;
    }



    protected buildWithRaspBerryPi setWeightModule() {
        this.weightMeasure = new Weight_Module();
        return this;
    }
    protected buildWithRaspBerryPi setLoadSensor() {
        this.weightMeasure = new Load_Sensor();
        return this;
    }

    protected buildWithRaspBerryPi setInternet(String internetOption){
        if (internetOption.toLowerCase().equals("wifi"))
            return setWifi();
        else if (internetOption.toLowerCase().equals("gsm"))
            return  setGsm();
        else
            return setEthernet();
    }



    private buildWithRaspBerryPi setWifi() {
        this.internetConnection = new Wifi();
        return this;
    }

    private buildWithRaspBerryPi setGsm() {
        this.internetConnection = new GSM();
        return this;
    }
    private buildWithRaspBerryPi setEthernet() {
        this.internetConnection = new Ethernet();
        return this;
    }



    protected buildWithRaspBerryPi setIdcard() {
        this.id = new NFC();
        return this;
    }



    protected buildWithRaspBerryPi setDisplay() {
        this.display = new TouchScreen();
        return this;
    }



    protected buildWithRaspBerryPi setWebserver(String server){
        if (server.toLowerCase().equals("spring")){
            this.frameWorks = new Spring();
        }
        else if (server.toLowerCase().equals("django")){
            this.frameWorks = new Django();
        }
        else {
            this.frameWorks = new Laravel();
        }

        return this;
    }

    protected buildWithRaspBerryPi setController(){
        this.controlUnit = new TouchscreenControll();
        return this;
    }

    protected Device getDevice() {
        return new Device(weightMeasure, internetConnection, id, display,controlUnit);


    }
}
