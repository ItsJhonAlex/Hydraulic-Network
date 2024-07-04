package com.network.data.deposito;

import com.network.enums.Estado;

public abstract class Deposito{
    protected String id;
    protected Integer capacidad;
    protected Estado estado;
    protected String abasto;
    
    public Deposito(String id, Integer capacidad, Estado estado, String abasto) {
        this.id = id;
        this.capacidad = capacidad;
        this.estado = estado;
        this.abasto = abasto;
    }
    public String getId() {
        return id;
    }

    public void setId(String id){
        this.id = id;
    }
    
    public Integer getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(Integer capacidad) {
        this.capacidad = capacidad;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public String getAbasto() {
        return abasto;
    }

    public void setAbasto(String abasto) {
        this.abasto = abasto;
    }

    
    public abstract String mostrarInformacion();
}
