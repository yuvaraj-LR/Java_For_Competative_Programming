package CodingNinja.BinaryTree.GenericTree;

public class TreeUse {

    public static void printTree1(GenericTree<Integer> root) {

        if(root == null) {
            return;
        }

        System.out.print(root.data + ": ");

        for (int i = 0; i < root.children.size(); i++) {
            System.out.print(root.children.get(i).data + " ");
        }

        System.out.println();

        for (int i = 0; i < root.children.size(); i++) {
            GenericTree<Integer> child = root.children.get(i);
            printTree1(child);
        }
    }

    public static void main(String[] args) {
        GenericTree<Integer> root = new GenericTree<>(0);

        GenericTree<Integer> node1 = new GenericTree<>(1);
        GenericTree<Integer> node2 = new GenericTree<>(2);
        GenericTree<Integer> node3 = new GenericTree<>(3);
        GenericTree<Integer> node4 = new GenericTree<>(4);
        GenericTree<Integer> node5 = new GenericTree<>(5);
        GenericTree<Integer> node6 = new GenericTree<>(6);

        root.children.add(node1);
        node1.children.add(node2);
        node1.children.add(node3);
        node1.children.add(node4);
        node2.children.add(node5);
        node3.children.add(node6);

        printTree1(root);


    }
}
