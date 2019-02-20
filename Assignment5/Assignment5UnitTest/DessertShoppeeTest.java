package Assignment5.Assignment5UnitTest;

import Assignment5.DessertShoppee;

public class DessertShoppeeTest {

    private DessertShoppee dessertShoppee;

    DessertShoppeeTest() {
        this.dessertShoppee = new DessertShoppee();
    }

    public void testConvertStringBasedOnWidth() throws UnitTestFailureException {
        final String input = "Hot Fudge Sundae with Choc. Chip Ice Cream";
        final String output = DessertShoppee.convertStringBasedOnSize(input);
        final String actualoutput = "Hot Fudge Sundae with\nChoc. Chip Ice Cream";
        if (!actualoutput.equals(output)) {
            throw new UnitTestFailureException("Should be " + actualoutput + " but " + output);
        }
    }

    public void testCents2dollarsAndCentsmethod() throws UnitTestFailureException {
        int centInput = 100;
        String centOutput = DessertShoppee.cents2dollarsAndCentsmethod(centInput);
        if (!centOutput.equals("1.00")) {
            throw new UnitTestFailureException("Should be 1.00 but " + centOutput);
        } else
            System.out.println("Correct!! Unit test passed!!");
    }

    public static void main(String[] args) throws UnitTestFailureException {
        DessertShoppeeTest test = new DessertShoppeeTest();
        test.testConvertStringBasedOnWidth();
        test.testCents2dollarsAndCentsmethod();
    }
}
