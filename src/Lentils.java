public class Lentils extends Groceries{
    String lentilType;

    public Lentils(String name, int stock_quantity, int price, int expirationDate, String nutritional_values,String lentilType) {
        super(name, stock_quantity, price, expirationDate, nutritional_values);
        this.lentilType=lentilType;
    }

    @Override
    public String toString() {
        return "Lentils{" +
                "lentilType='" + lentilType + '\'' +
                ", expirationDate=" + expirationDate +
                ", nutritional_values='" + nutritional_values + '\'' +
                ", price=" + price +
                ", name='" + name + '\'' +
                ", stock_quantity=" + stock_quantity +
                ", taxation_specifics='" + taxation_specifics + '\'' +
                '}';
    }
}
