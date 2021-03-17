package com.display;

public interface Display {
    String resolution = null;
    String fps = null;

    Double cost = 0.0;

     void setFunctionality();
     void setResolution();
     void setFps();
     void  setCost();
     String getResolution();
     String getFps();
     Double getCost();

}
