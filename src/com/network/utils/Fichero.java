package com.network.utils;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import com.network.service.Network;

public class Fichero {
    public static void guardarInformacionEstado(Network network, String nombreArchivo) {
        // Crear un archivo para guardar la información
        try (PrintWriter out = new PrintWriter(new FileWriter(nombreArchivo))) {
            // Guardar la salida original de la consola
            PrintStream originalOut = System.out;
            // Cambiar la salida estándar a nuestro archivo
            System.setOut(new PrintStream(new FileOutputStream(nombreArchivo)));
            
            // Llamar al método que imprime la información
            network.informaciónEstado();
            
            // Restaurar la salida estándar a la consola
            System.setOut(originalOut);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error al guardar el archivo.");
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
            System.out.println("Error al leer el archivo.");
        }
    }

    /*public static String leerContenidoDeArchivo(String nombreArchivo) {
        StringBuilder contenido = new StringBuilder();
        Path path = Paths.get(nombreArchivo);
        try {
            // Leer todas las líneas del archivo y agregarlas al StringBuilder
            Files.lines(path).forEach(contenido::append);
        } catch (IOException e) {
            e.printStackTrace();
            return "Error al leer el archivo.";
        }
        return contenido.toString();
    }*/

        /*public static List<String> leerContenidoDeArchivo(String nombreArchivo) {
        List<String> lineas = new ArrayList<>();
        Path path = Paths.get(nombreArchivo);
        try {
            // Leer todas las líneas del archivo y agregarlas a la lista
            lineas = Files.readAllLines(path);
        } catch (IOException e) {
            e.printStackTrace();
            return Arrays.asList("Error al leer el archivo.");
        }
        return lineas;
    }*/
}

