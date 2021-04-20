package leetcode.dp;

public class isScramble_87 {
    public static boolean isScramble(String s1, String s2) {
        int len = s1.length();
        for (int i=1;i<len;i++){
            String x = s1.substring(0,i);
            String y = s1.substring(i,len);

        }
        return false;
    }
    public static void main(String []args){
        String s1 = "abcde";
        String s2 = "caebd";
        isScramble(s1,s2);
    }
}
