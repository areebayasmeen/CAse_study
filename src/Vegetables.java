public class Vegetables extends Groceries {
    String vegetableName;

    public Vegetables(String name, int stock_quantity, int price, int expirationDate, String nutritional_values, String vegetableName) {
        super(name, stock_quantity, price, expirationDate, nutritional_values);
        this.vegetableName=vegetableName;
    }

    @Override
    public String toString() {
        return "Vegetables{" +
                "vegetableName='" + vegetableName + '\'' +
                ", expirationDate=" + expirationDate +
                ", nutritional_values='" + nutritional_values + '\'' +
                ", price=" + price +
                ", name='" + name + '\'' +
                ", stock_quantity=" + stock_quantity +
                ", taxation_specifics='" + taxation_specifics + '\'' +
                '}';
    }
}
