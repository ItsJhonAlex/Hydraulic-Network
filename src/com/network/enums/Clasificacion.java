package com.network.enums;

public enum Clasificacion {
    Simple("Simple"), Compuesta("Compuesta");

    private final String clasif;

    Clasificacion(String clasif) {
        this.clasif = clasif;
    }

    public String getClasif(){
        return clasif;
    }
}
