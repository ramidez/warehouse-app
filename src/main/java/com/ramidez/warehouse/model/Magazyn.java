package com.ramidez.warehouse.model;

public enum Magazyn {

    WARSZTAT_JEZA("Warsztat"),
    HUFIEC("Hufiec");

    private String nazwa;

    Magazyn(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }
}
