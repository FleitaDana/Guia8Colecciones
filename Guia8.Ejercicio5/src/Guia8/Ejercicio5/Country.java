package Guia8.Ejercicio5;



public class Country implements Comparable<Country>{
    private String name;

    public Country() {
    }

    public Country(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    @Override
    public String toString() {
        return "Country" + " name= " + name ;
    }

    @Override
    public int compareTo(Country t) {
        return name.compareTo(t.name);
    }
    
}
