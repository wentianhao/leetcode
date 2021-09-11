package leetcode.offer;

public class minArray {
    public static int minArray(int[] numbers) {
        int l = 0,r = numbers.length - 1;
        while (l <= r){
            int mid = (l + r) / 2;
            if (numbers[mid] < numbers[r]){
                // mid < r说明 【mid,r】单调增，r = mid
                r = mid;
            }else if (numbers[mid] == numbers[r]){
                // mid = r 说明 【mid,r】中间存在
                r -=1;
            }else {
                l = mid + 1;
            }

        }
        return numbers[l];
    }
    public static void main(String[]args){
        int[]numbers = {3,4,5,1,2};
        System.out.println(minArray(numbers));
    }
}
