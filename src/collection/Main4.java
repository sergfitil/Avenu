package collection;

import java.util.ArrayList;
import java.util.List;

public class Main4 {
    public static void main(String[] args) {
        RealListUtils realListUtils = new RealListUtils();
        List<String> list = realListUtils.asList("Привет мир", "Всем привет", "Настала осень");
        System.out.println(list);
        ArrayList<Double> one = new ArrayList<>();
        one.add(2.3);
        one.add(3.5);
        one.add(4.3);
        one.add(7.2);
        one.add(5.1);

        List<Double> revers = realListUtils.sortedList(one);
        System.out.println(revers);

    }
}
