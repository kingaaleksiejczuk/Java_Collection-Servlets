package entity;

public class City {

    public String name;
    public int population;

    public City (String name, int population){
        this.name = name;
        this.population = population;
    }
    public String toString(){
        return "City name: " + name + ", " + "city population: " + population;
    }
}
