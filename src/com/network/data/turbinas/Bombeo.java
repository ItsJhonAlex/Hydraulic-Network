package com.network.data.turbinas;


import com.network.enums.Estado;

public abstract class Bombeo {
    protected String id;
    protected Estado estado;
    protected String regimen;
    
    public Bombeo(String id, Estado estado, String regimen) {
        this.id = id;
        this.estado = estado;
        this.regimen = regimen;
    }

    public String getId(){
        return id;
    }

    public void setId(String id){
        this.id = id;
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
