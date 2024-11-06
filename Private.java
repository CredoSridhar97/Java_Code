// // when variables and methods are declared private
// // they cannot be accessed outside of the class
// public class PrivateValue {
//     //private variable
//     private String Name;
// }

// public class Private

// {
//     public static void main(String args[])
//     {
//         PrivateValue PV=new PrivateValue();
//         PV.name="Credo Systemz";
//     }
// }


class PrivateValue{
    private String Name;

    public String getName()
    {
        return this.Name;
    }

    public void setName(String Name)
    {
        this.Name=Name;
    }
}

public class Private{
    public static void main(String args[])
    {
        PrivateValue PV=new PrivateValue();

        PV.setName("Credo Systemz");
        System.out.println(PV.getName());

    }
}