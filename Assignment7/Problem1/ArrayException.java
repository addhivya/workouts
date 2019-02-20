package Assignment7.Problem1;

public class ArrayException {

    public static void main(String[] args) throws MyIndexOutOfBoundException {
        int[] a = {1, 2, 3};
        int i = 0;
        try {
            for (i = 0; i < a.length + 1; i++) {
                System.out.println(a[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new MyIndexOutOfBoundException(0, a.length - 1, i);
        }
    }
}
