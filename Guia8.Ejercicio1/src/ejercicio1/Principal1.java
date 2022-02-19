package ejercicio1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.Scanner;

/*Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String.
El programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si
decide salir, se mostrará todos los perros guardados en el ArrayList.*/
public class Principal1 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);

        boolean salir = false;

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

    }

}
