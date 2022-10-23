package org.mvallesg.optional.ejemplo;

import org.mvallesg.optional.ejemplo.models.Computador;
import org.mvallesg.optional.ejemplo.repositorio.ComputadorRepositorio;
import org.mvallesg.optional.ejemplo.repositorio.Repositorio;

import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.zip.DataFormatException;

public class EjemploRepositorioMetodosOrElseThrow {
    public static void main(String[] args) {

        Repositorio<Computador> repositorio = new ComputadorRepositorio();

        Computador pc = repositorio.filtrar("asus rog").orElseThrow(IllegalStateException::new);
        System.out.println(pc);
        String archivo = "documento.pdf";
        String extension = Optional.ofNullable(archivo)
                .filter(arch -> arch.contains("."))
                .map(arch -> arch.substring(arch.lastIndexOf(".")+1))
                .orElseThrow(NoSuchElementException::new);
        System.out.println(extension);
    }
}