import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Random rnd = new Random();
        int val = rnd.nextInt(100);


        int[] dataPoints =  new int[100];

        for(int i = 0; i< 100; i++){
            dataPoints[i] = (rnd.nextInt(100)+1);

        }

        for (int i = 0; i < 99; i++){
            System.out.print(dataPoints[i] + " | ");

        }
        System.out.print(dataPoints[99]);

        int sum = 0;
        double avg = 0;
        for (int i = 0; i < 99; i++){
            sum += dataPoints[i];
        }
        avg = sum/100;
        System.out.println();
        System.out.println("The average of dataPoints values is: " + avg);
        System.out.println("The total sum of dataPoints values is: " + sum);

        Scanner scanner = new Scanner(System.in);
        int inputTotal = SafeInput.getRangedInt(scanner, "Input a value 1-100: ", 1, 100);


        int total =0;
        for (int i = 0; i< 99; i++){
            if (dataPoints[i]==inputTotal){
                total++;
            }
        }
        System.out.println("Your number appeared " + total + " times in dataPoints.");




        int inputFirst = SafeInput.getRangedInt(scanner, "Input a value 1-100: ", 1, 100);
        int counter = 1;
        do{
            if (counter > 100){
                System.out.println(inputFirst + " did not appear in dataPoints.");
                break;
            }
            System.out.println("First appearance of " + inputFirst + " is at index " + counter);
            counter++;
            break;


        } while (dataPoints[counter]!=inputFirst);



        System.out.println();
        System.out.println();



        int maxValue = dataPoints[0];
        for(int i=1;i < dataPoints.length;i++){
            if(dataPoints[i] > maxValue){
                maxValue = dataPoints[i];
            }
        }
        System.out.println("The maximum value in dataPoints is " + maxValue);



        int minValue = dataPoints[0];
        for(int i=1;i<dataPoints.length;i++){
            if(dataPoints[i] < minValue){
                minValue = dataPoints[i];
            }
        }
        System.out.println("The minimum value in dataPoints is " + minValue);





        getAverage(dataPoints);



    }
    public static double getAverage(int values[])
    {

        int sum = 0;
        double avg = 0;
        for (int i = 0; i < values.length-1; i++){
            sum += values[i];
        }
        avg = sum/100;

        System.out.println("The average of the array's values is: " + avg);

        return avg;
    }





}