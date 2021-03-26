package leetcode;

public class deleteDuplicates_83 {
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
        // 递归方法

        public ListNode deleteDuplicates(ListNode head){
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
                while (next!=null && head.val == next.val){
                    next = next.next;
                }
                // 2
                head.next = deleteDuplicates(next);
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
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(3);

        node.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = null;
        s.deleteDuplicates(node);
    }

}
