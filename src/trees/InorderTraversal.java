package trees;

import java.util.*;

/*
* https://neetcode.io/problems/binary-tree-inorder-traversal/question
* Time Complexity - O(n)
* Space Complexity - O(n)
*/

public class InorderTraversal {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        inOrder(root,result);
        return result;
    }

    private void inOrder(TreeNode root, List<Integer> result){
        if(root == null) return;

        inOrder(root.left,result);
        result.add(root.val);
        inOrder(root.right,result);

    }
}
