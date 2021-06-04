package leetcode;

import java.util.Arrays;
import java.util.Comparator;

public class specify_sort {
    public static String[] specify_sort(String[]words){
        Arrays.sort(words, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                // 判断字符个数/数字个数的比值
                    double l1 = (double) getSize(o1)[0] / (double)getSize(o1)[1];
                    double l2 = (double)getSize(o2)[0] / (double)getSize(o2)[1];
                    if (l1 == l2){
                        return o1.compareToIgnoreCase(o2);
                    }
                if(l1 > l2)
                    return -1;
                return 1;
            }
        });
        return words;
    }
    public static int[] getSize(String word){
        int[]size = new int[2];
        int r = 0,r1=0;

        for(int i=0;i<word.length();i++){
            if ((word.charAt(i)>='a' && word.charAt(i)<='z') || (word.charAt(i)>='A' && word.charAt(i)<='Z')){
                r++;
            }
            if (word.charAt(i)>='0' && word.charAt(i)<='9')
                r1++;
        }
        size[0]=r;
        size[1] = r1;
        return size;
    }
    public static void main(String []args){
        String[]words ={"abc11123","abc+11234","ababab--1"};
        specify_sort(words);
    }
}
