package Assignment6.Problem3;

public class Dog extends Pet implements Bordable {
    private String size;

    public Dog(String name, String ownerName, String color, String size) {
        super(name, ownerName, color);
        this.size = size;
    }

    String getSize() {
        return this.size;
    }

    /**
     *Method that returns a String that identifies the pet as Dog and returns a complete description of the dog,
     * including the values stored in the Pet parent class.
     */
    public String toString() {
        StringBuilder text = new StringBuilder();
        text.append(this.getClass().getSimpleName().toUpperCase()+":");
        text.append("\n");
        text.append(super.toString());
        text.append("\n");
        text.append("Size: ").append(this.getSize());
        return text.toString();
    }
}
