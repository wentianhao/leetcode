package leetcode.sort;

public class QuickSort {

    private static void quickSort(int[]nums,int l,int r){
        if (l>=r)
            return;
        int left = l;
        int right = r;
        //待排序的第一个元素作为基准值
        while(left<right){

        }
    }
    public static void main(String[]args){
        int[] nums = {5,1,7,3,1,6,9,4};
        quickSort(nums,0,nums.length-1);
        for (int n:nums){
            System.out.println(n+"\t");
        }
    }

}
