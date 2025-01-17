import java.util.Arrays;

public class question3 {

    public static void main(String[] args) {

        // code for mean
        int[] num = { 2, 5, 5, 9, 4, 7, 0, 9, 6, 11, 12 };
        double length = num.length;
        double sum = 0;

        // Calculate the sum of all elements
        for (int i = 0; i < num.length; i++) {
            sum += num[i]; // This will print each element of the array
        }

        // Calculate the average (mean) of the elements
        double average = sum / length;

        System.out.println("The average of the element is " + average);

        // code for median

        Arrays.sort(num);

        int n = num.length;

        double median = 0;
        // Calculate the median
        if (n % 2 == 0) {
            // If the number of elements is even, the median is the average of the two
            // middle elements
            median = (num[n / 2 - 1] + num[n / 2] / 2);
        } else {
            // If odd number of elements, median is the middle element
            median = (num[n / 2]);
        }
        System.out.println("The median of the element is " + median);

        // code for standard deviation
        double squareDeviation = 0;

        // Calculate the sum of squared deviations from the mean
        for (int i = 0; i < num.length; i++) {
            squareDeviation += Math.pow(num[i] - average, 2);
        }
        
        
         // Calculate the standard deviation
        double standardDeviation = Math.sqrt(squareDeviation / length);

        System.out.println("Standard Deviation of the element is " + standardDeviation);

    }

}