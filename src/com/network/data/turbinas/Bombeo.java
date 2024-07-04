package com.network.data.turbinas;

import com.network.enums.Estado;

public abstract class Bombeo {
    protected Estado estado;
    protected String regimen;
    
    public Bombeo(Estado estado, String regimen) {
        this.estado = estado;
        this.regimen = regimen;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public String getRegimen() {
        return regimen;
    }

    public void setRegimen(String regimen) {
        this.regimen = regimen;
    }

    public abstract String mostrarInformacion();
}
