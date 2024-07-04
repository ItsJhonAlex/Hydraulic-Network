package com.network.data.turbinas;

import com.network.enums.Estado;
import com.network.interfaces.MostrarInformacion;

public class Bomba extends Bombeo implements MostrarInformacion{
    private Integer tiempo;

    public Bomba(String id, Estado estado, String regimen, Integer tiempo) {
        super(id, estado, regimen);
        this.tiempo = tiempo;
    }

    public Integer getTiempo() {
        return tiempo;
    }

    public void setTiempo(Integer tiempo) {
        this.tiempo = tiempo;
    }

    @Override
    public String mostrarInformacion() {
        return "Bombas de Agua" + "\nID: " + id + "\nEstado: " + estado + "\nRegimen: " + regimen + "\nTiempo de bombeo: " + tiempo + "m\n";
    }
}
