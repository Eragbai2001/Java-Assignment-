import java.util.Scanner;

class question4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Declare an array of lenght 10
        int[] num = new int[10];

       

        // Using a loop assign elements to the array by accepting input from the user

        for (int i = 0; i < num.length; i++) {
            System.out.println("Enter number for index : " + i + ":");
            num[i] = input.nextInt();
        }
        System.out.println("The numbers you entered are ");
        for (int i = 0; i < num.length; i++) {

            System.out.println(num[i]);
        }

         // Using a for-each loop, print out the input entered by the user
        System.out.println("The numbers you entered are ");
        for (int i : num) {
            System.out.println(i);
        }

        input.close();

    }
}
