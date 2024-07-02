package LLD_1.TestLLD01;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicCounter {

    private AtomicInteger counter = new AtomicInteger(0);

    public void incrementCounter(){
        counter.incrementAndGet();
    }

    public int getCounter() {
        return counter.get();
    }

    public static void main(String[] args) {
        AtomicCounter counter = new AtomicCounter();

        for (int i = 0; i < 5; i++) {
            new Thread(() -> {
                counter.incrementCounter();
            }).start();
        }

        try{
            Thread.sleep(2000);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }

        int fincalCounter = counter.getCounter();
        System.out.println(fincalCounter);
    }
}
