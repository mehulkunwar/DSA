package trees;

import java.util.*;

/*
 * https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/description/
 * Time Complexity - O(n)
 * Space Complexity - O(n)
 */

public class Q10BinaryTreeZigZagTraversal {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new LinkedList<>();
        if(root == null) return result;
        Queue<TreeNode> q = new ArrayDeque<>();
        q.add(root);
        boolean check = true;

        while(!q.isEmpty()){
            int size = q.size();
            List<Integer> l = new LinkedList<>();
            for(int i=0; i<size; i++){
                TreeNode curr = q.poll();

                if(check){l.addLast(curr.val);}
                else l.addFirst(curr.val);

                if(curr.left != null) q.add(curr.left);
                if(curr.right != null) q.add(curr.right);
            }
            check = !check;
            result.add(l);
        }

        return result;
    }
}
