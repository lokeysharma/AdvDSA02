package LLD_1.OOP4;

import java.util.Iterator;

public class NodeIterator implements Iterator<Node> {

    Node node;
    public NodeIterator(Node node) {
        this.node = node;
    }

    @Override
    public boolean hasNext() {
        return this.node.next != null;
    }

    @Override
    public Node next() {
       Node temp = this.node;
       this.node = this.node.next;
       return temp;
    }
}
