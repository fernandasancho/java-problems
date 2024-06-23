package com.example;


/**
 * Represents a node in a Binary Search Tree (BST).
 */
public class TreeNode {
    int key;        // The key value stored in the node
    TreeNode left;  // Pointer to the left child node
    TreeNode right; // Pointer to the right child node

    /**
     * Constructor to initialize a TreeNode with a given key value.
     * @param key The key value to store in the node.
     */
    public TreeNode(int key) {
        this.key = key;
        this.left = null;
        this.right = null;
    }
}


