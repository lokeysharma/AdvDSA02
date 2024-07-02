package LLD_1.Concurrency.ThreadnCallable;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public class ArrayCreator implements Callable<List<Integer>> {
    int n;
    List<Integer> list;
    public ArrayCreator(int n) {
        this.n = n;
        this.list = new ArrayList<Integer>();
    }

    @Override
    public List<Integer> call() throws Exception {

        for (int i = 0; i < n; i++) {
            this.list.add(i);
        }
        return this.list;
    }
}
