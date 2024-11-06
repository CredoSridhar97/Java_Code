// public class Main3 {
//     enum topics{
//         Low,
//         Medium,
//         Hign
//     }

//     public static void main(String[] args) {
//         topics result=topics.Medium;
//         System.out.println(result);

//     }

// }


enum Level{
    Low,
    Medium,
    High
}

public class Main3{
    public static void main(String[] args) {
        Level result=Level.Low;

        switch (result) {
            case Low:
                System.out.println("Low Level");
                break;
            case Medium:
                System.out.println("Medium Level");
                break;
            case High:
                 System.out.println("HigH Level");
                 break;
        
           
        }
    }
}