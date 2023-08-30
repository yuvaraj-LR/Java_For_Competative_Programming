package CodingNinja.BinaryTree.BST;

import CodingNinja.BinaryTree.Lecture.BinaryTreeNode;

public class BST {
    private BinaryTreeNode<Integer> root;
    private int size;

    private static boolean isPresentHelper(BinaryTreeNode<Integer> node, int x) {
        if (node == null) {
            return false;
        }

        if (node.data == x) {
            return true;
        }

        if (node.data < x) {
            return isPresentHelper(node.left, x);
        } else {
            return isPresentHelper(node.right, x);
        }
    }

    public boolean isPresent(int x) {
        return isPresentHelper(root, x);
    }

    public static BinaryTreeNode<Integer> insertHelper(BinaryTreeNode<Integer> root, int x) {
        if (root == null) {
            return new BinaryTreeNode<>(x);
        }

        if (root.data <= x) {
            root.right = insertHelper(root.right, x);
        } else {
            root.left = insertHelper(root.left, x);
        }

        return root;
    }

    public void insert(int x) {
        root = insertHelper(root, x);
        size++;
    }

    private static BSTDeleteReturn deleteDataHelper(BinaryTreeNode<Integer> root, int x) {
        if (root == null) return new BSTDeleteReturn(null, false);

        if (root.data < x) {
            BSTDeleteReturn outputRight = deleteDataHelper(root.right, x);
            outputRight.root = root;
            return outputRight;
        }

        if (root.data > x) {
            BSTDeleteReturn outputLeft = deleteDataHelper(root.left, x);
            outputLeft.root = root;
            return outputLeft;
        }

//        We know that root.data == x, And we need to handle 3 cases.

//        0 Children
        if (root.left == null && root.right == null) {
            return new BSTDeleteReturn(null, true);
        }

//        1 Children -> Left
        if (root.left != null && root.right == null) {
            return new BSTDeleteReturn(root.left, true);
        }

//        1 Children -> Right
        if (root.left == null && root.right != null) {
            return new BSTDeleteReturn(root.right, true);
        }

//        Both the children are present
        int rightMax = largest(root.right);
        root.data = rightMax;
        BSTDeleteReturn outputRight = deleteDataHelper(root.right, rightMax);
        root.right = outputRight.root;
        return new BSTDeleteReturn(root, true);
    }

    private static int largest(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return Integer.MAX_VALUE;
        }

        int leftValue = largest(root.left);
        int rightValue = largest(root.right);

        return Math.min(root.data, Math.min(leftValue, rightValue));
    }

    public boolean deleteData(int x) {
        return false;
    }

    private static void printTree2(BinaryTreeNode<Integer> root) {
        if (root == null) return;

        System.out.print(root.data + "-> ");

        if (root.left != null) {
            System.out.print("L: " + root.left.data + " ");
        }

        if (root.right != null) {
            System.out.print("R: " + root.right.data);
        }

        System.out.println();
        printTree2(root.left);
        printTree2(root.right);
    }

    public void printTree() {
        printTree2(root);
    }

    public static class BSTDeleteReturn {
        BinaryTreeNode<Integer> root;
        boolean deleted;

        public BSTDeleteReturn(BinaryTreeNode<Integer> root, boolean deleted) {
            this.root = root;
            this.deleted = deleted;
        }
    }
}
