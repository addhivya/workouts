package Assignment5;

public class Juice extends DessertItem{

    int litter;
    int price;

    public Juice(String name, int litter, int price) {
        super(name);
        this.litter = litter;
        this.price = price;
    }

    @Override
    public int getcost() {
        return litter*price;
    }
}
