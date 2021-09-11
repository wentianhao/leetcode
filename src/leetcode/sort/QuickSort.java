package leetcode.sort;

public class QuickSort {

    private static void quickSort(int[]nums,int l,int r){
        if (l < r){
            // 找寻基准数据的正确索引
            int index = getIndex(nums,l,r);

            quickSort(nums, l, index-1);
            quickSort(nums, index+1, r);
        }
    }

    private static int getIndex(int[]nums,int l,int r){
        // 基准数据
        int temp = nums[l];

        while (l < r){
            // 当队尾的元素大于等于基准数据时，向前挪 r指针
            while (l < r && nums[r] >= temp){
                r--;
            }
            // 队尾元素小于基准
            nums[l] = nums[r];
            while (l < r && nums[l] <= temp ){
                l++;
            }
            nums[r] = nums[l];
        }
        nums[l] = temp;
        return l;
    }

    public static void main(String[]args){
        int[] nums = {49, 38, 65, 97, 23, 22, 76, 1, 5, 8, 2, 0, -1, 22 };
        quickSort(nums,0,nums.length-1);
        for (int n:nums){
            System.out.print(n+" ");
        }
    }

}
