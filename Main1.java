//Abstract Class
abstract class Animal{
    public abstract void animalSound();
    public void sleep()
    {
        System.out.println("Animal Sleep Sound - ZZZ");
    }
}

class Pig extends Animal{
    @Override
    public void animalSound() {
        System.out.println("Animal Sound - Wee Wee");
    }
}


public class Main1 {
    public static void main(String[] args) {
        Pig PigValue=new Pig();
        PigValue.animalSound();
        PigValue.sleep();
    }
}
