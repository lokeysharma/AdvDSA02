package LLD_1.Generics;

import java.util.Iterator;

public class Node implements Iterable<Integer> {
    public int data;
    public Node next;

    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new NodeIterator(this);
    }
}


