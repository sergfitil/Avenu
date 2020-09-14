package lessen14;

import java.util.ArrayList;
import java.util.Iterator;

public class Main1 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(4);
        numbers.add(5);
        numbers.add(2);
        numbers.add(88);
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }

        for (Integer n : numbers) {
            System.out.println(n);
        }
//Итератор
        for(Iterator<Integer>iter=numbers.iterator();iter.hasNext();){
            System.out.println(iter.next());

        }
    }
}
