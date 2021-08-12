package leetcode;

import javax.jws.soap.SOAPBinding;
import java.util.Scanner;

public class demoTest {

    public static class Solution {
        public int demo(String[][] strs) {
            int count = 0;
            int N = strs[0].length;
            int M = strs.length;
            String a = String.valueOf('S');

            for (int i = 0;i<M;i++){
                for (int j=0;j<N;j++){
                    //当找到S，开始处理其所在的块
                    if (strs[i][j].equals(a)){
                        block(strs,i,j);
                        count++;
                    }
                }
            }
            System.out.println(count);
            return count;
        }
        //判断岛
        public static void block(String[][] strs,int i,int j){
            String a = String.valueOf('S');
            strs[i][j] = String.valueOf('O');
            //分别判断上下左右
            if (i<strs.length-1 && strs[i+1][j].equals(a)){
                block(strs,i+1,j);
            }

            if (i>0&& strs[i-1][j].equals(a)){
                block(strs,i-1,j);
            }

            if (j<strs[i].length-1 && strs[i][j+1].equals(a)){
                block(strs,i,j+1);
            }

            if (j>0 && strs[i][j-1].equals(a)){
                block(strs,i,j-1);
            }
        }

    }

    public static void main(String []arg){
        Solution s = new Solution();
        int M=4,N=5;
        Scanner input=new Scanner(System.in);
        String [][]x = new String[M][N];
        for (int i=0;i<M;i++){
            String contents = input.next();
            for (int j=0;j<N;j++){
                char[]ch = contents.toCharArray();
                x[i][j] = String.valueOf(ch[j]);
            }
        }
        int res = s.demo(x);
    }

}
