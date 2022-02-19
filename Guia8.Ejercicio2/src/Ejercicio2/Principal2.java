package Ejercicio2;


/*Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le
pedirá un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista.
Si el perro está en la lista, se eliminará el perro que ingresó el usuario y se mostrará
la lista ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y
se mostrará la lista ordenada.*/
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.Scanner;

public class Principal2 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);

        boolean salir = false;
        boolean seEncontro = false;

        ArrayList<String> raza = new ArrayList<>();

        do {
            System.out.println("Ingrese raza de perro");
            String razas = entrada.next();
            raza.add(razas);

            System.out.println("Desea salir? S/N");
            String decision = entrada.next();

            if (decision.equalsIgnoreCase("S")) {
                salir = true;

                System.out.println();
                System.out.println("LAS RAZAS DE PERROS INGRESADAS FUERON:");

                Iterator<String> iterator = raza.iterator();
                while (iterator.hasNext()) {
                    System.out.println(iterator.next());
                }
            }
        } while (salir != true);

        System.out.println();
        
        System.out.println("Ingrese una raza para buscar en la lista anteriormente creada y luego eliminarla");
        String buscarEnLista = entrada.next();

        Iterator<String> iterator = raza.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().equalsIgnoreCase(buscarEnLista)) {
                iterator.remove();
                seEncontro = true;
            }
        }

        System.out.println();
        if (seEncontro = true) {
            System.out.println("La raza ingresada se encuentra en la lista anteriormente creada y sera eliminada");
        } else {
            System.out.println("La raza ingresada no se encuentra en la lista anteriormente creada");
        }

        System.out.println();
        System.out.println("LAS RAZAS DE PERROS INCLUIDAS EN EL ArrayList SON:");

        iterator = raza.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
