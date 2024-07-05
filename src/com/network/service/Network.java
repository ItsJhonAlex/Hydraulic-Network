package com.network.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import com.network.data.deposito.Cisterna;
import com.network.data.deposito.CisternaCompuesta;
import com.network.data.deposito.CisternaSimple;
import com.network.data.deposito.Deposito;
import com.network.data.deposito.Tanque;
import com.network.data.turbinas.Bombeo;
import com.network.data.turbinas.Turbina;
import com.network.data.turbinas.Bomba;
import com.network.enums.Abasto;
import com.network.enums.Estado;
import com.network.enums.Forma;

public class Network {
    public ArrayList<Deposito> depositos = new ArrayList<>();
    public ArrayList<Bombeo> bombeos = new ArrayList<>();

    //Agregar Objetos a las Listas
    public void agrearBombeo(Bombeo bombeo){
        bombeos.add(bombeo);
    }    

    public void agregarDeposito(Deposito deposito){
        depositos.add(deposito);
    }

    //Mostrar Informacion de los objetos
    public void mostrarInformacionBombeo(){
        for (Bombeo bombeo : bombeos){
            System.out.println(bombeo.mostrarInformacion());
        }
    }
    

    public void mostrarInformacionDepositos(){
        for (Deposito deposito : depositos){
            System.out.println(deposito.mostrarInformacion());
        }
    }

    //Respondiendo a la primera funcion del proyecto (Funciona Correctamente)
    public void informaciónEstado(Abasto tipoAbastoUsuario) {
        for (Deposito deposito : depositos) {
            Estado estado = deposito.getEstado();
            Abasto tipoAbasto = deposito.getAbasto();
            if ((estado.equals(Estado.Mal) || estado.equals(Estado.Regular)) && tipoAbasto.equals(tipoAbastoUsuario)) {
                System.out.println(deposito.mostrarInformacion());
            }
        }
    }


    //Respondiendo a la segunda funcion del proyecto (Funciona Correctamente)
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

    //Respondiendo a la tercera funcion del proyecto (Funciona Correctamente)
    public int contarTanques(){
        int contador = 0;
        for (Deposito deposito : depositos) {
            if (deposito instanceof Tanque) {
                contador++;
            }
        }
        return contador;
    }

    public int contarCisternas(){
        int contador = 0;
        for (Deposito deposito : depositos) {
            if (deposito instanceof Cisterna) {
                contador++;
            }
        }
        return contador;
    }

    public int contarTurbinas(){
        int contador = 0;
        for (Bombeo bombeo : bombeos){
            if (bombeo instanceof Turbina){
                contador++;
            }
        }
        return contador;
    }

    public int contarBombas(){
        int contador = 0;
        for (Bombeo bombeo : bombeos){
            if (bombeo instanceof Bomba){
                contador++;
            }
        }
        return contador;
    }

    public void mostrarCantidades(){
        int t = contarTanques();
        int c = contarCisternas();
        int tr = contarTurbinas();
        int b = contarBombas();
        
        if (t == 0) {
            System.out.println("No hay Tanques Disponibles");
        } else {
            System.out.println("Cantidad de Tanques: " + t);
        }
        if (c == 0) {
            System.out.println("No hay Cisternas Disponibles");
        } else {
            System.out.println("Cantidad de Cisternas: " + c);
        }
        if (tr == 0) {
            System.out.println("No hay Turbinas Disponibles");
        } else {
            System.out.println("Cantidad de Turbinas: " + tr);
        }
        if (b == 0) {
            System.out.println("No hay Bombas Disponibles");
        } else {
            System.out.println("Cantidad de Bombas: " + b);
        }
    }

    //Respondiendo a la cuarta funcion del proyecto (Funciona Correctamente)     
    public Bomba encontrarMejorBomba() {
        Bomba mejorBomba = null;
        Integer maxTiempo = 0;
        for (Bombeo bombeo : bombeos) {
            if (bombeo instanceof Bomba) {
                Bomba bomba = (Bomba) bombeo;
                if (bomba.getTiempo() > maxTiempo) {
                    maxTiempo = bomba.getTiempo();
                    mejorBomba = bomba;
                }
            }
        }
        return mejorBomba;
    }

