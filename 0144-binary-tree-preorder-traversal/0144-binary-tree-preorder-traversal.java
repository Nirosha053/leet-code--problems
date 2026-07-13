/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public static void preOrderTraversal(TreeNode root,List<Integer>l1){
        if(root==null){
            return;
        }
        l1.add(root.val);
        preOrderTraversal(root.left,l1);
        preOrderTraversal(root.right,l1);

    }
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> l1 = new ArrayList<>();
        preOrderTraversal(root,l1);
        return l1;
    }

    }
