
// ArrayList
import java.util.ArrayList;
import java.util.Collections;

public class Collections {
    public static void main(String args[]) {

        // ArrayList<Integer> Age=new ArrayList<Integer>();
        // Age.add(80);
        // Age.add(70);
        // Age.add(60);
        // Age.add(50);
        // for(int i:Age)
        // {
        //     System.out.println(i);
        // }
        
        ArrayList<String> Name = new ArrayList<String>();

        // Add Items - add() Method
        Name.add("Sridhar");
        Name.add("Abi");
        Name.add("Dinesh");
        Name.add("Raj Kumar");
        Name.add("Ramya");
        System.out.println(Name);

        // Sort an ArrayList
        Collections.sort(Name);
        for(String i:Name)
        {
            System.out.println(i);
        }

        

        // Loop - ArrayList
        // for (int i = 0; i < Name.size(); i++) {
        //     System.out.println(Name.get(i));
        // }

        // for(String i : Name)
        // {
        //     System.out.println(i);
        // }

        // Access an Item - get() Method
        // System.out.println(Name.get(1));

        // Change an Item - Set() Method
        // Name.set(1,"Raj Kumar");
        // System.out.println(Name);

        // Remove an Item - remove() Method
        // Name.remove(1);
        // System.out.println(Name);

        // ArrayList Size
        // System.out.println(Name.size());

        // Clear an Item - clear() Method
        // Name.clear();
        // System.out.println(Name);

    }
}
