package leetcode;

public class listNode {
    public static void main(String []args){
        Node node = new Node(1);
        Node node1 = new Node(2);
        Node node2 = new Node(4);
        node.next = node1;
        node1.next = node2;
        node2.next = null;

        Node n = new Node(1);
        Node n1 = new Node(3);
        Node n2 = new Node(4);
        n.next = n1;
        n1.next = n2;
        n2.next = null;
        Node res = mergeTwoLists(node,n);
        while (res.next!=null){
            System.out.print(res.val+"->");
            res = res.next;
        }
        System.out.println(res.val);
    }


    static class Node {
        int val;
        Node next;
        Node(int x) { val = x; }
    }

    public static Node mergeTwoLists(Node l1, Node l2){
        //1->2->4   //1->3->4
        if (l1 == null || l2 ==null)
            return l1 != null ? l1:l2;

        Node res = l1.val < l2.val ? l1:l2;

        Node cur1 = res == l1 ? l1:l2;
        Node cur2 = res == l1 ? l2:l1;

        Node pre = null; //cur1前一个元素
        Node next = null; //cur2的后一个元素

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
