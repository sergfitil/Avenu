package collection;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.SortedSet;

public class Main3 {
    public static void main(String[] args) {
        RealSetUtils realSetUtils = new RealSetUtils();
        Set<Integer> customOrderSet = realSetUtils.customOrderSet(2, 4, 6, 8, 9);
        System.out.println(customOrderSet);
        LinkedList<Integer> integers = new LinkedList<>();

        integers.add(2);
        integers.add(3);
        integers.add(5);
        integers.add(7);
        integers.add(9);

        HashSet<String> strings = new HashSet<>();

        strings.add("hvugi");
        strings.add("asdiug");
        strings.add("kpomkn");
        strings.add("zxcmlpmk");
        strings.add("wutfiu");

        SortedSet<String> result = realSetUtils.orderedSet(integers,strings);
        System.out.println(result);


    }
}
