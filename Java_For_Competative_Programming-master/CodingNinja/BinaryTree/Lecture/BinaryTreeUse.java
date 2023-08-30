package CodingNinja.BinaryTree.Lecture;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BinaryTreeUse {

    public static class BalancedTree {
        int height;
        boolean isBal;

        public BalancedTree() {
            height = 0;
            isBal = true;
        }
    }

    public static BalancedTree checkIfTreesAreBalancedBetter(BinaryTreeNode<Integer> root) {
        if (root == null) {
            BalancedTree ans = new BalancedTree();
            return ans;
        }

        BalancedTree leftTree = checkIfTreesAreBalancedBetter(root.left);
        BalancedTree rightTree = checkIfTreesAreBalancedBetter(root.right);

        BalancedTree ans = new BalancedTree();

        int height = 1 + Math.max(leftTree.height, rightTree.height);

        if (Math.abs(leftTree.height - rightTree.height) > 1) {
            ans.isBal = false;
        }

        if (!leftTree.isBal || !rightTree.isBal) {
            ans.isBal = false;
        }

        ans.height = height;
        return ans;
    }

    public static int heightOfTree(BinaryTreeNode<Integer> root) {
        if (root == null) return 0;

        int leftHeight = heightOfTree(root.left);
        int rightHeight = heightOfTree(root.right);

        return Math.max(leftHeight, rightHeight) + 1;
    }
    public static boolean checkIfTreesAreBalanced(BinaryTreeNode<Integer> root) {
        if (root == null) return true;

        int leftHeight = heightOfTree(root.left);
        int rightHeight = heightOfTree(root.right);

        if (Math.abs(leftHeight - rightHeight) > 1) {
            return false;
        }

        boolean isLeftBalance = checkIfTreesAreBalanced(root.left);
        boolean isRightBalance = checkIfTreesAreBalanced(root.right);

        return isLeftBalance && isRightBalance;
    }

    public static int getSum(BinaryTreeNode<Integer> root) {
        //Your code goes here.

        if (root == null) return 0;

        int sumOfLeft = getSum(root.left);
        int sumOfRight = getSum(root.right);

        return root.data + sumOfLeft + sumOfRight;

    }
    public static int numberOfNodes(BinaryTreeNode<Integer> root) {
        if (root == null) return 0;

        int leftNodeCount = numberOfNodes(root.left);
        int rightNodeCount = numberOfNodes(root.right);

        return 1 + leftNodeCount + rightNodeCount;
    }

    public static BinaryTreeNode<Integer> takingInputInLevelWise() {
        Scanner sc = new Scanner(System.in);
        int rootData = sc.nextInt();

        if (rootData == -1) {
            return null;
        }

        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootData);
        Queue<BinaryTreeNode<Integer>> pendingChildren = new LinkedList<>();

        pendingChildren.add(root);

        while(!pendingChildren.isEmpty()) {
            BinaryTreeNode<Integer> front = pendingChildren.poll();
            System.out.print("Enter left child for " + front.data + " ");
            int leftValue = sc.nextInt();

            if (leftValue != -1) {
                BinaryTreeNode<Integer> leftChild = new BinaryTreeNode<>(leftValue);
                front.left = leftChild;
                pendingChildren.add(leftChild);
            }

            System.out.print("Enter right child for " + front.data + " ");
            int rightValue = sc.nextInt();

            if (leftValue != -1) {
                BinaryTreeNode<Integer> rightChild = new BinaryTreeNode<>(rightValue);
                front.right = rightChild;
                pendingChildren.add(rightChild);
            }
        }

        return root;
    }

    public static int max(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return Integer.MIN_VALUE;
        }

        int leftValue = max(root.left);
        int rightValue = max(root.right);

        return (Math.max(root.data, Math.max(leftValue, rightValue)));
    }

    public static int min(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return Integer.MAX_VALUE;
        }

        int leftValue = min(root.left);
        int rightValue = min(root.right);

        return (Math.min(root.data, Math.min(leftValue, rightValue)));
    }



    public static boolean isBST(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return true;
        }

        int leftMax = max(root);
        int rightMin = min(root);

        if (leftMax >= root.data) {
            return false;
        }

        if (rightMin < root.data) {
            return false;
        }

        boolean isLeftBST = isBST(root.left);
        boolean isRightBST = isBST(root.right);

        return isLeftBST && isRightBST;

    }

    public static BinaryTreeNode<Integer> takeInputLevelWise() {
        Scanner sc = new Scanner(System.in);
        int rootData = sc.nextInt();

        if (rootData == -1) return null;

        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootData);
        Queue<BinaryTreeNode<Integer>> pendingChildren = new LinkedList<>();
        pendingChildren.add(root);

        while(!pendingChildren.isEmpty()) {
            BinaryTreeNode<Integer> front = pendingChildren.poll();

            System.out.print("Enter the Left Children for " + front.data);
            int left = sc.nextInt();

            if (left != -1) {
                BinaryTreeNode<Integer> leftChild = new BinaryTreeNode<>(left);
                front.left = leftChild;
                pendingChildren.add(leftChild);
            }

            System.out.print("Enter the Right Children for " + front.data);
            int right = sc.nextInt();

            if (right != -1) {
                BinaryTreeNode<Integer> rightChild = new BinaryTreeNode<>(right);
                front.right = rightChild;
                pendingChildren.add(rightChild);
            }
        }

        return root;
    }

    public static BinaryTreeNode<Integer> takeInputBetter(boolean isFirstNode, int parentRootData, boolean isLeft) {

        if (isFirstNode) {
            System.out.print("Enter the first root value: ");
        } else {
            if (isLeft) {
                System.out.print("Enter the left value of " + parentRootData + " ");
            } else {
                System.out.print("Enter the right value of " + parentRootData + " ");
            }
        }
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n == -1) {
            return null;
        }

        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(n);
        BinaryTreeNode<Integer> leftChild = takeInputBetter(false, n, true);
        BinaryTreeNode<Integer> rightChild = takeInputBetter(false, n, false);

        root.left = leftChild;
        root.right = rightChild;

        return root;
    }

    public static BinaryTreeNode<Integer> takeInput() {
        System.out.print("Enter the value: ");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n == -1) {
            return null;
        }

        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(n);
        BinaryTreeNode<Integer> leftChild = takeInput();
        BinaryTreeNode<Integer> rightChild = takeInput();

        root.left = leftChild;
        root.right = rightChild;

        return root;
    }

    public static void printTree1(BinaryTreeNode<Integer> root) {
        if (root == null) return;

        System.out.print(root.data + "->");

        printTree1(root.left);
        printTree1(root.right);
    }

    public static void printTree2(BinaryTreeNode<Integer> root) {
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

    public static int height(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return 0;
        }

        int leftCount = height(root.left);
        int rightCount = height(root.right);

        return Math.max(leftCount, rightCount) + 1;

    }

    public static void main(String[] args) {
//        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(1);
//
//        BinaryTreeNode<Integer> left = new BinaryTreeNode<>(2);
//        BinaryTreeNode<Integer> right = new BinaryTreeNode<>(3);
//
//        root.left = left;
//        root.right = right;
//
//        BinaryTreeNode<Integer> leftThRight = new BinaryTreeNode<>(4);
//        BinaryTreeNode<Integer> rightThLeft = new BinaryTreeNode<>(5);
//
//        left.right = leftThRight;
//        right.left = rightThLeft;
//        BinaryTreeNode<Integer> node = takeInputBetter(true, 1, true);
//        int count = numberOfNodes(node);
//        System.out.println("Total Number of counts" + count);
//
//        printTree2(node);
//
//        int height = height(node);
//        System.out.println(height);
//
//        BinaryTreeNode<Integer> node = takeInputBetter(true, 1, false);

        BinaryTreeNode<Integer> node = takingInputInLevelWise();
        System.out.println(isBST(node));
        printTree2(node);

        System.out.println(checkIfTreesAreBalancedBetter(node).isBal);

    }
}
