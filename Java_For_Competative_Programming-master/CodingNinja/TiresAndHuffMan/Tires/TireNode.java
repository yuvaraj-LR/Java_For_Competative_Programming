package CodingNinja.TiresAndHuffMan.Tires;

public class TireNode {

    char data;
    boolean isTerminal;

    TireNode[] children;
    int childCount;

    public TireNode(char data) {
        this.isTerminal = false;
        this.children = new TireNode[26];
        this.childCount = 0;
    }
}
