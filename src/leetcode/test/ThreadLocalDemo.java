package leetcode.test;

import java.util.ArrayList;
import java.util.List;

public class ThreadLocalDemo {
    private List<String> messages = new ArrayList<>();

    public static final ThreadLocal<ThreadLocalDemo> holder = ThreadLocal.withInitial(ThreadLocalDemo::new);

    public static void add(String message) {
        holder.get().messages.add(message);
    }

    public static List<String> clear() {
        List<String> messages = holder.get().messages;
        holder.remove();

        System.out.println("size: ^" + holder.get().messages.size());
        return messages;
    }

    public static void main(String[] args){
        ThreadLocalDemo.add("hello wrold");
        System.out.println(holder.get().messages);
        ThreadLocalDemo.clear();
    }
}
