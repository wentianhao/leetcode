package leetcode;

public class jcfzdt {
    public static void main(String[]args){
        show(new Cat());
        show(new Dog());
        //多态
        Animal a = new Cat();
        Animal b = new Dog();
        a.eat();
        Cat c = (Cat) a;
        c.work();

    }
    public static void show(Animal a){
        a.eat();
        //类型判断
        if (a instanceof Cat){
            Cat c = (Cat) a;
            c.work();
        }else{
            Dog d = (Dog) a;
            d.work();
        }
    }
}

abstract class Animal{
    abstract void eat();
}

class Cat extends Animal{

    @Override
    void eat() {
        System.out.println("吃鱼");
    }

    void work(){
        System.out.println("抓老鼠");
    }
}

class Dog extends Animal{

    @Override
    void eat() {
        System.out.println("吃骨头");
    }
    void work(){
        System.out.println("看家");
    }
}

class Test{
    // 封装
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}