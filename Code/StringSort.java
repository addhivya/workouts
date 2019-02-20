package Code;

import java.util.Arrays;

public class StringSort {


    public static void main(String[] args) {
        String[] a={"12.00","1.12","13.67","1.0000000000001"};
        Arrays.sort(a);
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
    }
}
