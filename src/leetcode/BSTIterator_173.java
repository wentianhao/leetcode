package leetcode;

import java.util.*;

public class BSTIterator_173 {

     // Definition for a binary tree node.
    static public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
    }
    static class BSTIterator {
        Queue<Integer> num = new LinkedList<>();
        public void InOrder(TreeNode root){
            if (root == null)
                return ;
            else{
                InOrder(root.left);
                num.add(root.val);
                InOrder(root.right);
            }
        }
        public BSTIterator(TreeNode root) {
            InOrder(root);
        }

        public int next() {
            return num.poll();
        }

        public boolean hasNext() {
            return !num.isEmpty();
        }
    }
}
