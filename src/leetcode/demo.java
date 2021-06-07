package leetcode;

public class demo {
    public static int result(int n){
        boolean[]num = new boolean[n];
        int t = 0;
        while(n>1){
            for(int i=0;i<num.length;i++){
                if(!num[i]){
                    t++;
                    if (t==3){
                        t = 0;
                        num[i] = true;
                        n--;
                    }
                }
            }
        }
        int res = 0;
        for (int i=0;i<num.length;i++){
            if (!num[i])
                res = i+1;
        }
        return res;
    }
    public static void main(String[]args){
        System.out.println(result(5));
    }
}
