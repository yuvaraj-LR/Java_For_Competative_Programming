package CodingNinja.BinaryTree.GenericTree;

import java.util.ArrayList;

public class GenericTree<T> {
    int data;
    ArrayList<GenericTree<Integer>> children;

    public GenericTree(int data) {
        this.data = data;
        this.children = new ArrayList<GenericTree<Integer>>();
    }
}
