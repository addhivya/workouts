package Assignment5;

public class Candy extends DessertItem {
    float weight;
    int price;

    public Candy(String name, float weight, int priceperpound) {
        super(name);
        this.weight = weight;
        this.price = priceperpound;
    }

    public int getcost() {
        return Math.round(this.price * this.weight);
    }

    public String toString() {
        String header = String.valueOf(weight + " lbs. @" + price * 0.01 + " /lb.\n");
        return header + super.toString();
    }
}
