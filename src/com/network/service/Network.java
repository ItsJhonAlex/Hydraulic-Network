package com.network.service;

import java.util.ArrayList;

import com.network.data.deposito.Deposito;
import com.network.data.turbinas.Bombeo;

public class Network {
    ArrayList<Deposito> depositos = new ArrayList<>();
    ArrayList<Bombeo> bombeos = new ArrayList<>();

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
}
