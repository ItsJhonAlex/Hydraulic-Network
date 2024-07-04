package com.network.data.turbinas;

import com.network.enums.Estado;
import com.network.interfaces.MostrarInformacion;

public class Turbina extends Bombeo implements MostrarInformacion{
    private double fuerza;

    public Turbina(Estado estado, String regimen, double fuerza) {
        super(estado, regimen);
        this.fuerza = fuerza;
    }

    public double getFuerza() {
        return fuerza;
    }

    public void setFuerza(double fuerza) {
        this.fuerza = fuerza;
    }

    @Override
    public String mostrarInformacion() {
        return "Turbina: " + "\nEstado: " + fuerza + "\nRegimen: " + regimen + "\nFuerza: " + fuerza;
    }
}

