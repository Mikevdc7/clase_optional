package org.mvallesg.optional.ejemplo.repositorio;

import org.mvallesg.optional.ejemplo.models.Computador;

import java.util.Optional;

public interface Repositorio<T> {
    Optional<Computador> filtrar(String nombre);
}