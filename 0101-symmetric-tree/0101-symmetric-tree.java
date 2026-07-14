/** 
class Solution {
    public boolean isSymmetric(TreeNode root) {
        
        if(root.left==null && root.right==null)
        {
            return true;
        }
        if(root.left==null || root.right==null)
        {
            return false;
        }
        if(root.left.val!=root.right.val)
        {
            return false;
        }
        if(isMirror(root.left,root.right)==true)
        {
            return true;
        }
        return false;
       
    }
        public boolean isMirror(TreeNode left, TreeNode right)
        {
            if(left==null && right==null)
            {   
                return true;
            }
            if(left==null || right==null)
            {
                return false;
            }
            if(left.val!=right.val)
            {
                return false;
        
            }
            return isMirror(left.left, right.right)&&isMirror(left.right, right.left);
    }
}
**/
class Solution{
public boolean isSameTree(TreeNode p, TreeNode q)
{
    if(p==null || q==null)
    {
         if(p==q)
         {
         return true;
         }
         return false;
    }
    if(p.val!=q.val)
    {
     return  false;
    }
    boolean x = isSameTree(p.left,q.right);
    boolean y = isSameTree(p.right,q.left);
    return x&y;
}
public boolean isSymmetric(TreeNode root)
{
return isSameTree(root.left,root.right);
}
}
 

