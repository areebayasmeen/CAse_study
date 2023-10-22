public class Table extends Furniture{
    String colorOfTable;
    public Table(String name, int stock_quantity, int price, int dimensions, String material,String colorOfTable) {
        super(name, stock_quantity, price, dimensions, material);
        this.colorOfTable=colorOfTable;
    }

    @Override
    public String toString() {
        return "Table{" +
                "colorOfTable='" + colorOfTable + '\'' +
                ", material='" + material + '\'' +
                ", dimensions=" + dimensions +
                ", price=" + price +
                ", name='" + name + '\'' +
                ", stock_quantity=" + stock_quantity +
                ", taxation_specifics='" + taxation_specifics + '\'' +
                '}';
    }
}
