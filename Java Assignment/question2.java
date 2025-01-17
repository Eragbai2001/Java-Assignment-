public class question2 {
    public static void main(String[] args) {
        // Code for single loop to print the Nigerian flag pattern (I am not sure this is the Nigerian flag pattern)
        for (int i = 1; i <= 3; i++) {
            System.out.println("* * * * = = = = = =");
            System.out.println("=");
        }
        for (int i = 1; i <= 3; i++) {
            System.out.println("= = = = =  = = = = =");
        }
        // Code for nested loop to print the Nigerian flag pattern
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 11; j++) {
                if (j < 4) {
                    System.out.print("* ");// Print '*' for the first 4 columns
                } else if (j < 10) {
                    System.out.print("= ");// Print '=' for the next 4 columns

                } else {
                    System.out.println("\n= ");
                }

            }

        }
        for (int i = 1; i <= 3; i++) {

            for (int j = 1; j <= 10; j++) {
                System.out.print("= ");

            }

            System.out.println();
        }

    }
}
