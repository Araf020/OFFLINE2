package component.internet;

public class Wifi extends InternetConnection{
    public Wifi()
    {
        /**
         * your constructor
         */
        System.out.println("Wifi connection established");
    }

    /**
     *
     *implement below methods as needed
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
        return false;
    }

    @Override
    public void setConnectionStatus(boolean connectionStatus) {

    }
}
