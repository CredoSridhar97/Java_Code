// public class Methods {
//     static void Mymethod()
//     {
//         System.out.println("Hi Welcome to Credo Systemz");
//     }

//     public static void main(String[] args) {
//         Mymethod();
//         Mymethod();
//         Mymethod();
//     }
// }

// Java Method Parameters - Parameters and Arguments 

// public class Methods
// {
//     static void Mymethod(String FName)
//     {
//         System.out.println("Hi "+FName+" Welcome to Credo Systemz");
//     }
//     public static void main(String[] args) {
//         Mymethod("Sridhar");
//         Mymethod("Raja");
//     }
// }

//Multiple Parameters 

// public class Methods
// {
//     static void Mymethod(String Course, int RegNo)
//     {
//         System.out.println(Course+" "+RegNo);
//     }
//     public static void main(String[] args) {
//         Mymethod("React",122);
//         Mymethod("Angular",121);
//     }
// }

// Return Values 

// public class Methods
// {
//     static int Mymethod(int x){
//         return 100+x;
//     }

//     public static void main(String[] args) {
//         System.out.println(Mymethod(10000));
//     }
// }

// public class Methods{
//     static int Mymethod(int x, int y,int z, int a, int b)
//     {
//         return x+y+z+a+b;
//     }
//     public static void main(String[] args) {
//         System.out.println(Mymethod(90,80,70,89,90));
//     }
// }

// public class Methods{
//     static int Mymethod(int a, int b)
//     {
//         return a+b;
//     }
//     public static void main(String[] args) {
//         int answer=Mymethod(100,90);
//         System.out.println(answer);
//     }
// }

//Method with if..else

// public class Methods{
//     static void checkvote(int vote)
//     {
//         if(vote>18)
//         {
//             System.out.println("VE");
//         }
//         else
//         {
//             System.out.println("NVE");
//         }
//     }

//     public static void main(String[] args) {
//         checkvote(8);        
//     }
// }

// Method Overloading
// multiple methods can have the same name with different parameters - Method Overloding 
// Multiple Methods can have the same name as long as the number and/ or type of parameters are different

// public class Methods {
//     static int Mymethod(int x, int y)
//     {
//         return x+y;
//     }
//     static double Mymethod(double x, double y)
//     {
//         return x+y;
//     }

//     public static void main(String[] args) {
//        int myNum1=Mymethod(9,9);
//        double myNum2=Mymethod(1.2,1.3);
//        System.out.println(myNum1);
//        System.out.println(myNum2); 
//     }
// }


// public class Methods{
//     static int MymethodInt(int x,int y)
//     {
//         return x+y;
//     }

//     static int MymethodDouble( int x, int y)
//     {
//         return x+y;
//     }

//     public static void main(String[] args) {
//         int Num1=MymethodInt(10, 10);
//         int Num2=MymethodDouble(1,1);
//         System.out.println(Num1);
//         System.out.println(Num2);
//     }
// }


// public class Methods{
//     public static void main(String[] args) {
//         int result=Sum(4);
//         System.out.println(result);
//     }

//     public static int Sum(int num)
//     {
//         if(num>0)
//         {
//             return num+Sum(num-1);
//             //4+Sum(4-1=3)
//             //4+3+Sum(3-1=2)
//             //4+3+2+Sum(2-1=1)
//             //4+3+2+1+Sum(1-1=0)
//             //4+3+2+1+0
//         }
//         else
//         {
//             return 0;
//         }
//     }
// }

// 10+Sum(10-1=9)
// 10+9+8
//10+9+8+7
//10+9+8+7+6
//10+9+8+7+6+5
//10+9+8+7+6+5+4
// 10+9+8+7+6+5+4+3
// 10+9+8+7+6+5+4+3+2
// 10+9+8+7+6+5+4+3+2+1
// 10+9+8+7+6+5+4+3+2+1+0