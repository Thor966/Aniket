package Aniket;
import java.util.Scanner;
public class ch1_Practice {
    public static void main(String[] args) {
        System.out.println("Enter the number of user input: ");
        Scanner sc = new Scanner(System.in);

        // For integer value
        System.out.println("Enter the first number: ");
         int a = sc.nextInt();
        System.out.println("Enter the second number: ");
        int b = sc.nextInt();

        // For float value
        System.out.println("Enter the third number for float: ");
        float c = sc.nextFloat();
        System.out.println("Enter the fourth number for float: ");
        float d = sc.nextFloat();

        int sum = a+b;
        System.out.println("The sum of integer number is: ");
        System.out.println(sum);

        float multiply = c*d;
        System.out.println("The multiplication of float number is: ");
        System.out.println(multiply);

        boolean b1 = sc.hasNextInt();
        System.out.println(b1);
        boolean b2 = sc.hasNextFloat();
        System.out.println(b2);



    }
}
