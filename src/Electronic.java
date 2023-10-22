public class Electronic extends Product{
    int power;
    int consumption;
    int warranty;
public Electronic(String name,int stock_quantity,int price,int power,int consumption,int warranty){

    this.price=price;
    this.name=name;
    this.stock_quantity=stock_quantity;
    this.power=power;
    this.consumption=consumption;
    this.warranty=warranty;

}

    @Override
    public String toString() {
        return "Electronic{" +
                "power=" + power +
                ", consumption=" + consumption +
                ", warranty=" + warranty +
                ", price=" + price +
                ", name='" + name + '\'' +
                ", stock_quantity=" + stock_quantity +
                ", taxation_specifics='" + taxation_specifics + '\'' +
                '}';
    }
}
