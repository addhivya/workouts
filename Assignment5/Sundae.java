package Assignment5;

public class Sundae extends Icecream {
    String topname;
    int topprice;
    int price;
    int cost;

    public Sundae(String toppingname, int toppingprice, String name, int price) {
        super(name + " with " + toppingname, price);
        this.topname = toppingname;
        this.price = price;
        this.topprice = toppingprice;
    }

    public int getcost() {
        cost = (price + topprice);
        return cost;
    }


}