    public Turbina encontrarMejorTurbina() {
        Turbina mejorTurbina = null;
        double maxFuerza = 0.0;
        for (Bombeo bombeo : bombeos) {
            if (bombeo instanceof Turbina) {
                Turbina turbina = (Turbina) bombeo;
                if (turbina.getFuerza() > maxFuerza) {
                    maxFuerza = turbina.getFuerza();
                    mejorTurbina = turbina;
                }
            }
        }
        return mejorTurbina;
    }

    // Método para mostrar la información de la mejor bomba y turbina
    public void mostrarMejoresBombeos() {
        Bomba mejorBomba = encontrarMejorBomba();
        Turbina mejorTurbina = encontrarMejorTurbina();

        if (mejorBomba != null) {
            System.out.println("La mejor bomba es:\n" + mejorBomba.mostrarInformacion());
        } else {
            System.out.println("No hay bombas disponibles.");
        }

        if (mejorTurbina != null) {
            System.out.println("La mejor turbina es:\n" + mejorTurbina.mostrarInformacion());
        } else {
            System.out.println("No hay turbinas disponibles.");
        }
    }

    //Respondiendo a la quinta funcion del proyecto (Funciona Correctamente)
    public double calcularTiempoPromedioBombeoBuenEstado() {
        int sumaTiempo = 0;
        int contadorBuenEstado = 0;
        for (Bombeo bombeo : bombeos) {
            if (bombeo instanceof Bomba && bombeo.getEstado().equals(Estado.Bien)) {
                sumaTiempo += ((Bomba) bombeo).getTiempo();
                contadorBuenEstado++;
            }
        }
        return contadorBuenEstado > 0 ? (double) sumaTiempo / contadorBuenEstado : 0;
    }

    // Método para mostrar el tiempo promedio de bombeo de las bombas en buen estado
    public void mostrarTiempoPromedioBombeoBuenEstado() {
        double tiempoPromedio = calcularTiempoPromedioBombeoBuenEstado();
        if (tiempoPromedio > 0) {
            System.out.println("El tiempo promedio de bombeo de las bombas en buen estado es: " + tiempoPromedio + " minutos\n");
        } else {
            System.out.println("No hay bombas en buen estado para calcular el tiempo promedio.\n");
        }
    }

    //Respondiendo la sexta funcion del proyecto (Funciona Correctamente)
    public Turbina encontrarTurbinaMayorFuerza() {
        Turbina turbinaMayorFuerza = null;
        double maxFuerza = 0.0;
        for (Bombeo bombeo : bombeos) {
            if (bombeo instanceof Turbina) {
                Turbina turbina = (Turbina) bombeo;
                if (turbina.getFuerza() > maxFuerza) {
                    maxFuerza = turbina.getFuerza();
                    turbinaMayorFuerza = turbina;
                }
            }
        }
        return turbinaMayorFuerza;
    }

    // Método para mostrar el estado de la turbina de mayor fuerza
    public void mostrarEstadoTurbinaMayorFuerza() {
        Turbina turbina = encontrarTurbinaMayorFuerza();
        if (turbina != null) {
            System.out.println("Esta es la turbina de Mayor Fuerza: \n" + "ID: " + turbina.getId() + "\nEstado: " + turbina.getEstado() + "\nRegimen: " + turbina.getRegimen() + "\nFuerza: " + turbina.getFuerza() + "kPa\n");
        } else {
            System.out.println("No hay turbinas disponibles para determinar la de mayor fuerza.");
        }
    }

    //Respondiendo la septima funcion del proyecto (Funciona Correctamente)
    public double calcularCapacidadCisternasSimples(Forma formaEspecifica) {
        double capacidadTotal = 0;
        for (Deposito deposito : depositos) {
            if (deposito instanceof CisternaSimple) {
                CisternaSimple simple = (CisternaSimple) deposito;
                if (simple.getForma() == formaEspecifica) {
                    capacidadTotal += simple.getCapacidad();
                }
            }
        }
        return capacidadTotal;
    }

    public double calcularCapacidadCisternasCompuestas(int cantidadCompartimentos) {
        int cantidadTotal = 0;
        for (Deposito deposito : depositos) {
            if (deposito instanceof CisternaCompuesta) {
                CisternaCompuesta compuesta = (CisternaCompuesta) deposito;
                if (compuesta.getCompartimentos() == cantidadCompartimentos) {
                    cantidadTotal += compuesta.getCapacidad();
                }
            }
        }
        return cantidadTotal;
    }
}

