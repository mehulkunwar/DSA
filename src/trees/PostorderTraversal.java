package trees;

import java.util.*;

/*
 * https://neetcode.io/problems/binary-tree-postorder-traversal/question
 * Time Complexity - O(n)
 * Space Complexity - O(n)
 */

public class PostorderTraversal {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        postOrder(root,result);
        return result;
    }

    private void postOrder(TreeNode root,List<Integer> result){
        if(root == null) return;

        postOrder(root.left,result);
        postOrder(root.right,result);
        result.add(root.val);
    }
}
