package Utilidades;

import Guia8.Ejercicio4.Pelicula;
import java.util.Comparator;

public class ComparadorDirectorAscen implements Comparator<Pelicula> {

    @Override
    public int compare(Pelicula t, Pelicula t1) {
        return t.getDirector().compareTo(t1.getDirector());
    }
    
}
