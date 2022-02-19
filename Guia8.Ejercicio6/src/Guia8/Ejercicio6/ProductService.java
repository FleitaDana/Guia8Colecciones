package Guia8.Ejercicio6;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class ProductService {

    private HashMap<String, Integer> products;
    private Scanner read;

    public ProductService() {
        this.products = new HashMap();
        this.read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
    }

    public void principal() {
        int opt;
        do {
            System.out.println("------MENU-----");
            System.out.println("1-Agregar Producto");
            System.out.println("2-Modificar precio de producto");
            System.out.println("3-Eliminar un producto");
            System.out.println("4-Mostrar producto");
            System.out.println("5-SALIR");
            opt = read.nextInt();
            switch (opt) {
                case 1:
                    requestData();
                    break;
                case 2:
                    modifyPrice();
                    break;
                case 3:
                    deleteProduct();
                    break;
                case 4:
                    showProducts();
                    break;
                case 5:
                    System.out.println("BYE!");
                    break;
                default:
                    System.out.println("Opcion incorecta!");
            }
        } while (opt != 5);
    }

    public void requestData() {
        String opt;
        do {
            System.out.println("Ingrese nombre del producto");
            String name = read.next();
            System.out.println("Ingrese precio del producto");
            int price = read.nextInt();
            addProduct(name, price);
            System.out.println("Desea Agregar otro? (S/N)");
            opt = read.next();
            while (!opt.equalsIgnoreCase("S") && !opt.equalsIgnoreCase("N")) {
                System.out.println("ERROR S o N");
                opt = read.next();
            }
        } while (!opt.equalsIgnoreCase("N"));
    
    }

    public void addProduct(String name, int price) {

        products.put(name, price);
    }

    public void modifyPrice() {
        System.out.println("Ingrese nombre de producto");
        boolean flag = false;
        String nameToModify = read.next();
        for (Map.Entry<String, Integer> entry : products.entrySet()) {
            if (entry.getKey().equals(nameToModify)) {
                System.out.println("Ingrese nuevo precio");
                entry.setValue(read.nextInt());
                flag = true;
            }
        }
        if (!flag) {
            System.out.println("Producto no encontrado");
        } else {
            System.out.println("Precio modificado con exito");

        }
    }

    public void deleteProduct() {
        boolean flag = false;
        System.out.println("Ingrese porducto a eliminar");
        String productToDelete = read.next();
        if (products.containsKey(productToDelete)) {
            products.remove(productToDelete);
            flag = true;
        }
        if (flag) {
            System.out.println("Producto Eliminado con exito");
        } else {
            System.out.println("Producto no encontrado");
        }

    }

    public void showProducts() {
        for (Map.Entry<String, Integer> entry : products.entrySet()) {
            System.out.println(entry);
        }

    }
}
/*Se necesita una aplicación para una tienda en la cual queremos almacenar los
distintos productos que venderemos y el precio que tendrán. Además, se necesita
que la aplicación cuente con las funciones básicas.

Estas las realizaremos en el main. Como, introducir un elemento, modificar su precio,
eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
Realizar un menú para lograr todas las acciones previamente mencionadas.*/
