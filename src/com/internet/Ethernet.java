package com.internet;

public class Ethernet extends InternetConnection{

    public Ethernet(){
        /**
         * your constructor
         */
        System.out.println("establishing ethernet connection");

    }

    /**
     *
     * implement below methods
     *
     * */

    @Override
    public boolean establishConnection() {
        System.out.println(" ethernet connection established");
        return true;
    }

    @Override
    public Double getBandWidth() {
        return null;
    }

    @Override
    public void setBandWidth(Double bandWidth) {

    }

    @Override
    public boolean isConnectionStatus() {
        return true;
    }

    @Override
    public void setConnectionStatus(boolean connectionStatus) {

    }
}
