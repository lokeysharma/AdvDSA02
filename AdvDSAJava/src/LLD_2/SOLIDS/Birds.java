package LLD_2.SOLIDS;

public abstract class Birds {

    // properties of all the birds
    int weight;
    String Color;
    String type;
    String Size;
    String brekType;

    public Birds(int weight, String Color, String type, String Size, String brekType) {
        this.weight = weight;
        this.Color = Color;
        this.type = type;
        this.Size = Size;
        this.brekType = brekType;
    }

    // public abstract void Fly();
    // public abstract void Swim();

    public abstract void Run();

    public abstract void Eat();


}