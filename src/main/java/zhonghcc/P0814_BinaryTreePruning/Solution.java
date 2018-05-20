package zhonghcc.P0814_BinaryTreePruning;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode pruneTree(TreeNode root) {
        TreeNode newRoot = new TreeNode(root.val);
        boolean ret = isKeep(root,newRoot);
        if(ret==true){
            return newRoot;
        }else{
            return null;
        }
    }

    boolean isKeep(TreeNode node,TreeNode newNode){
        boolean ret = false;
        if(node.left!=null){
            TreeNode leftNode = new TreeNode(node.left.val);
            boolean leftKeep = isKeep(node.left,leftNode);
            if(leftKeep==true){
                ret = true;
                newNode.left = leftNode;
            }
        }
        if(node.right!=null){
            TreeNode rightNode = new TreeNode(node.right.val);
            boolean rightKeep = isKeep(node.right,rightNode);
            if(rightKeep==true){
                ret = true;
                newNode.right = rightNode;
            }
        }
        if(ret == true || node.val==1){
            return true;
        }else{
            return false;
        }
    }
}

 class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
 }