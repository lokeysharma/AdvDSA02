package LLD_1.OOP3;

import java.util.Stack;
import java.util.Iterator;

public class Client {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);

        // Make a call to display method as per question requirements here
        display(st);

    }

    // Write the display method as per requirements of question here

    public static void display(Iterable<?> stk) {

        for (Object o : stk) {
            System.out.println(o);
        }
    }

}