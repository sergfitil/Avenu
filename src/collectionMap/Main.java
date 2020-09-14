package collectionMap;

public class Main {
    public static void main(String[] args) {
        Holodilnic holodilnic = new Holodilnic();

        holodilnic.putProduct("Яблоко", 2);
        holodilnic.putProduct("Груша", 5);
        holodilnic.putProduct("Слива", 3);
        holodilnic.putProduct("Яблоко", 6);

        holodilnic.getProdukt("Яблоко", 2);

        holodilnic.printAllProducts();

        holodilnic.printAllNetto();

        holodilnic.getProductsInOrder();

        holodilnic.productWithMaxAmount();

        holodilnic.productWithMinAmount();

        holodilnic.productAmount("Груша");

        holodilnic.getMinSet(8);

        holodilnic.productsByValue();

    }
}
