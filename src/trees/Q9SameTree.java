package trees;

/*
 * https://leetcode.com/problems/same-tree/description/
 * Time Complexity - O(n)
 * Space Complexity - O(n)
 */

public class Q9SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null) return true;
        if(p == null || q == null) return false;
        if(p.val != q.val) return false;

        return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
    }
}
