import entity.City;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Main3 {

    public static void main(String[] args) {

        List<City>list = initialize();
        System.out.println(list);
        System.out.println();

        System.out.println(sublist(list, 2, 5));
        System.out.println(reverse(list));

    }
    public static List<City> initialize(){

        List <City> listOfCity = new ArrayList<>();

        listOfCity.add(new City("Bialystok", 290000));
        listOfCity.add(new City("Warszawa", 1700000));
        listOfCity.add(new City("Wroclaw", 670000));
        listOfCity.add(new City("Poznan", 520000));
        listOfCity.add(new City("Krakow", 760000));

        return listOfCity;
    }

    public static List<City> sublist(List<City> list, int start, int end ){
        return list.subList(start, end);
    }

    public static List<City> reverse(List<City> list){

        List<City> newList = new ArrayList<>();
        ListIterator<City> iterator = list.listIterator(list.size());
        while(iterator.hasPrevious()){ //zwraca	wartość	true,jeżeli	kolekcja posiada wcześniejszy element
            newList.add(iterator.previous());
        }
        return newList;
    }
}
