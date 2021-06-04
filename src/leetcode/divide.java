package leetcode;

public class divide {
    public static Integer[] getSeq(int num,int n){
        Integer[] res = new Integer[n];
        int flag = 0;
        for(int i=1;i<num-n;i++){
            if((i+(i+(n-1)))*n/2 == num){
                flag = i;
                break;
            }
        }
        for (int i =0;i<n;i++){
            res[i]= i+flag;
        }
        return res;
    }
    public static void main(String[]args){
        System.out.println(getSeq(18,4));
    }
}
