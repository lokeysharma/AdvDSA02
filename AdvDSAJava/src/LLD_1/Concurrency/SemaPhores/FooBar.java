package LLD_1.Concurrency.SemaPhores;

import java.util.concurrent.Semaphore;

public class FooBar {
    private int n;
    private Semaphore firstSema;
    private Semaphore secondSema;


    public FooBar(int n) {
        this.n = n;
        firstSema = new Semaphore(1);
        secondSema = new Semaphore(0);
    }

    public void foo(Runnable printFoo) throws InterruptedException {

        for (int i = 0; i < n; i++) {
            firstSema.acquire();
            // printFoo.run() outputs "foo". Do not change or remove this line.
            printFoo.run();
            secondSema.release();
        }
    }

    public void bar(Runnable printBar) throws InterruptedException {

        for (int i = 0; i < n; i++) {
            secondSema.acquire();
            // printBar.run() outputs "bar". Do not change or remove this line.
            printBar.run();
            firstSema.release();
        }
    }
}
