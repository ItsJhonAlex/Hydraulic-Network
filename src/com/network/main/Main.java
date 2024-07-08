package com.network.main;

import java.io.IOException;

import com.network.data.deposito.CisternaCompuesta;
import com.network.data.deposito.CisternaSimple;
import com.network.data.deposito.Tanque;
import com.network.data.turbinas.Bomba;
import com.network.data.turbinas.Turbina;
import com.network.enums.Abasto;
import com.network.enums.Clasificacion;
import com.network.enums.Estado;
import com.network.enums.Forma;
import com.network.enums.Material;
import com.network.service.Network;
import com.network.utils.Fichero;

public class Main {
    public static void main(String[] args) throws IOException {
        Network network = new Network();
        
        //Depositos
        network.agregarDeposito(new Tanque("001", 50, Estado.Bien, Abasto.Desalinizado, Material.Fibrocemento));
        network.agregarDeposito(new Tanque("002", 50, Estado.Bien, Abasto.Manantial, Material.Plastico));
        network.agregarDeposito(new Tanque("003", 50, Estado.Bien, Abasto.Municipal, Material.Metal));
        network.agregarDeposito(new Tanque("004", 50, Estado.Bien, Abasto.Reciclada, Material.Plastico));
        network.agregarDeposito(new Tanque("005", 50, Estado.Bien, Abasto.Reciclada, Material.Metal));
        network.agregarDeposito(new Tanque("006", 50, Estado.Bien, Abasto.Municipal, Material.Fibrocemento));
        network.agregarDeposito(new CisternaCompuesta("007", 100, Estado.Regular, Abasto.Manantial, Clasificacion.Compuesta, 2));
        network.agregarDeposito(new CisternaCompuesta("008", 150, Estado.Mal, Abasto.Manantial, Clasificacion.Compuesta, 6));
        network.agregarDeposito(new CisternaSimple("009", 100, Estado.Regular, Abasto.Reciclada, Clasificacion.Simple, Forma.Cilindrica));
        network.agregarDeposito(new CisternaCompuesta("010", 100, Estado.Regular, Abasto.Desalinizado, Clasificacion.Compuesta, 2));
        network.agregarDeposito(new CisternaSimple("011", 100, Estado.Regular, Abasto.Municipal, Clasificacion.Simple, Forma.Cilindrica));
        network.agregarDeposito(new CisternaCompuesta("012", 100, Estado.Regular, Abasto.Reciclada, Clasificacion.Compuesta, 2));
        network.agregarDeposito(new CisternaSimple("013", 100, Estado.Regular, Abasto.Desalinizado, Clasificacion.Simple, Forma.Cilindrica));
        network.agregarDeposito(new CisternaSimple("014", 100, Estado.Regular, Abasto.Municipal, Clasificacion.Simple, Forma.Cilindrica));
        network.agregarDeposito(new CisternaSimple("015", 100, Estado.Regular, Abasto.Manantial, Clasificacion.Simple, Forma.Cilindrica));

        //Bombas
        network.agrearBombeo(new Bomba("001", Estado.Bien, "Alto", 15));
        network.agrearBombeo(new Bomba("002", Estado.Regular, "Alto", 16));
        network.agrearBombeo(new Bomba("003", Estado.Mal, "Alto", 30));
        network.agrearBombeo(new Bomba("004", Estado.Bien, "Alto", 40));
        network.agrearBombeo(new Bomba("005", Estado.Bien, "Alto", 50));
        network.agrearBombeo(new Turbina("006", Estado.Regular, "Bajo", 10));
        network.agrearBombeo(new Turbina("007", Estado.Bien, "Bajo", 20));
        network.agrearBombeo(new Turbina("008", Estado.Mal, "Bajo", 15));
        network.agrearBombeo(new Turbina("009", Estado.Bien, "Bajo", 35));
        network.agrearBombeo(new Turbina("010", Estado.Bien, "Bajo", 25));



        //Metodos
        network.informaciónEstado(Abasto.Desalinizado);
        network.mostrarTanquesPorMaterial();
        network.mostrarCisternasPorClasificacion();
        network.mostrarCantidades();
        network.mostrarMejoresBombeos();
        network.mostrarTiempoPromedioBombeoBuenEstado();
        network.mostrarEstadoTurbinaMayorFuerza();
        Fichero.guardarInformacionEstado(network, "verificar.dat", Abasto.Manantial);
        Fichero.guardarInformacionCisternas(network, Forma.Cilindrica, 2, "cisternas.dat");
    }
}
