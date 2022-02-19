package Utilidades;

import Guia8.Ejercicio4.Pelicula;
import java.util.Comparator;

public class ComparadorDuracionDesc implements Comparator<Pelicula>{

    @Override
    public int compare(Pelicula t, Pelicula t1) {
        return t1.getDuracion().compareTo(t.getDuracion());
    }
    
}
