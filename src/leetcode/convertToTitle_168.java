package leetcode;

public class convertToTitle_168 {
    public static String convertToTitle(int columnNumber) {
        String res = "";
        while(columnNumber > 0){
            columnNumber -- ;
            res = String.valueOf((char)(columnNumber%26  + 'A')) + res;
            columnNumber = columnNumber / 26 ;
        }
        System.out.println(res);
        return res;
    }
    public static void main(String[]args){
        convertToTitle(701);
    }
}
