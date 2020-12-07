package solid.core;

public class Item {
    private String code;
    private double price;
    private int count;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public double totalPrice(){
        return price * count;
    }

    @Override
    public String toString() {
        return "Item{" +
                "code='" + code + '\'' +
                ", price=" + price +
                ", count=" + count +
                ", total=" + totalPrice() +
                '}';
    }
}
