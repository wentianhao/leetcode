package leetcode;

import java.util.ArrayList;
import java.util.List;

public class minDiffInBTS_783 {
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

    static class Solution {
        int min = 1000;
        TreeNode pre = null;
        public int minDiffInBST(TreeNode root) {
            InOrder(root);
            return min;
        }
        // 中序遍历
        public void InOrder(TreeNode root){
            if(root == null){
                return;
            }
            InOrder(root.left);
            if (pre!=null){
                min = Integer.min(min,root.val - pre.val);
            }
            pre = root;
            InOrder(root.right);
        }

    }


}
