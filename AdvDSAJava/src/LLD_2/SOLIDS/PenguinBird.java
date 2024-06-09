package LLD_2.SOLIDS;

public class PenguinBird extends Birds implements Swimmers{

    public PenguinBird(int weight, String Color, String type, String Size, String brekType) {
        super(weight, Color, type, Size, brekType);
    }

//    @Override
//    public void Fly() {
//        // so we are breaking Liskovs principle
//        System.out.println("Penguins cannot Fly");
//    }

    @Override
    public void swim() {
        System.out.println("Yeah i can swim ");
    }

    @Override
    public void Run() {
        System.out.println("Yeah, i think i can run");
    }

    @Override
    public void Eat() {
        System.out.println("Definitely needs to fuel this engine.");
    }
}
