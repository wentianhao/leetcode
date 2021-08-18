package leetcode.offer;

public class replaceSpace {
    public static String replaceSpace(String s){
        s = s.replaceAll(" ","%20");
        return s;
    }
    public static void main(String[]args){
        String x = replaceSpace("We are happy");
        System.out.println(x);
    }
}
