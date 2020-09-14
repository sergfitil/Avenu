package lessen14;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> texts = new ArrayList<>();
        texts.add("111");
        texts.add("222");
        texts.add("333");
        texts.add("444");
        texts.add("555");
        texts.set(0,"77777");
        texts.add(0,"8888");
        texts.remove("222");
        System.out.println(texts);
    }
}
