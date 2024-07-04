package com.network.data.deposito;

import com.network.enums.Clasificacion;
import com.network.enums.Estado;

public class Cisterna extends Deposito {
    protected Clasificacion clasificacion;

    public Cisterna(Integer id, Integer capacidad, Estado estado, String abasto, Clasificacion clasificacion) {
        super(id, capacidad, estado, abasto);
        this.clasificacion = clasificacion;
    }

    public Clasificacion getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(Clasificacion clasificacion) {
        this.clasificacion = clasificacion;
    }    
    
}
