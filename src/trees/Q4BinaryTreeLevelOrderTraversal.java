package trees;

import java.util.*;

/*
* https://leetcode.com/problems/binary-tree-level-order-traversal/description/
* Time Complexity - O(n)
* Space Complexity - O(n)
*/

public class Q4BinaryTreeLevelOrderTraversal {

    public List<List<Integer>> levelOrderTraversal(TreeNode root){
        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> result = new ArrayList<>();
        if(root == null) return result;

        q.add(root);

        while(!q.isEmpty()){
            int size = q.size();
            List<Integer> l = new ArrayList<>();

            for(int i=0; i<size; i++){
                TreeNode curr = q.poll();
                l.add(curr.val);
                if(curr.left != null) q.add(curr.left);
                if(curr.right != null) q.add(curr.right);
            }
            result.add(l);
        }

        return result;
    }
}
