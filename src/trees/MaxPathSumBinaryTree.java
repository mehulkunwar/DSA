package trees;

/*
 * https://leetcode.com/problems/binary-tree-maximum-path-sum/
 * Time Complexity - O(n)
 * Space Complexity - O(n) - O(logn) for perfect balanced tree
 */


public class MaxPathSumBinaryTree {
    int max;
    public int maxPathSum(TreeNode root) {
        if(root == null) return 0;
        max = Integer.MIN_VALUE;
        dfs(root);
        return max;
    }

    private int dfs(TreeNode root){
        if(root == null) return 0;

        int left = Math.max(dfs(root.left),0);
        int right = Math.max(dfs(root.right),0);

        int sum = left + right + root.val;

        max = Math.max(max,sum);

        return root.val + Math.max(left,right);
    }
}
