
package guia8.ejercicio3;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;


public class alumnoService {
    
    private ArrayList<Alumno> alumnos;
    private Scanner entrada;

    public alumnoService() {
        this.alumnos = new ArrayList<>();
        this.entrada= new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
    }
    
    public void crearAlumno(String nombre, int nota1, int nota2, int nota3) {
        
        Alumno alumno1 = new Alumno();
        ArrayList <Integer> nota = new ArrayList<>();
        
        alumno1.setNombre(nombre);
        nota.add(nota1);
        nota.add(nota2);
        nota.add(nota3);
        alumno1.setNota(nota);
        
        agregarAlumno(alumno1);
        
    }
    
    public void agregarAlumno(Alumno alumno1) {
       this.alumnos.add(alumno1);
    }
    
    public Alumno buscarAlumno(String nombre) {
        
        Alumno alumnoRetorno = null;
        
        for (Alumno alumno : alumnos) {
            if (alumno.getNombre().equalsIgnoreCase(nombre)) {
                alumnoRetorno= alumno;
                break;
            }
 
        }
      return alumnoRetorno;
    } 
    
    public void ingresarNombreYNotas() {
        
    }
    
    public void ingresarNombre() {
        
        String nombre = this.entrada.next();
        Alumno alumno1 = buscarAlumno(nombre);
         
        if (alumno1!=null) {                  
            System.out.println(obtenerNotaFinal(alumno1));
        } else {
            System.out.println("No se encuentra al alumno ingresado");
        }

    }
    
    public double obtenerNotaFinal(Alumno alumno1) {
        
        int acumulador = 0;
        
        for (Integer nota : alumno1.getNota()) {
            acumulador += nota;      
        }
        
        return (double) acumulador / alumno1.getNota().size();
    }
    
    
}
