package Code;

import java.util.*;

public class Firstnonrepetitive {

    public void nonrepetitive(String[] a)
    {
        Map<String,Integer> map=new LinkedHashMap<>() ;
        int j=1;
        for(int i=0;i<a.length;i++)
        {
            if(map.containsKey(a[i]))
            {
                int k=map.get(a[i]);
                map.put(a[i],++k);
            }
            else
            map.put(a[i],j);
        }

        for(String key:map.keySet())
        {
          //  key.g
           // entryset
            int ans=map.get(key);
            if(ans==1) {

                System.out.println(key);
                break;
            }
        }
    }

    public static void main(String[] args) {
        Firstnonrepetitive f=new Firstnonrepetitive();
        String[] a= new String[]{"1","5","1","6","2"};


        f.nonrepetitive(a);
       }


}
