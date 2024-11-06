public class Day4P1 {
    public static void main(String args[]){
        Print(10);
    }
    public static void Print(int n){
        // Base Case 
        if (n==1)
        {
            System.out.println(1);
        }
        // Recursive Case
        else
        {
            System.out.println(n);
            Print(n-1);
        }
    }
}
