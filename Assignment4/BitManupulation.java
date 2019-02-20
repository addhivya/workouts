package Assignment4;

public class BitManupulation {

    public static void main(String[] args) {
        int number = 16;  // 00011111
        int pow = 0;
        while(Math.pow(2,pow) < number) {
            int mask = (int)Math.pow(2, pow);  // 00000100
            int andOfTwo = number & mask;
            if(andOfTwo != 0) {
                System.out.println("Print " +pow);
                break;
            }
            pow++;
        }


        int number1 = 43 + 64;
        int mask = (int)Math.pow(2,4)-1;
        System.out.println(number1 | mask);
    }
}
