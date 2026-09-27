package trees;

import java.util.*;

/*
 * https://neetcode.io/problems/binary-tree-preorder-traversal/question
 * Time Complexity - O(n)
 * Space Complexity - O(n)
*/

public class PreorderTraversal {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        postOrder(root,result);
        return result;
    }

    private void postOrder(TreeNode root, List<Integer> result){
        if(root == null) return ;

        result.add(root.val);
        postOrder(root.left,result);
        postOrder(root.right,result);
    }
}
