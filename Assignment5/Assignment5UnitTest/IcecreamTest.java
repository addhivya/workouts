package Assignment5.Assignment5UnitTest;

import Assignment5.Icecream;

public class IcecreamTest {
    Icecream icecream;
    static String name = "Vanilla";
    static int price = 3;

    public IcecreamTest() {
        this.icecream = new Icecream(name, price);
    }

    public void icecreamGetCost() throws UnitTestFailureException {
        int output = icecream.getcost();
        if (output == 3) {
            System.out.println("Correct!! Unit test passed!!");
        } else
            throw new UnitTestFailureException("Output should be 3 but it is " + output);
    }

    public static void main(String args[]) throws UnitTestFailureException {
        IcecreamTest test = new IcecreamTest();
        test.icecreamGetCost();
    }

}
