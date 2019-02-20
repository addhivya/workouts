package Code;

import java.util.HashMap;

public class Reverse {

    public String reverseOnlyLetters(String S) {
        HashMap<Integer,Character> map=new HashMap<>();
        for(int i=0;i<S.length();i++)
        {
            map.put(i,S.charAt(i));
        }
        int j = 0;
        for(int i=S.length()-1;i>=0;i--)
        {
            if(((int)S.charAt(i)>=97 && (int)S.charAt(i)<=122) || ((int)S.charAt(i)>=65 && (int)S.charAt(i)<=90)) {

                while (!(((int) map.get(j) >= 97 && (int) map.get(j) <= 122) || ((int) map.get(j) >= 65 && (int) map.get(j) <= 90))) {
                    j++;
                }
                    map.put(j, S.charAt(i));
                    j++;

            }
        }
        StringBuffer result=new StringBuffer();
        for(int i:map.keySet())
        {
           result=result.append(map.get(i));
        }return result.toString();
    }

    public  static  void main(String[] args)
    {
        Reverse r=new Reverse();
        System.out.println(r.reverseOnlyLetters("a-bC-dEf-ghIj"));

    }
}
