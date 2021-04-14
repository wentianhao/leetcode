package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class integer {
    static public List<Integer> GetminKNumber(int[]input,int k){
       if (input ==null || k == 0 || k>input.length)
           return null;
       ArrayList<Integer> a = new ArrayList<>();
       Arrays.sort(input);
       for (int i:input)
           a.add(i);
       return a;
    }
    public static void main(String []args){
//        Integer a = new Integer(1000);
//        System.out.println(a == 1000); //true
//        System.out.println(a == (Integer) 1000);  // false
//        System.out.println(a.equals(1000)); //true
//        System.out.println(new Integer(100).equals(new Long(100))); //false
//        System.out.println();
//        String a = "123";
//        char[] b = a.toCharArray();
        int[]inputs = {4,5,1,6,2,7,3,8};
        GetminKNumber(inputs,4);
    }
}


