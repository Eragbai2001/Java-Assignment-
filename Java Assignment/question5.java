import java.util.Scanner;

public class question5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Declare a 2D array of size 10 by 10
        int[][] arr = new int[2][2];

        // Prompt the user to enter values for each element
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("Enter the value for 2D 10 by 10 array  [" + i + "][" + j + "]:");
                arr[i][j] = input.nextInt();
                input.close();// Close the scanner object
            }
        }
        // Print the 2D array
        System.out.println("The values yo entered are ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                System.out.print(arr[i][j] + " "); 
            }
            System.out.println(); // Move to the next line after each row (optional)
        }

        // using for each loop
        System.out.println("The values yo entered are ");
        for (int[] i : arr) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println(); // Move to the next line after each row (optional)
        }

    }

}
