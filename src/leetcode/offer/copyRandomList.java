package leetcode.offer;

import java.util.HashMap;
import java.util.Map;

public class copyRandomList {
    class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }
    public Node copyRandomList(Node head) {
        Map<Node,Node> map = new HashMap<>();
        Node cur = head;
        while (cur!=null){
            map.put(cur,new Node(cur.val));
            cur = cur.next;
        }
        for (Node node : map.keySet()){
            map.get(node).next = map.get(node.next);
            map.get(node).random = map.get(node.random);
        }
        return map.get(head);
    }
}
