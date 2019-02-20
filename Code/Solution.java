package Code;

import java.util.*;

class Solution {


    public List<Integer> selfDividingNumbers(int left, int right) {

        List<Integer> list = new ArrayList<>();

        System.out.println(String.valueOf(left));
        while(left<=right) {
            boolean isvalid = true;
            int num = left;

            while (left > 0) {
                int last = left % 10;
                int before = left / 10;
                if(last==0)
                {
                    isvalid = false;
                    break;
                }
                if (num % last == 0) {
                    left = before;
                    continue;
                } else {
                    isvalid = false;
                    break;
                }
            }
            if(isvalid)
            {
                list.add(num);
            }
            left=num+1;
        }
        System.out.println(list.get(0) );
        return list;
    }


    public static void main(String[] args) {
        Solution sol=new Solution();
        sol.selfDividingNumbers(120,121);
    }
}
