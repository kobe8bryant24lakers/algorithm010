//根据一棵树的前序遍历与中序遍历构造二叉树。
//
// 注意:
//你可以假设树中没有重复的元素。
//
// 例如，给出
//
// 前序遍历 preorder = [3,9,20,15,7]
//中序遍历 inorder = [9,3,15,20,7]
//
// 返回如下的二叉树：
//
//     3
//   / \
//  9  20
//    /  \
//   15   7
// Related Topics 树 深度优先搜索 数组


package com.shuzijun.leetcode.editor.en;

import javax.swing.tree.TreeNode;

public class ConstructBinaryTreeFromPreorderAndInorderTraversal {
    public static void main(String[] args) {
        Solution solution = new ConstructBinaryTreeFromPreorderAndInorderTraversal().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)

    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     * int val;
     * TreeNode left;
     * TreeNode right;
     * TreeNode(int x) { val = x; }
     * }
     */
    class Solution {
        public TreeNode buildTree(int[] preorder, int[] inorder) {
            return buildTreeHelper(preorder, 0, preorder.length, inorder, 0, inorder.length);
        }

        private TreeNode buildTreeHelper(int[] preorder, int p_start, int p_end, int[] inorder, int i_start, int i_end) {
            if (p_start == p_end) {
                return null;
            }
            TreeNode rootNode = new TreeNode(preorder[p_start]);
            int i_root_idx = 0;
            for (int i = i_start; i < i_end; i++) {
                if (preorder[p_start] == inorder[i]) {
                    i_root_idx = i;
                }
            }
            int leftNum = i_root_idx - i_start;
            rootNode.left = buildTreeHelper(preorder, p_start + 1, p_start + leftNum + 1, inorder, i_start, i_root_idx);
            rootNode.right = buildTreeHelper(preorder, p_start + leftNum + 1, p_end, inorder, i_root_idx + 1, i_end);
            return rootNode;
        }

    }
    //leetcode submit region end(Prohibit modification and deletion)

}
