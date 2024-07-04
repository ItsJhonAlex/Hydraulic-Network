package com.network.main;

import java.io.IOException;

import com.network.data.deposito.Cisterna;
import com.network.data.deposito.Tanque;
import com.network.enums.Clasificacion;
import com.network.enums.Estado;
import com.network.enums.Forma;
import com.network.enums.Material;
import com.network.service.Network;
import com.network.utils.Fichero;

public class Main {
    public static void main(String[] args) throws IOException {
        Network network = new Network();

        network.agregarDeposito(new Tanque(001, 50, Estado.Bien, "Directo", Material.Fibrocemento));
        network.agregarDeposito(new Cisterna(002, 100, Estado.Bien, "Gravedad", Clasificacion.Simple, 2, Forma.Cilindrica));
        network.agregarDeposito(new Cisterna(003, 150, Estado.Mal, "Presion", Clasificacion.Compuesta, 6, Forma.Cilindrica));
        
        Fichero.guardarInformacionEnArchivo(network, "verificar.dat");
        Fichero.mostrarContenidoDeArchivo("verificar.dat");
        
        
        
        /*List<String> lineas = Fichero.leerContenidoDeArchivo("verificar.dat");
        // Mostrar cada línea en la consola
        for (String linea : lineas) {
            System.out.println(linea);
        }*/

        
        /*String contenido = Fichero.leerContenidoDeArchivo("Verificar.dat");
        System.out.println(contenido);*/



    }
}
