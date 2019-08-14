package com.ramidez.warehouse.model;

public enum StanPrzedmiotu {
    USZKODZONY("Uszkodzony"),
    ZLY("Zły"),
    DOBRY("Dobr"),
    BARDZO_DOBRY("Bardzo dobry"),
    NOWY("Nowy");

    private String nazwa;

    StanPrzedmiotu(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }
}
