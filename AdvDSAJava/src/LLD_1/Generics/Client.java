package LLD_1.Generics;

import java.util.TreeSet;

public class Client {
    public static void main(String[] args) {

    }

    public Integer getJustLarger(TreeSet treeSet, int data){
        // write the code to return value equal to or just larger than data
        return (Integer) treeSet.higher(data);
    }

    public Integer getJustSmaller(TreeSet treeSet, int data){
        // write the code to return value equal to or just smaller than data
        return (Integer) treeSet.lower(data);
    }
}