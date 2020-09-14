package collectionMap;

import java.util.*;
import java.util.stream.Collectors;

public class Holodilnic implements IHolodilnik {
    private HashMap<String, Integer> products = new HashMap<>();

    public void putProduct(String product, int value) {
        if (products.containsKey(product)) {
            int currentVallue = products.get(product);
            products.put(product, value + currentVallue);

        } else {
            products.put(product, value);
        }
    }

    public void getProdukt(String product, int vallue) {
        if (products.containsKey(product)) {
            if (vallue > products.get(product)) {
                System.out.println("В холодильнике не хватает " + product);
            } else {
                int currentVallue = products.get(product);
                products.put(product, currentVallue - vallue);

            }

        } else {
            System.out.println("Этого в холодильнике нет");
        }

    }

    public void printAllProducts() {
        for (String key : products.keySet()) {
            System.out.println(key + " - " + products.get(key) + "кг");
        }
    }

    public void printAllNetto() {
        int netto = 0;
        for (String key : products.keySet()) {
            netto = netto + products.get(key);
        }
        System.out.println("Вес всех продуктов в холодильнике - " + netto + "кг");
    }

    @Override
    public void getProductsInOrder() {
        TreeMap<String, Integer> fruits = new TreeMap<>(products);
        fruits.putAll(products);
        System.out.println("Продукты по алфавиту -" + fruits);

    }

    @Override
    public void productWithMaxAmount() {
        int maxWeightProdukt = (Collections.max(products.values()));
        for (Map.Entry<String, Integer> entry : products.entrySet()) {
            if (entry.getValue() == maxWeightProdukt) {
                System.out.println("Больше всего в холодильнике - " + entry.getKey());
            }
        }
    }

    @Override
    public void productWithMinAmount() {
        int minWeightProdukt = (Collections.min(products.values()));
        for (Map.Entry<String, Integer> entry : products.entrySet()) {
            if (entry.getValue() == minWeightProdukt) {
                System.out.println("Меньше всего в холодильнике - " + entry.getKey());
            }
        }

    }

    @Override
    public void productAmount(String s) {
        if (products.containsKey(s)) {
            Integer value = products.get(s);
            System.out.println("Выбран продукт - " + s + " в холодильнике " + value + "кг");
        }
    }

    @Override
    public void getMinSet(int n) {
        for (Map.Entry<String, Integer> entry : products.entrySet()) {
            if (entry.getValue() <= n) {
                System.out.println(entry.getKey() + " - " + entry.getValue());
            }
        }
    }

    public void productsByValue() {
        List<Map.Entry<String, Integer>> entryList = new ArrayList<Map.Entry<String, Integer>>(products.entrySet());
        Collections.sort(entryList, new Comparator<Map.Entry<String, Integer>>() {

            @Override
            public int compare(Map.Entry<String, Integer> obj1, Map.Entry<String, Integer> obj2) {
                return obj1.getValue().compareTo(obj2.getValue());
            }
        });
        products.clear();
        for (Map.Entry<String, Integer> entry : entryList) {
            products.put(entry.getKey(), entry.getValue());
            System.out.println(entry.getKey() + " -  " + entry.getValue());
        }
    }
}
