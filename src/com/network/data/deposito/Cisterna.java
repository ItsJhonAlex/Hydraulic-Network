package com.network.data.deposito;

import com.network.enums.Clasificacion;
import com.network.enums.Estado;
import com.network.enums.Forma;
import com.network.interfaces.MostrarInformacion;

public class Cisterna extends Deposito implements MostrarInformacion {
    private Clasificacion clasificacion;
    private Integer compartiminetos;
    private Forma forma;
    
    public Cisterna(String id, Integer capacidad, Estado estado, String abasto, Clasificacion clasificacion,
            Integer compartiminetos, Forma forma) {
        super(id, capacidad, estado, abasto);
        this.clasificacion = clasificacion;
        this.compartiminetos = setCompartiminetos(compartiminetos);
        this.forma = setForma(forma);
    }

    public Clasificacion getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(Clasificacion clasificacion) {
        this.clasificacion = clasificacion;
    }

    public Integer getCompartiminetos() {
        return compartiminetos;
    }

    public Integer setCompartiminetos(Integer compartiminetos) {
        if (clasificacion.equals(Clasificacion.Compuesta)) {
            return this.compartiminetos = compartiminetos;
        } else {
            return this.compartiminetos = null;
        }
    }

    public Forma getForma() {
        return forma;
    }

    public Forma setForma(Forma forma) {
        if (clasificacion.equals(Clasificacion.Simple)) {
            return this.forma = forma;
        }  else {
            return this.forma = null;
            } 
        }
    

    @Override
    public String mostrarInformacion() {
        if (clasificacion.equals(Clasificacion.Simple)) {
            return "Cinsterna " + clasificacion + ": " + "\nID: " + id + "\nCapacidad: " + capacidad + "L\nEstado: " + estado + "\nTipo de abasto: " + abasto + "\nForma: " + forma + "\n";
        } else {
            return "Cinsterna " + clasificacion + ": " + "\nID: " + id + "\nCapacidad: " + capacidad + "L\nEstado: " + estado + "\nTipo de abasto: " + abasto +  "\nCompartiminetos: " + compartiminetos + "\n";
        }
    }

    
}
