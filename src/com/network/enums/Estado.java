package com.network.enums;

public enum Estado {
    Bien("Bien"), Regular("Regular"), Mal("Mal");

    private final String stade;

    Estado(String stade) {
        this.stade = stade;
    }

    public String getStade(){
        return stade;
    }

}
