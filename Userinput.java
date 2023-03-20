package Aniket;
import java.util.Scanner;

public class Userinput{

    public static void main(String[] args){
        System.out.println("Enter the user input number: ");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first integer number: ");
        int a = sc.nextInt();
        System.out.println("Enter the second integer number: ");
        int b = sc.nextInt();

        System.out.println("Enter the first float number: ");

        float c = sc.nextFloat();
        System.out.println("Enter the second float number: ");
        float d = sc.nextFloat();

        int multiply = a+b;
        float sum = c+d;
        System.out.println(sum);
        System.out.println(multiply);
        System.out.println("First number of alphabate: ");





    }

}