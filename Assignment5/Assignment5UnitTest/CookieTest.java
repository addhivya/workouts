package Assignment5.Assignment5UnitTest;

import Assignment5.Cookie;

public class CookieTest {

    String name = "Oatmeal";
    int number = 4;
    float price = 10;
    Cookie cookie;

    public CookieTest() {
        this.cookie = new Cookie(name, number, price);
    }

    public void cookieGetCost() throws UnitTestFailureException {
        int output = cookie.getcost();
        if (output == 3) {
            System.out.println("Correct!! Unit test passed!!");
        } else
            throw new UnitTestFailureException("Output should be 3 but it is " + output);
    }

    public static void main(String args[]) throws UnitTestFailureException {
        CookieTest test = new CookieTest();
        test.cookieGetCost();
    }

}
