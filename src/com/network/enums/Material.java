package com.network.enums;

public enum Material {
    Fibrocemento("Fibrocemento"), Metal("Metal"), Plastico("Plastico");

    private final String materia;

    Material(String materia) {
        this.materia = materia;
    }

    public String getMateria(){
        return materia;
    }
}
