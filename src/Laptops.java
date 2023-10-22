public class Laptops extends Electronic {
int ram;
    public Laptops(String name, int stock_quantity, int price, int power, int consumption, int warranty,int ram) {
        super(name, stock_quantity, price, power, consumption, warranty);
        this.ram=ram;
    }

    @Override
    public String toString() {
        return "Laptops{" +
                "ram=" + ram +
                ", power=" + power +
                ", consumption=" + consumption +
                ", warranty=" + warranty +
                ", price=" + price +
                ", name='" + name + '\'' +
                ", stock_quantity=" + stock_quantity +
                ", taxation_specifics='" + taxation_specifics + '\'' +
                '}';
    }
}
