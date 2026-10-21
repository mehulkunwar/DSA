# DSA Questions

| # | Question                          | Link          | Time | Space | Notes                        |
|---|-----------------------------------|---------------|------|-------|------------------------------|
| 1 | Binary Tree Inorder Traversal     | [NeetCode][1] | O(n) | O(n)  | Left → Root → Right          |
| 2 | Binary Tree Preorder Traversal    | [NeetCode][2] | O(n) | O(n)  | Root → Left → Right          |
| 3 | Binary Tree Postorder Traversal   | [NeetCode][3] | O(n) | O(n)  | Left → Right → Root          |
| 4 | Binary Tree Level Order Traversal | [LeetCode][4] | O(n) | O(n)  | BFS, loop q.size() per level |
| 5 | Maximum Depth of Binary Tree      | [LeetCode][5] | O(n) | O(n)  | max(lh, rh) + 1              |
| 6 | Balanced Binary Tree              | [LeetCode][6] | O(n) | O(n)  | Return -1 if unbalanced      |
| 7 | Diameter of Binary Tree           | [LeetCode][7] | O(n) | O(n)  | IMPORTANT: track lh + rh     |
| 8 | Binary Tree Maximum Path Sum      | [LeetCode][8] | O(n) | O(n)  | Ignore negatives: max(dfs, 0); track l + r + val, return val + max(l, r) |
| 9 | Same Tree                         | [LeetCode][9] | O(n) | O(n)  | Both null → true; one null or val differs → false |
| 10 | Binary Tree Zigzag Level Order Traversal | [LeetCode][10] | O(n) | O(n) | BFS, alternate direction each level |

<!-- Links -->
[1]: https://neetcode.io/problems/binary-tree-inorder-traversal/question
[2]: https://neetcode.io/problems/binary-tree-preorder-traversal/question
[3]: https://neetcode.io/problems/binary-tree-postorder-traversal/question
[4]: https://leetcode.com/problems/binary-tree-level-order-traversal/
[5]: https://leetcode.com/problems/maximum-depth-of-binary-tree/
[6]: https://leetcode.com/problems/balanced-binary-tree/
[7]: https://leetcode.com/problems/diameter-of-binary-tree/
[8]: https://leetcode.com/problems/binary-tree-maximum-path-sum/
[9]: https://leetcode.com/problems/same-tree/
[10]: https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/
