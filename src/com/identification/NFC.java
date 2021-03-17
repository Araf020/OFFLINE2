package com.identification;

public class NFC implements ID{
    public NFC() {
        System.out.println("NFC created");
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
