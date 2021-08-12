package leetcode;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class generics {
    public static void main(String[]args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        List<Integer> list = new ArrayList<>();
        list.add(1);
//        list.add("2");
        /**
         * ?通配符
         * <?extends T>表示类型的上界，表示参数化类型的可能是T 或是 T 的子类
         * getClass()方法是获得调用该方法的对象的类
         * getDeclaredMethod()方法 ：返回Method方法对象，获取类自身声明的所有方法，传入的第一个参数是方法名，第二个参数名是方法参数
         */
        Class<?extends List> clazz = list.getClass();
        System.out.println(Object.class);
        Method add = clazz.getDeclaredMethod("add",Object.class);
        add.invoke(list,"a");
//        add.invoke(list,'c');
        for (Object l : list){
            System.out.println(l);
            System.out.println(l.getClass().toString());
        }
    }
}
