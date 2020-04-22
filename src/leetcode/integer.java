package leetcode;

public class integer {
    public static void main(String []args){
        Integer a = new Integer(1000);
        System.out.println(a == 1000); //true
        System.out.println(a == (Integer) 1000);  // false
        System.out.println(a.equals(1000)); //true
        System.out.println(new Integer(100).equals(new Long(100))); //false
    }
}
