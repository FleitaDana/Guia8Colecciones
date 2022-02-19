package Guia8.Ejercicio5;



public class Main {

    public static void main(String[] args) {
        CountryServices countryServices=new CountryServices();
        countryServices.principal();
        countryServices.removeCountry();
        System.out.println("los paises oredenados alfabeticamente:");
        countryServices.orderCountries();
    }
    
}
