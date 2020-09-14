package collection;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        Long startTime1=System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            arrayList.add(i);

        }
        Long endTime1=System.currentTimeMillis();
        System.out.println("ArrayList add:"+(endTime1-startTime1));


        Long startTime2=System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            linkedList.add(i);

        }
        Long endTime2=System.currentTimeMillis();
        System.out.println("LinkedList add:"+(endTime2-startTime2));


        Long startTime3=System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            arrayList.get(i);

        }
        Long endTime3=System.currentTimeMillis();
        System.out.println("ArrayList get:"+(endTime3-startTime3));

        Long startTime4=System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            linkedList.get(i);

        }
        Long endTime4=System.currentTimeMillis();
        System.out.println("LinkedList get:"+(endTime4-startTime4));
    }

}
