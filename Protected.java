// when methods and data members are declared protected,
// we can access then within the same package as well as for subclasses
class ProtectedValue {
    protected void display()
    {
        System.out.println("Hi Welcome to Credo Systemz - Back End Web Development - Java+SpringBoot");
    }
}

class Protected1 extends ProtectedValue{
    public static void main(String args[])
    {
        Protected1 PR=new Protected1();
        PR.display();
    }
}
