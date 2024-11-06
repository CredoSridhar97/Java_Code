// // import java.util.Scanner;

// // class Main {
// //   public static void main(String[] args) {

// //     // creates an object of Scanner
// //     Scanner input = new Scanner(System.in);
// //     System.out.print("Enter your name: ");

// //     // reads the entire word
// //     String value = input.next();
// //     System.out.println("Using next(): " + value);

// //     input.close();
// //   }
// // }


// // public class Main {
// //     public static void main(String[] args) {
// //       String greeting = "Hello"; 
// //       System.out.println(greeting);
// //     }
// //   }

// public class Main {
//   public static void main(String args[]) {
//     // String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
//     // System.out.println("The length of the text string is: " + txt.length());

//     // String txt = "Hello World";
//     // System.out.println(txt.toUpperCase());
//     // System.out.println(txt.toLowerCase());


//     // String txt = "Please locate where 'locate' occurs!";
//     // System.out.println(txt.indexOf("loc"));
//     // System.out.println(txt.lastIndexOf(" "));


//     // System.out.println(Math.sqrt(64));  
//     // System.out.println(Math.abs(-4.7));  

//     int randomNum = (int)(Math.random() * 10000);  // 0 to 1000
//     System.out.println(randomNum);




//   }
// }


import java.time.LocalDateTime;  // import the LocalTime class

public class Main {  
  public static void main(String[] args) {  
    LocalDateTime myObj = LocalDateTime.now();
    System.out.println(myObj);
  }  
}  


  
