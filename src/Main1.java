import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Main1 {

    public static void main(String[] args) {

        List<Integer> elements = new ArrayList<>();

        //Dodaj do kolekcji 10 elementów od 10 do 19
        for(int i = 10; i <= 19; i++){
            elements.add(i);
        }

        //Wypisz elementy na konsoli używając pętli for.
        for(int i = 0; i < elements.size(); i++){
            System.out.println(elements.get(i));
        }

        //Wypisz elementy na konsoli używając iteratora i pętli while.
        ListIterator<Integer> list = elements.listIterator();
        while(list.hasNext()){
            Integer nextInt = list.next();
            System.out.println(nextInt);
        }

        //Wypisz na konsoli elementy używając iteratora i pętli for.
        for(ListIterator<Integer> listIterator = elements.listIterator(); listIterator.hasNext();){
            System.out.println(listIterator.next());
        }

        //Wypisz na konsoli elementy używając konstrukcji for-each.
        for(Integer val : elements){
            System.out.println(val);
        }

    }

}
