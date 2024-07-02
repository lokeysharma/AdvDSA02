package LLD_1.Concurrency.ThreadnCallable;


import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {

    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner(System.in);
            int m = sc.nextInt();
            ExecutorService executorService = Executors.newCachedThreadPool();
            ArrayCreator arr = new ArrayCreator(m);
            Future<List<Integer>> farr = executorService.submit(arr);
            List<Integer> list = farr.get();
            executorService.shutdown();
            System.out.println(list);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
