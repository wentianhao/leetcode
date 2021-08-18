package leetcode.offer;

public class reverseLeftWords {
    public String reverseLeftWords(String s, int n){
        s = s.substring(n,s.length()) + s.substring(0,n);
        return s;
    }
}
