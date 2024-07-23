package test;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {

        List<Goti> gotiya = new ArrayList<Goti>();

        gotiya.add(new King());
        gotiya.add(new Queen());

        for (Goti goti : gotiya) {
            goti.move();
        }
    }
}
