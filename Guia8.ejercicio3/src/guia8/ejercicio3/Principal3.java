
package guia8.ejercicio3;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

 /*Crear una clase llamada Alumno que mantenga información sobre las notas de
distintos alumnos. La clase Alumno tendrá como atributos, su nombre y una lista de
tipo Integer con sus 3 notas.
En el main deberemos tener un bucle que crea un objeto Alumno. Se pide toda la
información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
pregunta al usuario si quiere crear otro Alumno o no.
Después de ese bluce tendremos el siguiente método en la clase Alumno:
Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su
nota final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método.
Dentro del método se usará la lista notas para calcular el promedio final de alumno.
Siendo este promedio final, devuelto por el método y mostrado en el main.*/

public class Principal3 {

    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        
        alumnoService alumnoService1 = new alumnoService();
        String nombre;
        int nota1;
        int nota2;
        int nota3;
        
        
        
        do{
            System.out.println("Ingrese nombre del alumno");
            nombre = entrada.next();
            System.out.println("Ingrese nota1");
            nota1 = entrada.nextInt();
            System.out.println("Ingrese nota2");
            nota2 = entrada.nextInt();
            System.out.println("Ingrese nota3");
            nota3 = entrada.nextInt();
            alumnoService1.crearAlumno(nombre, nota1, nota2, nota3);
                    
        }while(true);
        
        
    }
    
}
