package org.mvallesg.optional.ejemplo;

import org.mvallesg.optional.ejemplo.models.Computador;
import org.mvallesg.optional.ejemplo.repositorio.ComputadorRepositorio;
import org.mvallesg.optional.ejemplo.repositorio.Repositorio;

public class EjemploRepositorioMetodosOrElse {
    public static void main(String[] args) {

        Repositorio<Computador> repositorio = new ComputadorRepositorio();

        Computador defecto = new Computador("HP Omen", "LA0001");
        Computador pc = repositorio.filtrar("asus rog").orElse(defecto);
        System.out.println(pc);
    }
}