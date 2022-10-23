package org.mvallesg.optional.ejemplo;

import org.mvallesg.optional.ejemplo.models.Computador;
import org.mvallesg.optional.ejemplo.repositorio.ComputadorRepositorio;
import org.mvallesg.optional.ejemplo.repositorio.Repositorio;

public class EjemploRepositorioMetodosOrElse {
    public static void main(String[] args) {

        Repositorio<Computador> repositorio = new ComputadorRepositorio();

        repositorio.filtrar("asus rog").ifPresentOrElse(pc -> System.out.println(pc.toString()), () -> System.out.println("No se encontró."));

        //Optional<Computador> pc = repositorio.filtrar("asus");

        /*
        if(pc.isPresent()){
            System.out.println(pc.get().toString());
        } else{
            System.out.println("No se encontró");
        }*/
    }
}
