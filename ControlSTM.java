class ControlSTM{
    public static void main(String args[]){
        // int age=2;
        // if(age>=18)
        // {
        //     System.out.println("Vote E");
        // }

        // int age=2;
        // if(age>=18){
        //     System.out.println("Vote E");
        // }
        // if(age<18){
        //     System.out.println("Not Vote E");
        // }

        // boolean attendance=false;
        // if(attendance==true)
        // {
        //     System.out.println("Attended Class");
        // }
        // if(attendance==false)
        // {
        //     System.out.println("Not Attended Class");
        // }

        // boolean attendance=false;
        // if(attendance==true){
        //     System.out.println("Attended Class");
        // }
        // else
        // {
        //     System.out.println("Not Attended Class");
        // }

        // int Number=10;
        // if(Number%2!=0){
        //     System.out.println("Odd Number");
        // }
        // else
        // {
        //     System.out.println("Even Number");
        // }

        // int year=2024;
        // if(year%4==0)
        // {
        //     System.out.println("Leap Year");
        // }
        // else
        // {
        //     System.out.println("Not Leap Year");
        // }

        // int Mark=32;
        // if(Mark>=35){
        //     System.out.println("Pass");
        // }
        // else
        // {
        //     System.out.println("Fail");
        // }

        // int Num1=10;
        // int Num2=20;
        // if(Num1>Num2){
        //     System.out.println("Num1 is Biggest Number");
        // }
        // else
        // {
        //     System.out.println("Num2 is Biggest Number");
        // }

        // int Number=0;
        // if(Number<0){
        //     System.out.println("-ve");
        // }
        // else if(Number>0)
        // {
        //     System.out.println("+ve");
        // }
        // else if(Number==0)
        // {
        //     System.out.println("Zero");
        // }

        // int Num1=500;
        // int Num2=100;
        // int Num3=15;

        // if(Num1>Num2 && Num1>Num3){
        //     System.out.println("Num1 is Biggest Number");
        // }

        // else if (Num2>Num1 &&  Num2>Num3)
        // {
        //     System.out.println("Num2 is Biggest Number");
        // }

        // else if(Num3>Num1 && Num3>Num2)
        // {
        //     System.out.println("Num3 is Biggest Number");
        // }

        // int a=500;
        // int b=100;
        // int c=15;
        // if(a>b){
        //     if(a>c)
        //     {
        //         System.out.println("A is Biggest Number");
        //     }
        //     else
        //     {
        //         System.out.println("C is Biggest Number");
        //     }
        // }
        // else
        // {
        //     if(b>c)
        //     {
        //         System.out.println("B is Biggest Number");
        //     }
        //     else
        //     {
        //         System.out.println("C is Biggest Number ");
        //     }
        // }

        // char attendance='o';
        // if(attendance=='p'){
        //     System.out.println("Attended Classes");
        // }
        // else if(attendance=='o'){
        //     System.out.println("On-Duty");
        // }
        // else
        // {
        //     System.out.println("Not Attended Classes");
        // }

        char attendance='p';
        int total=20;
        if(attendance=='p'){
            if(total>=40)
            {
                System.out.println("Attended Class");
            }
            else
            {
                System.out.println("Not Attended Class");
            }
        }
    }
}