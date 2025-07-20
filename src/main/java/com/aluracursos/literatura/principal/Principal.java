package com.aluracursos.literatura.principal;

import com.aluracursos.literatura.model.Datos;
import com.aluracursos.literatura.service.ConsumoAPI;
import com.aluracursos.literatura.service.ConvierteDatos;

import java.util.Scanner;

public class Principal {
    private ConsumoAPI consumoAPI = new ConsumoAPI();
    private ConvierteDatos conversor = new ConvierteDatos();
    private Scanner teclado = new Scanner(System.in);

    public void muestraElMenu() {

        //var json = ConsumoAPI.obtenerDatos("https://gutendex.com/books/");
        var json = consumoAPI.obtenerDatos("https://gutendex.com/books/");

        System.out.println(json);

        var datos = conversor.obtenerDatos(json, Datos.class);
        System.out.println(datos);

    }
}
