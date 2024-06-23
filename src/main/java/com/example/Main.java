package com.example;

/**
 * Main class to test the TreeNode and BSTIterator classes.
 */
public class Main {
    public static void main(String[] args) {
        // Create a sample BST
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(8);

        // Create an iterator and iterate through the BST
        BSTIterator iterator = new BSTIterator(root);
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println(); // Output: 2 3 4 5 6 7 8
    }
}
