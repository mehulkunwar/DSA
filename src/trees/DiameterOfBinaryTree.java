package trees;

/*
 * https://leetcode.com/problems/diameter-of-binary-tree/description/
 * Time Complexity - O(n)
 * Space Complexity - O(n)
 *  Important
 */

public class DiameterOfBinaryTree {
    int maxHeight;

    public int diameterOfBinaryTree(TreeNode root) {
        maxHeight = 0;

        heightOfBT(root);

        return maxHeight-1;
    }

    private int heightOfBT(TreeNode root){
        if(root == null) return 0;

        int lh = heightOfBT(root.left);
        int rh = heightOfBT(root.right);

        maxHeight = Math.max(lh + rh + 1,maxHeight);

        return Math.max(lh,rh) + 1;
    }
}
