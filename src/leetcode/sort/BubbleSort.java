package leetcode.sort;

public class BubbleSort {
    /**
     * 冒泡排序
     * 时间复杂度O（n）
     * 空间复杂度O（1）
     * 稳定性：稳定
     */
    private static void bubbleSort(int[]nums){
        if (nums == null || nums.length< 2)
            return ;
        for (int i=0;i<nums.length-1;i++){
            for (int j=0;j<nums.length-i-1;j++){
                if (nums[j]<nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }

    }

    public static void main(String[]args){
        int[] nums = {5,1,7,3,1,6,9,4};
        bubbleSort(nums);
        for (int n:nums){
            System.out.println(n+"\t");
        }
    }
}
