package leetcode;

import java.util.ArrayList;
import java.util.List;

public class reverseBetween_92 {

//      Definition for singly-linked list.
    public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    static class Solution {
        public ListNode reverseBetween(ListNode head, int left, int right) {
            int pos = 1;
            ListNode tmp = head;
            List<Integer> data = new ArrayList<>();
            for (ListNode p = head;p!=null;p = p.next){
               if (pos >= left && pos <= right){
                   data.add(p.val);
               }
                pos = pos + 1;
            }
            pos = 1;
            for (ListNode p = head;p !=null;p = p.next){
                if (pos >= left && pos <= right){
                    p.val = data.get(right-pos);
                }
                pos = pos + 1;
            }
            return head;
        }
    }

    public static void main(String []args){
        ListNode head = new ListNode(3);
        ListNode head1 = new ListNode(5);
//        ListNode head2 = new ListNode(3);
//        ListNode head3 = new ListNode(4);
//        ListNode head4 = new ListNode(5);
        head.next = head1;
        head1.next = null;
        //        head1.next = head2;
//        head2.next = head3;
//        head3.next = head4;
//        head4.next = null;
        Solution s = new Solution();
        s.reverseBetween(head,1,2);


    }
}
