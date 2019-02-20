package Assignment5;

public abstract class DessertItem {
    String name;

    public DessertItem(String name)
    {
        this.name=name;
    }

    public final String getName()
    {
        return this.name;
    }

    public String toString()
    {
        String name = DessertShoppee.convertStringBasedOnSize(this.getName());
        String price = DessertShoppee.convertBasedOnWidth(name, DessertShoppee.cents2dollarsAndCentsmethod(this.getcost()));
        return name + price;
    }

    public abstract int getcost();

}
