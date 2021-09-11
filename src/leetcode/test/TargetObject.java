package leetcode.test;

public class TargetObject {
    private String value;

    public TargetObject() {
        this.value = "hello world";
    }

    public void publicMethod(String s){
        System.out.println("s:" + s);
    }

    private void privateMethod() {
        System.out.println("value is " + value);
    }
}
