package com.network.enums;

public enum Forma {
    Cubica("Cubica"), Cilindrica("Cilindrica");

    public final String form;
    Forma(String form) {
        this.form = form;
    }

    public String getForm(){
        return form;
    }

}
