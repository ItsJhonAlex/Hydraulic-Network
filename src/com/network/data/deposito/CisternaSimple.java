package com.network.data.deposito;

import com.network.enums.Abasto;
import com.network.enums.Clasificacion;
import com.network.enums.Estado;
import com.network.enums.Forma;
import com.network.interfaces.MostrarInformacion;

public class CisternaSimple extends Cisterna implements MostrarInformacion{
    private Forma forma;

    public CisternaSimple(String id, Integer capacidad, Estado estado, Abasto abasto, Clasificacion clasificacion,
            Forma forma) {
        super(id, capacidad, estado, abasto, clasificacion);
        this.forma = forma;
        this.clasificacion = Clasificacion.Simple;
    }

    public Forma getForma() {
        return forma;
    }

    public void setForma(Forma forma) {
        this.forma = forma;
    }

    @Override
    public String mostrarInformacion() {
        return "Cinsterna " + clasificacion + ": " + "\nID: " + id + "\nCapacidad: " + capacidad + "L\nEstado: " + estado + "\nTipo de abasto: " + abasto + "\nForma: " + forma + "\n";
    }
}
