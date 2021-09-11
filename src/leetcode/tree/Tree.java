package leetcode.tree;

import javafx.geometry.Pos;

import java.util.Stack;

public class Tree {

    // 前序遍历  递归实现
    public static void PreOrder(TreeNode node){
        if (node == null){
            return;
        }
        System.out.print(node.value+ " ");
        PreOrder(node.left);
        PreOrder(node.right);
    }

    // 前序遍历 非递归
    public static void PreOrder1(TreeNode node){
        Stack<TreeNode>stack = new Stack<>();
        while (node!=null || !stack.isEmpty()){
            if (node!=null){
                System.out.print(node.value+" ");
                stack.push(node);
                node = node.left;
            }else {
                TreeNode temp = stack.pop();
                node = temp.right;
            }
        }
    }

    // 中序遍历
    public static void InOrder(TreeNode node){
        if (node == null){
            return;
        }
        InOrder(node.left);
        System.out.print(node.value + " ");
        InOrder(node.right);
    }

    public static void InOrder1(TreeNode node){
        Stack<TreeNode>stack = new Stack<>();
        while (node!=null || !stack.isEmpty()){
            if (node!=null){
                stack.push(node);
                node = node.left;
            }else {
                TreeNode temp = stack.pop();
                System.out.print(temp.value + " ");
                node = temp.right;
            }
        }
    }

    // 后续遍历
    public static void PostOrder(TreeNode node){
        if (node == null){
            return;
        }
        PostOrder(node.left);
        PostOrder(node.right);
        System.out.print(node.value + " ");
    }

    // 后续遍历非递归
    public static void PostOrder1(TreeNode root){
        Stack<TreeNode>src = new Stack<>();
        Stack<TreeNode> res = new Stack<>();
        src.push(root);
        while (!src.isEmpty()){
            TreeNode p = src.pop();
            res.push(p);
            if (p.left!=null){
                src.push(p.left);
            }
            if (p.right!=null){
                src.push(p.right);
            }
        }
        while (!res.isEmpty()){
            System.out.print(res.pop().value + " ");
        }
    }


    public static void main(String[]args){
        TreeNode[] node = new TreeNode[10];
        for (int i=0;i<10;i++){
            node[i] = new TreeNode(i);
        }
        for (int i=0;i<10;i++){
            if (i*2+1<10){
                node[i].left = node[i*2+1];
            }
            if (i*2+2<10){
                node[i].right = node[i*2+2];
            }
        }
        System.out.println("前序遍历");
        PreOrder(node[0]);
        System.out.println();
        PreOrder1(node[0]);
        System.out.println();
        System.out.println("中序遍历");
        InOrder(node[0]);
        System.out.println();
        InOrder1(node[0]);
        System.out.println();
        System.out.println("后续遍历");
        PostOrder(node[0]);
        System.out.println();
        PostOrder1(node[0]);
    }


}
class TreeNode { //树节点
    int value;
    TreeNode left;
    TreeNode right;
     TreeNode(int value){
         this.value = value;
     }
}