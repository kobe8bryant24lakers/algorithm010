//给定一个 N 叉树，返回其节点值的前序遍历。
//
// 例如，给定一个 3叉树 :
//
//
//
//
//
//
//
// 返回其前序遍历: [1,3,5,6,2,4]。
//
//
//
// 说明: 递归法很简单，你可以使用迭代法完成此题吗? Related Topics 树


package com.shuzijun.leetcode.editor.en;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class NAryTreePreorderTraversal {
    public static void main(String[] args) {
        Solution solution = new NAryTreePreorderTraversal().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)

    // Definition for a Node.
    /*class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    };*/

    // 递归(一)
    /*class Solution {
        public List<Integer> preorder(Node root) {
            List<Integer> nums = new LinkedList<Integer>();
            if (root == null) {
                return nums;
            }
            if (root.children.size() == 0) {
                nums.add(root.val);
                return nums;
            }
            nums.add(root.val);
            for (Node child : root.children) {
                nums.addAll(preorder(child));
            }
            return nums;
        }
    }*/

    // 递归(二)
    /*class Solution {
        private List<Integer> nums = new LinkedList<Integer>();
        public List<Integer> preorder(Node root) {
            if (root == null) {
                return nums;
            }
            nums.add(root.val);
            for (Node child : root.children) {
                preorder(child);
            }
            return nums;
        }
    }*/

    // 迭代
    class Solution {
        public List<Integer> preorder(Node root) {
            LinkedList<Node> stack = new LinkedList<Node>();
            List<Integer> nums = new LinkedList<Integer>();
            if (root == null) {
                return nums;
            }
            stack.add(root);
            while (!stack.isEmpty()) {
                Node currentNode = stack.pollLast();
                nums.add(currentNode.val);
                Collections.reverse(currentNode.children);
                for (Node child : currentNode.children) {
                    stack.add(child);
                }
            }
            return nums;
        }
    }


    //leetcode submit region end(Prohibit modification and deletion)

}
