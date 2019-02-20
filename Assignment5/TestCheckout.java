package Assignment5;

public class TestCheckout {

    public static void main(String[] args) {
        Checkout checkout = new Checkout();
        checkout.enterItem(new Candy("Peanut Butter Fudge", 2.25f, 399));
        checkout.enterItem(new Icecream("Vanilla Ice Cream", 105));
        checkout.enterItem(new Sundae("Choc. Chip Ice Cream", 145, "Hot Fudge Sundae", 50));
        checkout.enterItem(new Cookie("Oatmeal Raisin Cookies", 4, 399));
        checkout.enterItem(new Juice("Divya Check", 3, 50));

        System.out.println("Number of items: " + checkout.numberOfItems() + "\n");
        System.out.println("Total Cost: " + checkout.totalCost() + "\n");
        System.out.println("Total tax: " + checkout.totalTax() + "\n");
        System.out.println("Cost+tax: " + (checkout.totalCost() + checkout.totalTax()) + "\n");
        System.out.println(checkout);

        checkout.clear();
        System.out.println("\n");

        checkout.enterItem(new Icecream("Strawberry Ice Cream", 145));
        checkout.enterItem(new Sundae("Vanilla Ice Cream", 105, "Caramel", 50));
        checkout.enterItem(new Candy("Gummy Worms", 1.33f, 89));
        checkout.enterItem(new Cookie("Chocolate Chip Cookies", 4, 399));
        checkout.enterItem(new Candy("Salt Water Taffy", 1.5f, 209));
        checkout.enterItem(new Candy("Candy Corn", 3.0f, 109));

        System.out.println("\nNumber of items: " + checkout.numberOfItems() + "\n");
        System.out.println("Total cost: " + checkout.totalCost() + "\n");
        System.out.println("Total tax: " + checkout.totalTax() + "\n");
        System.out.println("Cost + Tax: " + (checkout.totalCost() + checkout.totalTax()) + "\n");
        System.out.println(checkout);
    }
}
