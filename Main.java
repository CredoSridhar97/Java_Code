class OuterClass{
    String Name="Sridhar";

    class InnerClass{
        String FullName="Sridhar Raj P";
        int Age=26;
    }
}

public class Main{
    public static void main(String[] args) {
        OuterClass OuterValue=new OuterClass();
        // System.out.println(OuterValue.Name);
        OuterClass.InnerClass InnerValue=OuterValue.new InnerClass();
        System.out.println(InnerValue.FullName);
        System.out.println(InnerValue.Age);

    }
}