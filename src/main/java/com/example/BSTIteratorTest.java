package com.example;

public class BSTIteratorTest {

    public static void main(String[] args) {
        // Create a sample BST
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(8);

        // Test the BSTIterator
        BSTIterator iterator = new BSTIterator(root);

        // Test hasNext() and next() methods
        System.out.println("In-order traversal using BSTIterator:");
        while (iterator.hasNext()) {
            int nextValue = iterator.next();
            System.out.print(nextValue + " ");
        }
        System.out.println(); // Output: 2 3 4 5 6 7 8

        // Additional tests can be added to verify specific cases
    }
}
