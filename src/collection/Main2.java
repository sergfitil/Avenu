package collection;


import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Set;

public class Main2 {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(2);
        a.add(5);
        a.add(8);
        a.add(7);
        a.add(4);

        LinkedList<Integer> b = new LinkedList<>();
        b.add(3);
        b.add(6);
        b.add(9);
        b.add(11);
        b.add(5);

        RealCollecnionUtils utilsImpl = new RealCollecnionUtils();
        Collection<Integer> union = utilsImpl.union(a, b);
        System.out.println("Объеденненые коллекции с дубликатами " +union);
        Collection<Integer> crossingDouble = utilsImpl.intersection(a,b);
        System.out.println("Пересечение коллекций с дубликатами " +crossingDouble);
        Set<Integer> unionNotDouble= utilsImpl.unionWithoutDuplicate(a,b);
        System.out.println("Объединение коллекций без дубликатов " +unionNotDouble);
        Set<Integer> crossingNotDouble=utilsImpl.intersectionWithoutDuplicate(a,b);
        System.out.println("Пересечение коллекций без дубликатов " +crossingNotDouble);
        Collection<Integer> diff =utilsImpl.difference(a,b);
        System.out.println("Разность коллекций " +diff);

    }
}
