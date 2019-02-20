package Assignment6.Problem3;

public class Cat extends Pet implements Bordable {
    private String hairLength;

    public Cat(String name, String ownerName, String color, String hairLength) {
        super(name, ownerName, color);
        this.hairLength = hairLength;
    }

    public String getHairLength() {
        return this.hairLength;
    }

    /**
     * Method that returns a String that identifies the pet as Cat and returns a complete description of the cat,
     * including the values stored in the Pet parent class.
     */
    public String toString() {
        StringBuilder text = new StringBuilder();
        text.append(this.getClass().getSimpleName().toUpperCase()+":");
        text.append("\n");
        text.append(super.toString());
        text.append("\n");
        text.append("Hair: ").append(this.hairLength);
        return text.toString();
    }
}
