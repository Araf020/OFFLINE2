package com.identification;

public class RFID implements ID {

    public RFID(){
        System.out.println("RFID Created");
    }


    @Override
    public void setIdKey(String key) {

    }

    @Override
    public String getIdKey() {
        return null;
    }


    @Override
    public String getName() {
        return null;
    }

    @Override
    public void setName(String name) {

    }

    @Override
    public String getRole() {
        return null;
    }

    @Override
    public void setRole(String role) {

    }

    @Override
    public boolean getCurrentStatus() {
        return false;
    }

    @Override
    public void setCurrentStatus(boolean currentStatus) {

    }
}
