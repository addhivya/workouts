package Assignment6.Problem3.Test;

import Assignment6.Problem3.Dog;

public class DogTest {
    Dog dog;
    DogTest() {
        this.dog = new Dog("Dog1", "Divya", "white and black", "short");
    }

    public void testtoString() throws UnitTestFailureException {
        dog.setSex(2);
        String output = dog.toString();
        String Expectedoutput = "DOG:\nDog1 owned by Divya\nColor: white and black\nSex: female\nSize: short";
        if (!output.equals(Expectedoutput))
            throw new UnitTestFailureException("Expected " + Expectedoutput + " \nbut result was " + output);
    }

    public static void main(String[] args) throws UnitTestFailureException {
        DogTest dogtest = new DogTest();
        dogtest.testtoString();
    }


}
