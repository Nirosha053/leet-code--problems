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
      public static void postOrderTraversal(TreeNode root,List<Integer>l1){
        if(root==null){
            return;
        }
       
        postOrderTraversal(root.left,l1);
        postOrderTraversal(root.right,l1);
         l1.add(root.val);
    }
    public List<Integer> postorderTraversal(TreeNode root) {
      
        List<Integer> l1 = new ArrayList<>();
        postOrderTraversal(root,l1);
        return l1;
    }
}