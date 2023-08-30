package CodingNinja.TiresAndHuffMan.Tires;

public class Tires {
    private TireNode tree;

    public Tires() {
        this.tree = new TireNode('\0');
    }

    public void add(String s) {
        addHelper(tree, s);
    }

    public void addHelper(TireNode root, String word) {
        if (word.isEmpty()) {
            root.isTerminal = true;
            return;
        }

        int childIndex = word.charAt(0) + 'A';
        TireNode child = root.children[childIndex];

        if (child == null) {
            child = new TireNode(word.charAt(0));
            root.children[childIndex] = child;
            root.childCount++;
        }

        addHelper(child, word.substring(1));
    }

    private boolean search(String s) {
        return searchHelper(tree, s);
    }

    public boolean searchHelper(TireNode root, String word) {
        if (word.isEmpty()) {
            return root.isTerminal;
        }
        int childIndex = word.charAt(0) - 'A';
        TireNode child = root.children[childIndex];

        if(child == null) {
            return false;
        }

        return searchHelper(child, word.substring(1));
    }

    private void removeHelper(TireNode root, String word) {
        if (word.isEmpty()) {
            root.isTerminal = false;
            return;
        }
        int childIndex = word.charAt(0) - 'A';
        TireNode child = root.children[childIndex];

        if(child == null) {
            return;
        }

        removeHelper(child, word.substring(1));

        if (!child.isTerminal && child.childCount == 0) {
            root.children[childIndex] = null;
            root.childCount--;
        }
    }

    public void remove(String s) {
        removeHelper(tree, s);
    }



}
