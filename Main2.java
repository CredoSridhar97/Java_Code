// interface Animal1 {
//     public void animalSound();

//     public void sleep();
// }

// class Pig1 implements Animal1 {
//     public void animalSound() {
//         System.out.println("Wee Wee");
//     }

//     public void sleep() {
//         System.out.println("Zzz");
//     }
// }

// public class Main2 {
//     public static void main(String args[]) {
//         Pig1 PigValue = new Pig1();
//         PigValue.animalSound();
//         PigValue.sleep();
//     }

// }


interface Mother
{
    public void myMethod1();
}
interface Father
{
    public void myMethod2();
}

class Son implements Mother,Father{
    public void myMethod1()
    {
        System.out.println("Mother Process");
    }
    public void myMethod2()
    {
        System.out.println("Father Process");
    }
}

class Main2{
    public static void main(String args[])
    {
        Son Value=new Son();
        Value.myMethod1();
        Value.myMethod2();
    }
}