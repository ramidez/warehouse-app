package com.ramidez.warehouse.model;

public enum Type {

    NARZEDZIA("Narzędzia"), PROGRAM("Program");

    private String nazwa;

    private Type(String nazwa){
        this.nazwa = nazwa;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }
}
