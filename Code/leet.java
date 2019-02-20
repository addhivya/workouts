package Code;

import java.util.*;

public class leet {


        public int[] twoSum(int[] nums, int target) {
           int[]result=new int[2];
           Map<Integer,Integer> map=new HashMap<>();
           for(int i=0;i<nums.length;i++)
           {
               int number=Math.abs(target-nums[i]);
               if(map.containsKey(number))
               {
                   result[1]=i;
                   result[0]=map.get(number);
                  break;
               }
               else
                   map.put(nums[i],i);
           }return result;
        }



    public static void main(String[] args) {
        int a[] = {-1,0,1,7,11,15};
        leet leet = new leet();
        int[] result = leet.twoSum(a, 8);
        for(int i=0;i<result.length;i++)
        {
            System.out.println(result[i]);
        }
    }
}
