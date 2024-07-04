package com.network.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import com.network.data.deposito.Cisterna;
import com.network.data.deposito.Deposito;
import com.network.data.deposito.Tanque;
import com.network.data.turbinas.Bombeo;
import com.network.enums.Estado;

public class Network {
    public ArrayList<Deposito> depositos = new ArrayList<>();
    public ArrayList<Bombeo> bombeos = new ArrayList<>();

    public void agrearBombeo(Bombeo bombeo){
        bombeos.add(bombeo);
    }    

    public void mostrarInformacionBombeo(){
        for (Bombeo bombeo : bombeos){
            System.out.println(bombeo.mostrarInformacion());
        }
    }
    

    public void agregarDeposito(Deposito deposito){
        depositos.add(deposito);
    }

    public void mostrarInformacionDepositos(){
        for (Deposito deposito : depositos){
            System.out.println(deposito.mostrarInformacion());
        }
    }

    public void informaciónEstado(){
        for (Deposito deposito : depositos){
            Estado estado = deposito.getEstado();
            if (estado.equals(Estado.Mal) || estado.equals(Estado.Regular)) {
                System.out.println(deposito.mostrarInformacion());
            }
        }
    }

    public void mostrarTanquesPorMaterial() {
        Collections.sort(depositos, new Comparator<Deposito>() {
            @Override
            public int compare(Deposito d1, Deposito d2) {
                // Utiliza los enums directamente para la comparación
                if (d1 instanceof Tanque && d2 instanceof Tanque) {
                    return ((Tanque) d1).getMaterial().compareTo(((Tanque) d2).getMaterial());
                }
                return 0; // No compara si no son instancias de Tanque
            }
        });

        for (Deposito deposito : depositos) {
            if (deposito instanceof Tanque) {
                Tanque tanque = (Tanque) deposito;
                System.out.println("Tanque de " + tanque.getMaterial().getMateria() + " - Capacidad: " + tanque.getCapacidad() + "L");
            }
        }
    }

    public void mostrarCisternasPorClasificacion() {
        Collections.sort(depositos, new Comparator<Deposito>() {
            @Override
            public int compare(Deposito d1, Deposito d2) {
                // Utiliza los enums directamente para la comparación
                if (d1 instanceof Cisterna && d2 instanceof Cisterna) {
                    return ((Cisterna) d1).getClasificacion().compareTo(((Cisterna) d2).getClasificacion());
                }
                return 0; // No compara si no son instancias de Cisterna
            }
        });

        for (Deposito deposito : depositos) {
            if (deposito instanceof Cisterna) {
                Cisterna cisterna = (Cisterna) deposito;
                System.out.println("Cisterna " + cisterna.getClasificacion().getClasif() + " - Capacidad: " + cisterna.getCapacidad() + "L");
            }
        }
    }
}
