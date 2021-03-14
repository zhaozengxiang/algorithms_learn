package homework.week1;

import java.util.ArrayList;
import java.util.List;

public class PreOrderTraversal {
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

    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(3,null,null);
        TreeNode node2 = new TreeNode(2,node1,null);
        TreeNode root = new TreeNode(1,null,node2);
        System.out.println(preorderTraversal(root));
    }

    public static List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        preorder(root,list);
        return list;
    }

    public static void preorder(TreeNode root, List<Integer> list) {
        if(root == null) {
            return;
        }
        list.add(root.val);
        preorder(root.left, list);
        preorder(root.right, list);
    }
}
