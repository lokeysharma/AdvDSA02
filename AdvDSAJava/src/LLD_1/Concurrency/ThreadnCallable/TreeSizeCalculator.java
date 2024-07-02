package LLD_1.Concurrency.ThreadnCallable;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class TreeSizeCalculator implements Callable<Integer> {

    private Node root;
    private ExecutorService executorService;

    public TreeSizeCalculator(Node root, ExecutorService executorService) {
        this.root = root;
        this.executorService = executorService;
    }

    @Override
    public Integer call() throws Exception {

        if(this.root == null)
            return 0;

        Node LeftTree = root.left;
        Node RightTree = root.right;

        TreeSizeCalculator leftTreeSizeCalculator = new TreeSizeCalculator(LeftTree, executorService);
        TreeSizeCalculator rightTreeSizeCalculator = new TreeSizeCalculator(RightTree, executorService);

        Future<Integer> leftTreeSizeFuture = executorService.submit(leftTreeSizeCalculator);
        Future<Integer> rightTreeSizeFuture = executorService.submit(rightTreeSizeCalculator);

        return leftTreeSizeFuture.get() + rightTreeSizeFuture.get() + 1;
    }
}
