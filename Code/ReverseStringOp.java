package Code;

import java.util.*;
//reverse a string with operators
public class ReverseStringOp {

    public void reverse(String str)
    {
        char[] arr=str.toCharArray();
        ArrayList list=new ArrayList();
        String val="";
        Boolean cancome=false;
        for(int i=0;i<arr.length;i++)     {
            char c=arr[i];
            if(c=='+' || c=='-' ||c=='*' || c=='/')
            {
                if(cancome==false) {
                    val = c + val;
                    continue;
                }
                list.add(val);
                list.add(c);
                val="";
                cancome=false;
            }
            else {
                val =val+c ;
                cancome=true;
            }
        }
        list.add(val);
        StringBuilder builder=new StringBuilder();
        int size=list.size();
        int s=size-1;
        while(s>=0)
        {
           builder.append(list.get(s));
           s--;
        }
        System.out.println(builder);
    }

    public int sample(int m, List<String> data) {

        String toCompare = "";

        for(int i=0; i< m; i++) {
            toCompare += "Y";
        }

        int max = Integer.MIN_VALUE;
        int currentCount = 0;

        for(String s: data) {

            if(s.equals(toCompare)) {
                currentCount++;
            } else {
                max = Math.max(max, currentCount);
                currentCount = 0;
            }
        }

        max = Math.max(max, currentCount);
        return max;
    }

    public static void sample(Integer m, List<Integer> data) {
        int count=0;
        int max=0;
        for(int i=0;i<data.size();i++)
        {
           if(data.get(i)==m)
           {
               count=count+1;
           }
           else {
              if(max<count)
               max=count;
               count = 0;
           }
        }
        if(max<count)
            max=count;

        System.out.println(max);
    }

    public static void main(String[] args) {
        List<Integer> data=new ArrayList<>();
        data.add(2);
        data.add(5);
        data.add(5);
        data.add(6);
        data.add(7);
        data.add(5);
        data.add(5);
        data.add(5);

        sample(5,data);
        ReverseStringOp rev=new ReverseStringOp();
        String str="-24+4-7+-2";
      //  rev.reverse(str);
    }
}
