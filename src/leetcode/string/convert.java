package leetcode.string;

import java.util.ArrayList;

public class convert {
    public static String convert(String s, int numRows) {
        int n = s.length();
        int flag = -1;
        int r = 0;
        if (n == 1){
            return s;
        }
        ArrayList<String> list = new ArrayList<>();
        for(int i=0;i<Math.min(numRows,n);i++){
            list.add("");
        }
        for(int i=0;i<n;i++){
            list.set(r,list.get(r)+ s.charAt(i));
            if(r == 0 || r == numRows - 1){
                flag = -flag;
            }
            r += flag;
        }
        String res = "";
        for(String l : list){
            res += l;
        }
        return res;
    }

    public static void main(String[]args){
        String s= "AB";
        int numRows = 1;
        convert(s,numRows);
    }

}
