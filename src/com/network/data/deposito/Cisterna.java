package com.network.data.deposito;

import com.network.enums.Abasto;
import com.network.enums.Clasificacion;
import com.network.enums.Estado;


public abstract class Cisterna extends Deposito {
    protected Clasificacion clasificacion;
    
    public Cisterna(String id, Integer capacidad, Estado estado, Abasto abasto, Clasificacion clasificacion) {
        super(id, capacidad, estado, abasto);
        this.clasificacion = clasificacion;
    }

    public Clasificacion getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(Clasificacion clasificacion) {
        this.clasificacion = clasificacion;
    }    

    @Override
    public abstract String mostrarInformacion();

    
}
