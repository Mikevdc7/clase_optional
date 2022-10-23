package org.mvallesg.optional.ejemplo;

import org.mvallesg.optional.ejemplo.models.Computador;
import org.mvallesg.optional.ejemplo.repositorio.ComputadorRepositorio;
import org.mvallesg.optional.ejemplo.repositorio.Repositorio;

public class EjemploRepositorioMetodosOrElse {
    public static void main(String[] args) {

        /*
        Una diferencia entre el orElse() y el orElseGet(), es que, en orElse() tanto si el objeto se encuentra como si no,
        se crea el objeto por defecto que devolvería si no se encontrara; en cambio en orElseGet(), no.
        Por tanto, orElse() algunas veces va a ocupar recursos innecesariamente.
        Podemos resumir que el orElseGet() es mucho mejor que el orElse(), ya que nunca va a llamar al valor por defecto
        si no es necesario.
         */

        Repositorio<Computador> repositorio = new ComputadorRepositorio();

        //Computador defecto = new Computador("HP Omen", "LA0001");
        Computador pc = repositorio.filtrar("asus rog").orElse(valorDefecto());
        System.out.println(pc);

        pc = repositorio.filtrar("macbook pro").orElseGet(EjemploRepositorioMetodosOrElse::valorDefecto);

        System.out.println(pc);
    }

    public static Computador  valorDefecto(){
        System.out.println("Obteniendo el valor por defecto...");
        return new Computador("HP Omen", "LA0001");
    }
}