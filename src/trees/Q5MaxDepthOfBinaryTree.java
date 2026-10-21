package trees;

/*
* https://leetcode.com/problems/maximum-depth-of-binary-tree/description/
* Time Complexity - O(n)
* Space Complexity - O(n)
*/

public class Q5MaxDepthOfBinaryTree {

    public int maxDepth(TreeNode root) {
        if(root == null) return 0;

        int lh = maxDepth(root.left);
        int rh = maxDepth(root.right);

        return Math.max(lh,rh) + 1;
    }
}
