package LLD_1.Generics;

import java.util.Iterator;

public class NodeIterator implements Iterator<Integer> {

    private Node current;
    public NodeIterator(Node current) {
        this.current = current;
    }

    @Override
    public boolean hasNext() {
        if(current == null) return false;
        else return true;
    }

    @Override
    public Integer next() {

        Node temp = this.current;
        this.current = this.current.next;
        return temp.data;
    }
}
