package org.mvallesg.optional.ejemplo.repositorio;

import org.mvallesg.optional.ejemplo.models.Computador;
import org.mvallesg.optional.ejemplo.models.Fabricante;
import org.mvallesg.optional.ejemplo.models.Procesador;

import java.util.*;

public class ComputadorRepositorio implements Repositorio<Computador>{

    private List<Computador> dataSource;

    public ComputadorRepositorio() {
        dataSource = new ArrayList<>();
        Procesador procesador = new Procesador("I9-9880H", new Fabricante("Intel"));
        Computador asus = new Computador("Asus ROG", "Strix G512");
        asus.setProcesador(procesador);
        dataSource.add(asus);
        dataSource.add(new Computador("MacBook Pro", "MVVK2CI"));
    }

    @Override
    public Optional<Computador> filtrar(String nombre) {
        /*
        for(Computador c: dataSource){
            if(c.getNombre().equalsIgnoreCase(nombre)){
                return Optional.of(c);
            }
        }
        return Optional.empty();
        */
        return dataSource.stream()
                .filter(pc -> pc.getNombre().equalsIgnoreCase(nombre))
                .findFirst();
    }
}
