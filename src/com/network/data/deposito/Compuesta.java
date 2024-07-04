package com.network.data.deposito;

import com.network.enums.Clasificacion;
import com.network.enums.Estado;

public class Compuesta extends Cisterna {
    private Integer compartiminetos;

    public Compuesta(Integer id, Integer capacidad, Estado estado, String abasto, Clasificacion clasificacion,
            Integer compartiminetos) {
        super(id, capacidad, estado, abasto, clasificacion);
        this.compartiminetos = compartiminetos;
    }

    public Integer getCompartiminetos() {
        return compartiminetos;
    }

    public void setCompartiminetos(Integer compartiminetos) {
        this.compartiminetos = compartiminetos;
    }

    @Override
    public String toString() {
        return "Deposito Cinsterna " + "\nID: " + id + "\nCapacidad: " + capacidad + "\nEstado: " + estado + "\nTipo de abasto: " + "\nClasificacion" + clasificacion + "Compartiminetos: " + compartiminetos;
    }

    
}
