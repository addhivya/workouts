package Assignment5;

public class Cookie extends DessertItem {
    int number;
    int cost;
    float price;

    public Cookie(String name, int number, float priceperdozen) {
        super(name);
        this.number = number;
        this.price = priceperdozen;
        cost = Math.round(number * (price / 12));
    }

    public int getcost() {
        return cost;
    }

    public String toString() {
        String header = String.valueOf(this.number + "@ " + price * 0.01 + " /dz \n");
        return header + super.toString();
    }

    // 2 Concepts

    // High Cohession -> Class does only its work.
    // Low coupling -> Depence coupling.
}
