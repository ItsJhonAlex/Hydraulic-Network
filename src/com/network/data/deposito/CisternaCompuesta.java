package com.network.data.deposito;

import com.network.enums.Abasto;
import com.network.enums.Clasificacion;
import com.network.enums.Estado;
import com.network.interfaces.MostrarInformacion;

public class CisternaCompuesta  extends Cisterna implements MostrarInformacion{
    private int compartimentos;

    public CisternaCompuesta(String id, Integer capacidad, Estado estado, Abasto abasto, Clasificacion clasificacion,
            int compartimentos) {
        super(id, capacidad, estado, abasto, clasificacion);
        this.compartimentos = compartimentos;
        this.clasificacion = Clasificacion.Compuesta;
    }

    public int getCompartimentos() {
        return compartimentos;
    }

    public void setCompartimentos(int compartimentos) {
        this.compartimentos = compartimentos;
    }

    @Override
    public String mostrarInformacion() {
        return "Cinsterna " + clasificacion + ": " + "\nID: " + id + "\nCapacidad: " + capacidad + "L\nEstado: " + estado + "\nTipo de abasto: " + abasto +  "\nCompartiminetos: " + compartimentos + "\n";

    }
    

    


}