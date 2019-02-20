package Assignment5;

import java.util.Vector;

public class Checkout {
    float cost;

    Vector<DessertItem> vlist = new Vector<>();

    public void enterItem(DessertItem item) {
        vlist.add(item);
        cost = cost + item.getcost();
    }

    public void clear() {
        vlist.clear();
        cost = 0;
    }

    public int numberOfItems() {
        return vlist.size();
    }

    public int totalCost() {
        return (int) cost;
    }

    public int totalTax() {
        float tax = this.totalCost() / DessertShoppee.TAX_RATE;
        return (int) tax;
    }

    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append(DessertShoppee.printHeadingCentre());
        result.append("\n\n");

        for (int i = 0; i < vlist.size(); i++) {
            result.append(vlist.get(i));
            result.append("\n");
        }
        result.append("\n");
        String tax = DessertShoppee.cents2dollarsAndCentsmethod(this.totalTax());
        result.append("Tax" + DessertShoppee.convertBasedOnWidth("Tax", tax));
        String total = DessertShoppee.cents2dollarsAndCentsmethod(this.totalCost() + this.totalTax());
        result.append("\nTotal Cost" + DessertShoppee.convertBasedOnWidth("Total Cost", total));

        return result.toString();
    }
}
