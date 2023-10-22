public class SmartPhone extends Electronic{
   boolean touchScreenInterface;

    public SmartPhone(String name, int stock_quantity, int price, int power, int consumption, int warranty,boolean touchScreenInterface) {
        super(name, stock_quantity, price, power, consumption, warranty);
        this.touchScreenInterface=touchScreenInterface;
    }



    @Override
    public String toString() {
        return "SmartPhone{" +
                "touchScreenInterface=" + touchScreenInterface +
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

