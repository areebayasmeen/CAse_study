public class Cupboards extends Furniture{
    String colorOfCupboard;
    public Cupboards(String name, int stock_quantity, int price, int dimensions, String material,String colorOfCupboard) {
        super(name, stock_quantity, price, dimensions, material);
        this.colorOfCupboard=colorOfCupboard;

    }

    @Override
    public String toString() {
        return "Cupbords{" +
                "colorOfCupboard='" + colorOfCupboard + '\'' +
                ", material='" + material + '\'' +
                ", dimensions=" + dimensions +
                ", price=" + price +
                ", name='" + name + '\'' +
                ", stock_quantity=" + stock_quantity +
                ", taxation_specifics='" + taxation_specifics + '\'' +
                '}';
    }
}
