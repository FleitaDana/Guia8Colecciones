package Guia8.Ejercicio5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Scanner;

public class CountryServices {

    private HashSet<Country> countries;
    private Scanner read;

    public CountryServices() {
        this.countries = new HashSet<>();
        this.read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
    }

    public void principal() {
        String opc;
        do {
            requestData();
            System.out.println("Desea agregar otro pais? (S/N)");
            opc = read.next();
            while (!opc.equalsIgnoreCase("S") && !opc.equalsIgnoreCase("N")) {
                System.out.println("ERROR ingrese S o N");
                opc = read.next();
            }
        } while (!opc.equalsIgnoreCase("N"));
        showCountries();
    }

    public void requestData() {
        System.out.println("ingrese nombre del pais");
        String name = read.next();
        createCountry(name);
    }

    public void createCountry(String name) {
        Country country = new Country(name);
        addCountry(country);
    }

    public void addCountry(Country country) {
        countries.add(country);
    }

    public void removeCountry() {
        boolean flag = false;
        System.out.println("ingrese pais a borrar");
        String deleteName = read.next();
        Iterator<Country> iterator = countries.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getName().equalsIgnoreCase(deleteName)) {
                iterator.remove();
                flag = true;
            }

        }
        if (flag) {
            System.out.println("El paise se encontro y fue removido");
        } else {
            System.out.println("El pais no se encontro");
        }

    }

    public void showCountries() {
        for (Country country : countries) {
            System.out.println(country);
        }
    }

    public void orderCountries() {
        ArrayList<Country> arraylist = new ArrayList(this.countries);

        Collections.sort(arraylist);
        // HashSet<String> c=new HashSet(arraylist);
        for (Country s : arraylist) {
            System.out.println(s);
        }
    }
}
