package Assignment5.Assignment5UnitTest;

import Assignment5.Candy;

public class CandyTest {

    Candy candy;
    static String name = "Candy";
    static float weight = 1.12f;
    static int price = 2;

    public CandyTest() {
        this.candy = new Candy(name, weight, price);
    }

    public void getCostTest() throws UnitTestFailureException {
        int output = candy.getcost();
        if (output == 2) {
            System.out.println("Correct!! Unit test passed!!");
        } else {
            throw new UnitTestFailureException("Output should be " + 2 + " but it is " + output);
        }
    }

    public static void main(String[] args) throws UnitTestFailureException {
        CandyTest test = new CandyTest();
        test.getCostTest();
    }

}
