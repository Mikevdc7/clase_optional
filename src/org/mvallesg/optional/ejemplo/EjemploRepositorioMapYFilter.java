package org.mvallesg.optional.ejemplo;

import org.mvallesg.optional.ejemplo.models.Computador;
import org.mvallesg.optional.ejemplo.models.Fabricante;
import org.mvallesg.optional.ejemplo.models.Procesador;
import org.mvallesg.optional.ejemplo.repositorio.ComputadorRepositorio;
import org.mvallesg.optional.ejemplo.repositorio.Repositorio;

import java.util.NoSuchElementException;

public class EjemploRepositorioMapYFilter {
    public static void main(String[] args) {

        Repositorio<Computador> repositorio = new ComputadorRepositorio();

        /*
        Si lo que se devuelve en map()/flatMap() es un Optional, se usa flatMap(), si es un objeto común y corriente,
        se usa map(). Es simiar a lo que ocurre con stream, con el flatMap se aplana a una
        sola salida.
         */

        String f = repositorio.filtrar("asus rog")
                .flatMap(Computador::getProcesador)
                .flatMap(Procesador::getFabricante)
                .filter(fabricante -> "intel".equalsIgnoreCase(fabricante.getNombre()))
                .map(Fabricante::getNombre)
                .orElse("Desconocido");
        System.out.println(f);
    }
}