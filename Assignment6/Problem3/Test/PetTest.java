package Assignment6.Problem3.Test;
import Assignment6.Problem3.Pet;
import Assignment6.Problem3.Cat;

public class PetTest {
    Pet pet = new Cat("Cat1", "Divya", "black", "medium");

    public void testBoarding() throws UnitTestFailureException {
        pet.setBoardStart(2, 31, 1991);
        pet.setBoardEnd(6, 10, 1991);
        try {
            pet.boarding(0, 11, 1991);
            throw new UnitTestFailureException("should have got exception");
        } catch (RuntimeException ignored) {
        }
    }

    public void testBoarding1() throws UnitTestFailureException {
        Boolean output = pet.boarding(3, 8, 1991);
        if (!output.equals(true)) {
            throw new UnitTestFailureException("Expected result is true but returned " + output);
        }
    }


    public static void main(String[] args) throws UnitTestFailureException {
        PetTest test = new PetTest();
        test.testBoarding();
        test.testBoarding1();

    }
}
