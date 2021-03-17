package com.WeightMeasurement;

public interface weightMeasurement {
    Double weight = 0.0;
    String unit = "kg";

    void setWeight(Double w);
    void setUnit(String u);
    void setFunctionality();
    void getWeight();
    void getUnit();

}
