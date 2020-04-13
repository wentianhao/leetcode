package leetcode;

public class binary {
    public static void main(String []args){
        int num = -5;
        String x = Integer.toBinaryString(num);
        System.out.println(x);
        char [] s = x.toCharArray();
        int n = 0;
        for (char t : s){
            if (t == '1'){
                n++;
            }
        }
        Math.abs(1);

        System.out.println(s);
        System.out.println(n);
    }
}
