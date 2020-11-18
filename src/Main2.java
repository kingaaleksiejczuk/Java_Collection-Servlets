import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Main2 {
    public static void main(String[] args) {

        List<Integer> elements = new ArrayList<>();

        for(int i = 0; i <= 30; i++){
            elements.add(i);
        }
        List<Integer> removedValue = removeDivider(elements, 2);
        for(Integer remInt : removedValue ){
            System.out.print(remInt + ",");
        }

    }
//napisz metodę public static List<Integer> removeDivider (List<Integer> list, int divider),
// która usunie z listy wszystkie elementy podzielne przez divider, a następnie zwróci tak przetworzoną listę.


    public static List<Integer> removeDivider (List<Integer> list, int divider){
        for(int i = 0; i < list.size(); i++){
            Integer value = list.get(i);
            if(value % divider == 0){
                list.remove(value);
            }
        }
        return list;
    }
}
