package trees;

import java.util.*;

/*
* https://leetcode.com/problems/balanced-binary-tree/description/
* Time Complexity - O(n)
* Space Complexity - O(n)
*/

public class CheckBalancedBinaryTree {

    public boolean isBalanced(TreeNode root) {
        return checkHeight(root) != -1;
    }

    private int checkHeight(TreeNode root){
        if(root == null) return 0;

        int lh = checkHeight(root.left);
        if(lh == -1) return -1;

        int rh = checkHeight(root.right);
        if(rh == -1) return -1;

        if(Math.abs(lh - rh) > 1) return -1;

        return Math.max(lh,rh) + 1;
    }
}
