package homework.week2;

import homework.common.TreeNode;

import java.util.HashMap;
import java.util.Map;

/**
 * 105. 从前序与中序遍历序列构造二叉树
 * 从前序与中序遍历序列构造二叉树
 */
public class BuildTreeByPreAndIn {

    final Map<Integer,Integer> map = new HashMap<>();
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for(int i = 0; i < inorder.length; i++) {
            map.put(inorder[i],i);
        }
        return buildTree(preorder,0,preorder.length,inorder,0,inorder.length);
    }

    private TreeNode buildTree(int[] preorder,int preStart,int preEnd,int[] inorder,int inStart,int inEnd) {
        if(inStart == inEnd) {
            return null;
        }
        int rootVal = preorder[preStart++];
        TreeNode root = new TreeNode(rootVal);
        int rootIndex = map.get(rootVal);
        int leftNum = rootIndex - inStart;
        root.left = buildTree(preorder,preStart,preStart + leftNum,inorder,inStart,rootIndex);
        root.right = buildTree(preorder,preStart + leftNum,preEnd,inorder,rootIndex + 1,inEnd);
        return root;
    }
}
