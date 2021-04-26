package leetcode;

public class shipWithinDays_1011 {
    // 二分类法
    static int shipWithinDays(int []weights,int D){
        int l = 0;
        int r = 0;
        for(int w : weights){
            r += w;
        }
        l = r / D;
        while (l<r){
            int mid = (l+r) / 2;
            if (carryMin(weights,D,mid)){
                r = mid;
            }else{
                l = mid + 1;
            }
        }

        return l;
    }
    static boolean carryMin(int[]weights,int D,int weight){
        int sum = 0;
        int d = 1;
        for (int i=0;i<weights.length;i++){
            sum+=weights[i];
            if(weights[i] > weight)
                return false;
            if (sum>weight){ // 一天只能搬运weight
                sum = weights[i];
                d++;
            }
        }
        return d<=D;
    }

    public static void main(String[]args){
        int[]weights = {1,2,3,1,1};
        int x = shipWithinDays(weights,4);
        System.out.println(x);
    }
}
