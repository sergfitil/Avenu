package collection;

import java.util.Iterator;
import java.util.LinkedList;

public class Main1 {
    public static void main(String[] args) {
        LinkedList<String> strings=new LinkedList<>();
        strings.add("vhgch");
        strings.add("wwww");
        strings.add("gggg");
        strings.add("qqqqq");
        strings.add("zzzz");
        System.out.println(strings);
        //1 стандартный for
        for(int i = 0; i<strings.size();i++){
            System.out.println(strings.get(i));

        }

        // 2 foreach
        for(String s:strings){
            System.out.println(s);
        }

        // 3 итератор
        for (Iterator<String> iterator=strings.iterator();iterator.hasNext();){
            System.out.println(iterator.next());

        }
    }
}
