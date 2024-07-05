package com.network.main;

import java.io.IOException;

import com.network.data.deposito.Cisterna;
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
        network.agregarDeposito(new Cisterna("007", 100, Estado.Regular, Abasto.Manantial, Clasificacion.Compuesta, 2, Forma.Cilindrica));
        network.agregarDeposito(new Cisterna("008", 150, Estado.Mal, Abasto.Manantial, Clasificacion.Compuesta, 6, Forma.Cilindrica));
        network.agregarDeposito(new Cisterna("009", 100, Estado.Regular, Abasto.Reciclada, Clasificacion.Simple, 2, Forma.Cilindrica));
        network.agregarDeposito(new Cisterna("010", 100, Estado.Regular, Abasto.Desalinizado, Clasificacion.Compuesta, 2, Forma.Cilindrica));
        network.agregarDeposito(new Cisterna("011", 100, Estado.Regular, Abasto.Municipal, Clasificacion.Simple, 2, Forma.Cilindrica));
        network.agregarDeposito(new Cisterna("012", 100, Estado.Regular, Abasto.Reciclada, Clasificacion.Compuesta, 2, Forma.Cilindrica));
        network.agregarDeposito(new Cisterna("013", 100, Estado.Regular, Abasto.Desalinizado, Clasificacion.Simple, 2, Forma.Cilindrica));
        network.agregarDeposito(new Cisterna("014", 100, Estado.Regular, Abasto.Municipal, Clasificacion.Simple, 2, Forma.Cilindrica));
        network.agregarDeposito(new Cisterna("015", 100, Estado.Regular, Abasto.Manantial, Clasificacion.Simple, 2, Forma.Cilindrica));

        //Bombas
        network.agrearBombeo(new Bomba("001", Estado.Bien, "Alto", 10));
        network.agrearBombeo(new Turbina("002", Estado.Bien, "Bajo", 25));


        //Metodos
        network.mostrarTanquesPorMaterial();
        network.mostrarCisternasPorClasificacion();
        network.mostrarCantidades();
        network.mostrarMejoresBombeos();
        network.mostrarTiempoPromedioBombeoBuenEstado();
        network.mostrarEstadoTurbinaMayorFuerza();
        Fichero.guardarInformacionEstado(network, "verificar.dat", Abasto.Manantial);
        Fichero.guardarCapacidadCisternas(network, 2, Forma.Cilindrica, "cisternas.dat");
    }
}
