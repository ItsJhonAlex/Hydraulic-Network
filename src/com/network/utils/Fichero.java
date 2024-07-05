package com.network.utils;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import com.network.enums.Abasto;
import com.network.enums.Forma;
import com.network.service.Network;

public class Fichero {
    public static void guardarInformacionEstado(Network network, String nombreArchivo, Abasto tipoAbastoUsuario) {
        // Crear un archivo para guardar la información
        try (PrintWriter out = new PrintWriter(new FileWriter(nombreArchivo))) {
            // Guardar la salida original de la consola
            PrintStream originalOut = System.out;
            // Cambiar la salida estándar a nuestro archivo
            System.setOut(new PrintStream(new FileOutputStream(nombreArchivo)));
            
            // Llamar al método que imprime la información con el tipo de abasto
            network.informaciónEstado(tipoAbastoUsuario);
            
            // Restaurar la salida estándar a la consola
            System.setOut(originalOut);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error al guardar el archivo: " + e.getMessage());
        }
    }

    public static void guardarInformacionCisternas(Network network, Forma formaEspecifica, int cantidadCompartimentos, String nombreArchivo) {
        double capacidadSimples = network.calcularCapacidadCisternasSimples(formaEspecifica);
        double capacidadCompuestas = network.calcularCapacidadCisternasCompuestas(cantidadCompartimentos);
        double capacidadTotal = network.calcularCapacidadCisternasSimples(formaEspecifica) + network.calcularCapacidadCisternasCompuestas(cantidadCompartimentos);

        String informacion = "Capacidad total de Cisternas Simples: " + capacidadSimples + "L\n" +
                            "Cantidad total de Cisternas Compuestas: " + capacidadCompuestas + "L\n" + 
                            "Capacidad total de Cisternas: " + capacidadTotal + "L\n";

        guardarEnArchivo(informacion, nombreArchivo);
    }

    private static void guardarEnArchivo(String texto, String nombreArchivo) {
        try (PrintWriter out = new PrintWriter(new FileWriter(nombreArchivo))) {
            out.println(texto);
        } catch (IOException e) {
            System.out.println("Error al guardar el archivo: " + e.getMessage());
        }
    }


    public static void mostrarContenidoDeArchivo(String nombreArchivo) {
        List<String> lineas;
        Path path = Paths.get(nombreArchivo);
        try {
            // Leer todas las líneas del archivo y agregarlas a la lista
            lineas = Files.readAllLines(path);
            // Mostrar cada línea en la consola
            for (String linea : lineas) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}

