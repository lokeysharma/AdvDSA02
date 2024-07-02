package LLD_1.TestLLD01;

public class newthread implements Runnable{
    Thread t;
    newthread(){
        t = new Thread(this, "New Thread");
        t.start();
    }

    @Override
    public void run() {
        System.out.println(t.getName());
    }
}
