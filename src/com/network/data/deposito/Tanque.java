package com.network.data.deposito;

import com.network.enums.Estado;
import com.network.enums.Material;

public class Tanque extends Deposito {
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
    public String toString() {
        return "Deposito Tanque" + "\nID: " + id + "\nCapacidad: " + capacidad + "\nEstado: " + estado + "\nTipo de Abasto: " + abasto + "Material: " + material; 
    }

    
}
