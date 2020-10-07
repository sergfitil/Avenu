package multyMap;

public class Main {
    public static void main(String[] args) {
        MultyMapImpl<String, Long> telefonnayaKniga = new MultyMapImpl<>();
        telefonnayaKniga.put("Вася", 89169074668L);
        telefonnayaKniga.put("Вася", 89171074668L);
        telefonnayaKniga.put("Петя", 89101074668L);
        telefonnayaKniga.put("Вася", 89121074668L);
        boolean result = telefonnayaKniga.containsValue(89171074668L);
        System.out.println(result);
    }
}
