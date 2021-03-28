package Device;

import component.WeightMeasurement.WeightMeasure;
import component.display.Display;
import component.identification.ID;
import component.internet.InternetConnection;

public interface TeaGasDevice {

    void  setFunctions();
    void setWeightMeasurement(WeightMeasure weightMeasure);
    WeightMeasure getWeightMeasurement() ;

    InternetConnection getInternetConnection() ;

    void setInternetConnection(InternetConnection internetConnection);
    ID getIdcard() ;

    void setIdcard(ID idcard) ;

    Display getDisplay();

    void setWebserver();
    void setFrameWork(String frameWorkname);

    void setDisplay(Display display);




}
