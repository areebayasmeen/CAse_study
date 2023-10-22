public class Fruits extends Groceries{
    String fruitNAme;
    public Fruits(String name, int stock_quantity, int price, int expirationDate, String nutritional_values,String fruitNAme) {
        super(name, stock_quantity, price, expirationDate, nutritional_values);
        this.fruitNAme=fruitNAme;
    }

    @Override
    public String toString() {
        return "Fruits{" +
                "fruitNAme='" + fruitNAme + '\'' +
                ", expirationDate=" + expirationDate +
                ", nutritional_values='" + nutritional_values + '\'' +
                ", price=" + price +
                ", name='" + name + '\'' +
                ", stock_quantity=" + stock_quantity +
                ", taxation_specifics='" + taxation_specifics + '\'' +
                '}';
    }
}
