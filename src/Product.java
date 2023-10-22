public class Product {
    int price;
    String name;
    int stock_quantity;
    String taxation_specifics;
    @Override
    public String toString() {
        return "Product: " + name + ", Price: " + price;}

}
