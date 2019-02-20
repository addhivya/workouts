package Assignment6.Problem3.Test;

import Assignment6.Problem3.Cat;

public class CatTest {
    Cat cat;

    CatTest() {
        this.cat = new Cat("Cat1", "Divya", "black", "medium");
    }

    public void testgetHairLength() throws UnitTestFailureException {
        String output = cat.getHairLength();
        String ExpectedOutput = "medium";
        if (output != ExpectedOutput) {
            throw new UnitTestFailureException("Expected " + ExpectedOutput + " but result was " + output);
        }
    }

    public void testtoString() throws UnitTestFailureException {
        cat.setSex(1);
        String output = cat.toString();
        String Expectedoutput = "CAT:\nCat1 owned by Divya\nColor: black\nSex: male\nHair: medium";
        if (!output.equals(Expectedoutput))
            throw new UnitTestFailureException("Expected " + Expectedoutput + " but result was " + output);
    }

    public static void main(String[] args) throws UnitTestFailureException {
        CatTest cattest = new CatTest();
        cattest.testgetHairLength();
        cattest.testtoString();


    }
}
