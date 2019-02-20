package Assignment5;

public class Icecream extends DessertItem {
    int price;
    String name;

    public Icecream(String name, int price) {
        super(name);
        this.price = price;
    }

    public int getcost() {
        return price;
    }


}
