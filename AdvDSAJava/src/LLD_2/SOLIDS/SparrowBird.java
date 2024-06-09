package LLD_2.SOLIDS;

public class SparrowBird extends Birds implements Flyables{


    iFlyBehaviour flyBehaviour = new SlowFlyBehaviour();

    public SparrowBird(int weight, String Color, String type, String Size, String brekType) {
        super(weight, Color, type, Size, brekType);
    }

    @Override
    public void fly() {
        flyBehaviour.makeFly();
    }

    @Override
    public void Run() {

    }

    @Override
    public void Eat() {

    }
}
