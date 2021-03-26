package leetcode;

import java.util.*;

public class deleteDuplicates_82 {
    /**
     * Definition for singly-linked list.
     *
     */
    static class ListNode {
         int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    static class Solution {
        public ListNode deleteDuplicates(ListNode head) {
            Set<Integer> set = new HashSet<>();
            ListNode res = new ListNode(1000);
            ListNode q = res;
            if (head ==null)
                return null;
            for (ListNode p=head;p.next!=null;p=p.next){
                if (p.val == p.next.val){
                    set.add(p.val);
                }
            }

            for (ListNode p = head;p!=null;p=p.next){
                if (!set.contains(p.val)){
                    if (res.val == 1000){
                        res.val = p.val;
                    }else{
                        ListNode temp = new ListNode(p.val);
                        q.next = temp;
                        q = q.next;
                    }
                }
            }
            if (res.val == 1000)
                return null;
            return res;
        }

        // 递归方法

        public ListNode deleteDuplicates1(ListNode head){
            if (head == null || head.next == null)
                return head;

            ListNode next = head.next;

            //如果是这种情况
            // 1 --> 1 --> 1 --> 2 --> 3
            //head next
            //1.移动next直到head.val与next不相等
            //2. 此时的head是重复值去掉
            //---else----
            // 1 --> 2 --> 3
            // head next
            // 3.如果没有出现1情况，递归返回的节点作为head的子节点
            if (head.val == next.val){
                // 1
                while (next !=null && head.val == next.val){
                    next = next.next;
                }
                // 2
                head = deleteDuplicates(next);
            }else {
                head.next = deleteDuplicates(next);
            }
            return head;
        }
    }

    public static void main(String[]args){
        Solution s = new Solution();
        ListNode node = new ListNode(1);
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(1);
//        ListNode node3 = new ListNode(2);
//        ListNode node4 = new ListNode(3);

        node.next = node1;
        node1.next = node2;
        node2.next = null;
//        node3.next = node4;
//        node4.next = null;
        s.deleteDuplicates(node);
    }

}
