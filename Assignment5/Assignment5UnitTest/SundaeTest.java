package Assignment5.Assignment5UnitTest;

import Assignment5.Sundae;

public class SundaeTest {

    Sundae sundae;
    static String name = "vanilla";
    static String topname = "choco";
    static int topprice = 1;
    static int price = 3;

    public SundaeTest() {
        this.sundae = new Sundae(topname, topprice, name, price);
    }

    public void SundaeGetCost() throws UnitTestFailureException {
        int output = sundae.getcost();
        if (output == 4) {
            System.out.println("Correct!! Unit test passed!!");
        } else
            throw new UnitTestFailureException("Output should be 4 but it is " + output);
    }

    public static void main(String args[]) throws UnitTestFailureException {
        SundaeTest test = new SundaeTest();
        test.SundaeGetCost();
    }


}
