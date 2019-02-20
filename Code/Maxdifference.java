package Code;

public class Maxdifference {

    public void maxDiffOddEven(int[] arr)
    {
        int even=Integer.MIN_VALUE;
        int diff=0;
        for(int i=arr.length-1;i>=0;i--) {
            if (arr[i] % 2 == 0) {
                if (arr[i] > even) {
                    even = arr[i];
                }
            } else if (even != Integer.MIN_VALUE) {
                int d = even - arr[i];
                if (d > diff) {
                    diff = d;
                }
            }
        }
        System.out.println(diff);
    }


    public static void main(String[] args) {
        Maxdifference max=new Maxdifference();
        int a[]=new int[]{1,2,3,6,4};
        max.maxDiffOddEven(a);

    }
}
