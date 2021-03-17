package com.display;

public class TouchScreen implements  Display {

    public TouchScreen() {
        /**
         * your constructor
         */

        System.out.println("Touchscreen created");


    }

    /**
     *
     *implement below methods as needed
     */

    @Override
    public void setFunctionality() {
        /**
         * implement how it should work
         */
    }

    @Override
    public void setResolution() {

    }

    @Override
    public void setFps() {

    }

    @Override
    public void setCost() {

    }

    @Override
    public String getResolution() {
        return null;
    }

    @Override
    public String getFps() {
        return null;
    }

    @Override
    public Double getCost() {
        return null;
    }
}
