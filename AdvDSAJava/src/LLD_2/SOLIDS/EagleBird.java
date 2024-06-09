package LLD_2.SOLIDS;

import java.sql.SQLOutput;

public class EagleBird extends Birds implements Flyables{


    public EagleBird(int weight, String Color, String type, String Size, String brekType) {
        super(weight, Color, type, Size, brekType);
    }
    iFlyBehaviour flyBehaviour = new SlowFlyBehaviour();
    @Override
    public void fly() { // this bird can fly od implements flaybale interface.
        System.out.println("Yeah1 i can fly faster!!!!");
        flyBehaviour.makeFly();
    }

//    @Override  // cannot swim and we cannot force this to implement a method.
//    public void Swim() {
//        System.out.println("no I cannot swim, I think!!!");
//
//    }

    @Override
    public void Run() {
        System.out.println("Yeah, i think i can run");
    }

    @Override
    public void Eat() {
        System.out.println("Definitely needs to fuel this engine.");
    }
}
