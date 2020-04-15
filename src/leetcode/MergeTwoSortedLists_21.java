package leetcode;

/**
 * Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.
     Example:
     Input: 1->2->4, 1->3->4
     Output: 1->1->2->3->4->4
 */
public class MergeTwoSortedLists_21 {
    public static void main(String []args){
        ListNode node = new ListNode(1);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(4);
        node.next = node1;
        node1.next = node2;
        node2.next = null;

        ListNode n = new ListNode(1);
        ListNode n1 = new ListNode(3);
        ListNode n2 = new ListNode(4);
        n.next = n1;
        n1.next = n2;
        n2.next = null;
        Solution s = new Solution();
        ListNode res = s.mergeTwoLists(node,n);
        while (res.next!=null){
            System.out.print(res.val+"->");
            res = res.next;
        }
        System.out.println(res.val);
    }
    static class Solution {
        public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
            if (l1 == null || l2 ==null)
                return l1 != null ? l1:l2;
            ListNode res = l1.val<l2.val?l1:l2;

            ListNode cur1 = res == l1 ? l1:l2;
            ListNode cur2 = res == l1 ? l2:l1;

            ListNode pre = null; //cur1前一个元素
            ListNode next = null; //cur2的后一个元素

            while (cur1 != null && cur2 != null){
                if (cur1.val <= cur2.val){
                    pre = cur1;
                    cur1 = cur1.next;
                }else {
                    next = cur2.next;
                    pre.next = cur2;
                    cur2.next = cur1;
                    pre = cur2;
                    cur2 = next;
                }
            }
            pre.next = cur1 == null ? cur2 : cur1;
            return res;
        }
    }
    static class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
    }
}
