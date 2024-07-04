package com.network.data.deposito;

import com.network.enums.Estado;
import com.network.enums.Material;
import com.network.interfaces.MostrarInformacion;

public class Tanque extends Deposito implements MostrarInformacion{
    private Material material;

    public Tanque(Integer id, Integer capacidad, Estado estado, String abasto, Material material) {
        super(id, capacidad, estado, abasto);
        this.material = material;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    @Override
    public String mostrarInformacion() {
        return "Tanque:" + "\nID: " + id + "\nCapacidad: " + capacidad + "\nEstado: " + estado + "\nTipo de Abasto: " + abasto + "\nMaterial: " + material + "\n"; 
    }
}
