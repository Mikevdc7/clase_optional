package org.mvallesg.optional.ejemplo;

import org.w3c.dom.ls.LSOutput;

import java.util.Optional;

public class EjemploOptional {
    public static void main(String[] args) {

        /*
        La clase Optional se añade en Java 8 para manejar posibles nulos en los parámetros.
        Así, no hay que preocuparse por si un valor es nulo y que de NullPointerException.
         */

        String nombre = "Mike";
        Optional<String> opt = Optional.of(nombre);
        System.out.println("opt = " + opt);
        System.out.println(opt.isPresent());
        if(opt.isPresent()){
            System.out.println("Hola " + opt.get());
        }

        System.out.println(opt.isEmpty());
        opt.ifPresent(valor -> System.out.println("Hola " + valor));

        nombre = "A";
        opt = Optional.ofNullable(nombre);
        System.out.println("opt = " + opt);
        System.out.println(opt.isPresent());
        System.out.println(opt.isEmpty());
        opt.ifPresentOrElse(valor -> System.out.println("Hola " + valor),
                () -> System.out.println("No está presente"));

        Optional<String> optEmpty = Optional.empty();
        System.out.println("optEmpty = " + optEmpty);
        System.out.println(optEmpty.isPresent());
    }


}