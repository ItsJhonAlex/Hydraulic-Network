package com.network.data.deposito;

import com.network.enums.Clasificacion;
import com.network.enums.Estado;
import com.network.enums.Forma;

public class Simple extends Cisterna{
    private Forma forma;

    public Simple(Integer id, Integer capacidad, Estado estado, String abasto, Clasificacion clasificacion, Forma forma) {
        super(id, capacidad, estado, abasto, clasificacion);
        this.forma = forma;
    }

    public Forma getForma() {
        return forma;
    }

    public void setForma(Forma forma) {
        this.forma = forma;
    }

    @Override
    public String toString() {
        return "Deposito Cinsterna " + "\nID: " + id + "\nCapacidad: " + capacidad + "\nEstado: " + estado + "\nTipo de abasto: " + "\nClasificacion" + clasificacion + "Forma: " + forma;
    }

    
}
