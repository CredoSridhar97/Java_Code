// // Number is Even or Odd

// import java.util.Scanner;

// class NumberisEvenorOdd
// {
//     public static void main(String args[])
//     {
//         int num;
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter an Interger : ");
//         num=sc.nextInt();
//         if(num%2==0)
//         {
//             System.out.println("Number is Even");
//         }
//         else
//         {
//             System.out.println("Number is Odd");
//         }
//     }
// }

// import java.util.Scanner;

// class Factorial
// {
//     public static void main(String args[])
//     {
//         int n,fact=1;

//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter the Number : ");
//         n=sc.nextInt();
//         for(int i=1;i<=n;i++)
//         {
//             fact=fact*i;
//         }
//         System.out.println("Factorial of "+n+" is "+fact);
//     }
// }


// import java.util.Scanner;

// class SwapTwoNumber
// {
//     public static void main(String args[])
//     {
//         int x;
//         int y;
//         int temp;

//         Scanner sc=new Scanner(System.in);

//         System.out.println("Enter the value of x and y");
//         x=sc.nextInt();
//         y=sc.nextInt();

//         System.out.println("Before Swapping x="+x+" y="+y);

//         temp=x;
//         x=y;
//         y=temp;

//         System.out.println("After Swapping x="+x+" y="+y);
//     }
// }

// import java.util.Scanner;

// class ReverseNumber
// {
//     public static void main(String args[])
//     {
//         int a,b;
//         int d=0;

//         Scanner sc=new Scanner(System.in);

//         System.out.println("Enter the Number :");
//         a=sc.nextInt();

//         while(a>0)
//         {
//             b=a%10;
//             a=a/10;
//             d=(d*10)+b;
//         }
//         System.out.println("Reverse is "+d);
//     }
// }


// class PatternProg
// {
//     public static void main(String args[])
//     {
//         for(int i=1;i<=5;i++)
//         {
//             for(int j=1;j<=5;j++)
//             {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }


// class PatternProg
// {
//     public static void main(String args[])
//     {
//         for(int i=1;i<=5;i++)
//         {
//             for(int j=1;j<=5;j++)
//             {
//                 System.out.print(i);
//             }
//             System.out.println();
//         }
//     }
// }


// class PatternProg
// {
//     public static void main(String args[])
//     {
//         for(int i=1;i<=5;i++)
//         {
//             for(int j=1;j<=5;j++)
//             {
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     }
// }

// class PatternProg
// {
//     public static void main(String args[])
//     {
//         for(int i=5;i>=1;i--)
//         {
//             for(int j=1;j<=5;j++)
//             {
//                 System.out.print(i);
//             }
//             System.out.println();
//         }
//     }
// }

class PatternProg{
    public static void main(String args[]){
        for(int i=5;i>=1;i--)
        {
            for(int j=5;j>=1;j--)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}