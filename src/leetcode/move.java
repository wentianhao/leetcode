package leetcode;

public class move {
    public static int getNum(int[] nums){
        if(nums.length<=1){
            return 0;
        }
        int left=0;
        int right=nums.length-1;
        int number=0;
        while (left<right){
            while (nums[left]%2==0 && left<right){
                left++;
            }
            while (nums[right]%2==1 && left<right){
                right--;
            }
            if(left<right){
                //看是否要移动数组，还是只需求移动次数即可
                int index=nums[left];
                nums[left]=nums[right];
                nums[right]=index;
                number++;
                left++;
                right--;
            }
        }
        return number;
    }

}
