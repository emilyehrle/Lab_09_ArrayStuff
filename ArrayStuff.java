import java.util.Random; // import random
import java.util.Scanner; //import scanner

public class ArrayStuff

{
    public static void main(String[] args)
    {
        int[] dataPoints = new int[100]; //create an integer array called datapoints
        Random rnd = new Random (); // creating an object
        for (int i = 0; i < dataPoints.length; i++)
        {
            dataPoints[i] = rnd.nextInt(100) + 1; // getting value from 1 to 100
        }

        for (int i = 0; i <dataPoints.length; i++) {
            System.out.print(dataPoints[i]); // print vale of i
            if (i < dataPoints.length - 1) {
                System.out.print(" | "); // print a |
            }
        }
        System.out.println(); // this moves text to the next line

        int sum = 0;
        for (int num : dataPoints)
        {
            sum += num;
        }
        double average = (double) sum / dataPoints.length; //calculating the average of the array

        System.out.println("The sum of the random array data point is: " + sum); // output sum
        System.out.println("The average of the random array data point is: " + average); // output average


        Scanner scanner = new Scanner(System.in); // import scanner
        int userValue = SafeInput.getRangedInt(scanner, "Enter an integer between 1 and 100: ", 1, 100); //prompt user for number

        int count = 0; // begin count for value in array
        for (int num : dataPoints)
        {
            if (num == userValue)
            {
                count++;
            }
        }
        System.out.println("The user's value " + userValue + " appears " + count + " times in the array."); // output amount of times in array

        int userValue2 = SafeInput.getRangedInt(scanner, "Enter another integer between 1 and 100: ", 1, 100); //prompt user for another value

        boolean found = false; //cecking if value is found within the array
        for (int i = 0; i < dataPoints.length; i++)
        {
            if (dataPoints[i] == userValue2)
            {
                System.out.println("The value " + userValue2 + " was found at array index " + i);
                found = true;
                break;
            }
        }
        if (!found)
        {
            System.out.println("The value " + userValue2 + " was not found in the array.");
        }

        int min = dataPoints[0];
        int max = dataPoints[0];
        for (int i = 1; i < dataPoints.length; i++){
            if (dataPoints[i] < min) // finding the min in the array
            {
                min = dataPoints[i];
            }
            if (dataPoints[i] > max){ // finding the max in the array
                max = dataPoints[i];
            }
        }
        System.out.println("The minimum value in the data points array is: " + min); //output min value
        System.out.println("The maximum value in the data points array is: " + max); // output max value

    }
}