package LLD_1.Concurrency.SemaPhores;

import java.util.concurrent.Semaphore;

public  class foo{

    private Semaphore firstSema;
    private Semaphore secondSema;
    private Semaphore thirdSema;

    public foo(){
        firstSema = new Semaphore(1);
        secondSema = new Semaphore(0);
        thirdSema = new Semaphore(0);
    }

    public void first(Runnable printFirst) throws InterruptedException {
        // printFirst.run() outputs "first". Do not change or remove this line.
        firstSema.acquire();
        printFirst.run();
        secondSema.release();
    }

    public void second(Runnable printSecond) throws InterruptedException {
        // printSecond.run() outputs "second". Do not change or remove this line.
        secondSema.acquire();
        printSecond.run();
        thirdSema.release();
    }

    public void third(Runnable printThird) throws InterruptedException {
        // printThird.run() outputs "third". Do not change or remove this line.
        thirdSema.acquire();
        printThird.run();
        firstSema.release();
    }
}
