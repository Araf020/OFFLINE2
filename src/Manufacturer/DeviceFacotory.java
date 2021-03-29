package Manufacturer;

import Device.TeaGasDevice;


public class DeviceFacotory {

    public TeaGasDevice getTeagas(String packageName, String server, String internetConnection){



        if (packageName.toLowerCase().equals("silver")){


                return new buildWithATMega32().
                        setATMega32().setWeightMeasurement()
                        .setDisplay()
                        .setIdcard()
                        .setController()
                        .setsDcard()
                        .setInternet(internetConnection)
                        .setWebserver(server).getDevice();


        }
        else if (packageName.toLowerCase().equals("diamond")){

            return new buildWithRaspBerryPi()
                    .setRaspBerryPi()
                    .setLoadSensor()
                    .setIdcard()
                    .setDisplay()
                    .setController()
                    .setInternet(internetConnection)
                    .setWebserver(server).getDevice();


        }

        else if (packageName.toLowerCase().equals("gold")){

            return new buildWithArduinMega()
                    .setArduino()
                    .setWeightMeasurement()
                    .setDisplay()
                    .setIdcard()
                    .setInternet(internetConnection)
                    .setController()
                    .setWebserver(server)
                    .getDevice();


        }
        else if (packageName.toLowerCase().equals("platinum")){

            return new buildWithRaspBerryPi()
                    .setRaspBerryPi()
                    .setWeightModule()
                    .setDisplay()
                    .setIdcard()
                    .setInternet(internetConnection)
                    .setController()
                    .setWebserver(server)
                    .getDevice();

        }
        else {
            System.out.println("please choose a package among them!");
            return null;
        }
    }

}
