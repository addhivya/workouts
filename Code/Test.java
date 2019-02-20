/*
package Code;

import java.util.Arrays;
import java.util.*;

public class Test {
    int[] arr=nums.length/2;
    public vector<int> twoSum(vector<int>& nums, int target) {
        int i=0;
        int j=nums.length-1;
        while(i<=j)
        {
            for(j=nums.length-1;j<=0;j--)
            {
                if(nums[i]+nums[j]==target)
                {
                    return i,j;
                }
                else
                {
                    if(nums[i]+nums[j]>target)
                    {
                        j--;
                    }

                }
            else
                i++;
            }
        }
    }
}

    public int solution(int[] A) {
        // write your code in Java SE 8

       boolean[] newArray=new boolean[A.length+1];
       for(int i=0;i<A.length-1;i++)
       {
           if((A[i]<newArray.length) && (A[i]>0))
           {
               newArray[i]=true;
           }
       }
       for(int i=1;i<newArray.length;i++)
       {
           if(newArray[i]!=true)
           {
               return i;
           }
       }
       return newArray.length;
    }
}
*/
