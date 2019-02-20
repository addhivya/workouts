package Code;

public class jump {

        public boolean canJump(int[] nums) {
            if(nums.length<=1)
                return true;
            int[] arr=new int[nums.length];

            System.out.println(arr[1]);
            int i=0;
            int j=1;
            arr[0]=0;

            while(i<j && j!=arr.length)
            { boolean value=false;
                int count=nums[i];
                while(count>0)
                {
                    if(i+count==j)
                    {
                        if(arr[i]+1>arr[j]) {
                            arr[j] = arr[i] + 1;
                            value=true;
                            break;
                        }
                    }
                    else if(i+count>j)
                        count--;
                    else
                        break;
                }
                if(value==true) {
                    j++;
                    i=0;
                    continue;
                }else
                    i++;
            }

            if(arr[nums.length-1]!=0) {

                return true;
            }
            else return false;
        }




    public static void main(String[] args) {
        jump j=new jump();
        int[] nums=new int[]{2,0,3,0,0,5};
        System.out.println(j.canJump(nums));
    }
    }

