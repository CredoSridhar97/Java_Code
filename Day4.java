class Day4 {
    public static void main(String args[]){
        // add();
        // add(50,50);

        // System.out.println(add());
        // System.out.println(add(12,12));

        int res=add(15,15);
        System.out.println(res);
        res=res*10;
        System.out.println(res);
        System.out.println("Method Calling");
    }

    //1 With out Any arg, With out return type
    // public static void add(){
    //     int a=10;
    //     int b=40;
    //     int c=a+b;
    //     System.out.println(c);
    // }

    //2 with arg, without return type
    // public static void add(int a, int b){
    //     int c=a+b;
    //     System.out.println(c);
    // }

    //3 with out arg, with return type
    // public static int add(){
    //     int a=20;
    //     int b=20;
    //     int c=a+b;
    //     return c;
    // }

    //4 with arg, with return type
    // public static int add(int a, int b){
    //     int c=a+b;
    //     return c;
    // }

    public static int add(int a, int b){
        int c=a+b;
        return c;
    }






    
}
