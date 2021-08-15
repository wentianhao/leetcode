package leetcode.offer;

import java.util.Stack;

/**
 * 剑指offer09.用两个栈实现队列
 * 用两个栈实现一个队列。队列的声明如下，请实现它的两个函数 appendTail 和 deleteHead ，分别完成在队列尾部插入整数和在队列头部删除整数的功能。(若队列中没有元素，deleteHead 操作返回 -1 )
 *
 */
public class CQueue {
    Stack<Integer> s1;
    Stack<Integer> s2;
    public CQueue() {
        s1 = new Stack<>();
        s2 = new Stack<>();
    }
    public void appendTail(int value) {
        s1.push(value);
    }
    //  s1 = [1,2,3]

    public int deleteHead() {
        if (s2.isEmpty()){
            while (!s1.isEmpty()){
                s2.push(s1.pop());
            }
        }

        if (s2.isEmpty())
            return -1;
        return s2.pop();
    }
}
