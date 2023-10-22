public class Chair extends Furniture{
    String colorOfCHair;
    public Chair(String name, int stock_quantity, int price, int dimensions, String material,String colorOfCHair) {
        super(name, stock_quantity, price, dimensions, material);
        this.colorOfCHair=colorOfCHair;
    }

    @Override
    public String toString() {
        return "Chair{" +
                "colorOfCHair='" + colorOfCHair + '\'' +
                ", material='" + material + '\'' +
                ", dimensions=" + dimensions +
                ", price=" + price +
                ", name='" + name + '\'' +
                ", stock_quantity=" + stock_quantity +
                ", taxation_specifics='" + taxation_specifics + '\'' +
                '}';
    }
}
