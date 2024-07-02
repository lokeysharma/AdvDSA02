package LLD_1.OOP4;


import java.util.Iterator;

public class Node implements Iterable<Node> {
    int data;
    Node next;
    public Node(int data) {
        this.data = data;
    }

    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

    @Override
    public Iterator<Node> iterator() {
        return new NodeIterator(this);
    }
}

