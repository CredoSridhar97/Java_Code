public class Array {
    public static void main(String args[]) {
        // int[] rollno = new int[10];
        // rollno[0] = 1;
        // rollno[1] = 2;
        // rollno[5] = 6;
        // rollno[9] = 5;
        // System.out.println(rollno[0]);
        // System.out.println(rollno[1]);
        // System.out.println(rollno[2]);
        // System.out.println(rollno[3]);
        // System.out.println(rollno[4]);
        // System.out.println(rollno[5]);
        // System.out.println(rollno[6]);
        // System.out.println(rollno[7]);
        // System.out.println(rollno[8]);
        // System.out.println(rollno[9]);

        // int[] rollno = new int[10];
        // rollno[0] = 1;
        // rollno[1] = 2;
        // rollno[5] = 6;
        // rollno[9] = 5;

        // for (int i = 0; i < rollno.length; i++) {
        // System.out.println(rollno[i]);
        // }

        // int[][] matrix=new int[2][2];
        // matrix[0][0]=1;
        // matrix[0][1]=2;

        // matrix[1][0]=3;
        // matrix[1][1]=4;

        // System.out.println(matrix[1][1]);

        // for(int i=0;i<matrix.length;i++)
        // {
        // for(int j=0;j<matrix.length;j++)
        // {
        // System.out.print(matrix[i][j]);
        // }
        // System.out.println(" ");
        // }

        // // create an array
        // int[] age = { 12, 4, 5, 2, 5 };

        // // access each array elements
        // System.out.println("Accessing Elements of Array:");
        // System.out.println("First Element: " + age[0]);
        // System.out.println("Second Element: " + age[1]);
        // System.out.println("Third Element: " + age[2]);
        // System.out.println("Fourth Element: " + age[3]);
        // System.out.println("Fifth Element: " + age[4]);

        // // create an array
        // int[] age = { 12, 4, 5 };

        // // loop through the array
        // // using for loop
        // System.out.println("Using for-each Loop:");
        // for (int a : age) {
        // // System.out.println("Age - "+ age);
        // System.out.println("New A Value - "+ a);
        // }

        // // create a 2d array
        // int[][] a = {
        // { 1, 2, 3 },
        // { 4, 5, 6, 9 },
        // { 7 },
        // };

        // // calculate the length of each row
        // System.out.println("Length of row 1: " + a[0].length);
        // System.out.println("Length of row 2: " + a[1].length);
        // System.out.println("Length of row 3: " + a[2].length);

        // int [] numbers = {1, 2, 3, 4, 5, 6};
        // int [] positiveNumbers = numbers; // copying arrays

        // for (int number: positiveNumbers) {
        // System.out.println(number);
        // }

        // // declaring and initializing 2D array
        // int arr[][] = { { 1, 2, 3 }, { 2, 4, 5 }, { 4, 4, 5 } };
        // // printing 2D array
        // for (int i = 0; i < 3; i++) {
        // for (int j = 0; j < 3; j++) {
        // System.out.print(arr[i][j] + " ");
        // }
        // System.out.println();
        // }

        // char character = 'A'; // Replace 'A' with the character you want to check

        // if (Character.isLetter(character)) {
        // System.out.println(character + " is an alphabet.");
        // } else {
        // System.out.println(character + " is not an alphabet.");
        // }

        char character = '7'; // Replace '7' with the character you want to check

        if (Character.isDigit(character)) {
            System.out.println(character + " is a number.");
        } else {
            System.out.println(character + " is not a number.");
        }

    }
}
