package lessen14;

import java.util.HashSet;

public class Main3 {
    public static void main(String[] args) {
        HashSet<String> strings= new HashSet<>();
        strings.add("qqqqqq");
        strings.add("hhhhh");
        strings.add("rrrrrr");
        strings.add("cccccc");

        for (String s:strings){
            System.out.println(s);
        }
    }
}
