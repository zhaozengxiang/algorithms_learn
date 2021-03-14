package homework.week1;

import java.util.ArrayList;
import java.util.List;

public class InorderTraversal {
    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(3,null,null);
        TreeNode node2 = new TreeNode(2,node1,null);
        TreeNode root = new TreeNode(1,null,node2);
        System.out.println(inorderTraversal(root));
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        inorder(root,list);
        return list;
    }

    public static void inorder(TreeNode root,List<Integer> list) {
        if(root == null) {
            return;
        }
        inorder(root.left, list);
        list.add(root.val);
        inorder(root.right, list);
    }
}
