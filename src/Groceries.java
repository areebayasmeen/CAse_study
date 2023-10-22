public class Groceries extends Product{
    int expirationDate;
    String  nutritional_values;
    public Groceries(String name,int stock_quantity,int price,int expirationDate,String nutritional_values){

        this.price=price;
        this.name=name;
        this.stock_quantity=stock_quantity;
        this.expirationDate=expirationDate;
        this.nutritional_values=nutritional_values;

    }

    @Override
    public String toString() {
        return "Groceries{" +
                "expirationDate=" + expirationDate +
                ", nutritional_values='" + nutritional_values + '\'' +
                ", price=" + price +
                ", name='" + name + '\'' +
                ", stock_quantity=" + stock_quantity +
                ", taxation_specifics='" + taxation_specifics + '\'' +
                '}';
    }
}
