package LLD_1.Generics;

public class Car implements Comparable<Car>{

    private int speed;
    private int power;

    public Car(int speed, int power) {
        this.speed = speed;
        this.power = power;
    }

    @Override
    public String toString() {
        return "[S=" + speed + ", P=" + power + "]";
    }


    @Override
    public int compareTo(Car o) {
        return o.speed - this.speed;
    }
}
