public class Furniture extends Product{
    String material;
    int dimensions;
    public Furniture(String name,int stock_quantity,int price,int dimensions,String material){

        this.price=price;
        this.name=name;
        this.stock_quantity=stock_quantity;
        this.dimensions=dimensions;
        this.material=material;

    }

    @Override
    public String toString() {
        return "Furniture{" +
                "material='" + material + '\'' +
                ", dimensions=" + dimensions +
                ", price=" + price +
                ", name='" + name + '\'' +
                ", stock_quantity=" + stock_quantity +
                ", taxation_specifics='" + taxation_specifics + '\'' +
                '}';
    }
}
