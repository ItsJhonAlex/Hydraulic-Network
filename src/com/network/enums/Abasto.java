package com.network.enums;

public enum Abasto {
    Municipal("Municipal"), Reciclada("Reciclada"), Manantial("Manantial"), Desalinizado("Desalinizado");

    private final String tipo;

    Abasto(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo(){
        return tipo;
    }

}
