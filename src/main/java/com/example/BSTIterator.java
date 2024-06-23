package com.example;

import java.util.Stack;

/**
 * Iterator implementation for iterating through a Binary Search Tree (BST) in ascending order.
 */
public class BSTIterator {
    private final Stack<TreeNode> stack; // Stack to store nodes for inorder traversal

    /**
     * Constructor to initialize the BSTIterator with the root of the BST.
     * @param root The root node of the Binary Search Tree.
     */
    public BSTIterator(TreeNode root) {
        stack = new Stack<>();
        pushLeftNodes(root); // Start by pushing all left nodes onto the stack
    }

    /**
     * Checks if there are more nodes to iterate (i.e., if there are nodes left in the stack).
     * @return true if there are more nodes to iterate; false otherwise.
     */
    public boolean hasNext() {
        return !stack.isEmpty();
    }

    /**
     * @return The next smallest element in the BST.
     */
    public int next() {
        TreeNode node = stack.pop();     // Pop the current node from the stack
        pushLeftNodes(node.right);       // Push all left nodes of the popped node's right subtree
        return node.key;                 // Return the key of the popped node (next smallest element)
    }

    /**
     * Helper method to push all left nodes of a subtree onto the stack.
     * @param node The root node of the subtree.
     */
    private void pushLeftNodes(TreeNode node) {
        while (node != null) {
            stack.push(node);           // Push current node onto the stack
            node = node.left;           // Move to the left child of the current node
        }
    }
}
