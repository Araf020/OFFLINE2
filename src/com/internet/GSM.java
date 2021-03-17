package com.internet;

public class GSM extends InternetConnection {
   boolean connectionStatus;
    public GSM(){
        /**
         * your constructor
         */

        System.out.println("GSM connection established");

    }

    /**
     *
     *implement below methods
     */

    @Override
    public boolean establishConnection() {
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
        return this.connectionStatus;
    }

    @Override
    public void setConnectionStatus(boolean connectionStatus) {
        this.connectionStatus = true;
    }
}
