package collection2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main2 {
    public static void main(String[] args) {
        ArrayList<Integer> nomber=new ArrayList<>();
        nomber.add(11);
        nomber.add(7);
        nomber.add(6);
        nomber.add(8);
        System.out.println(nomber);
        Collections.sort(nomber);
        System.out.println(nomber);
        Collections.sort(nomber, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;
            }
        });
        System.out.println(nomber);
    }
}
