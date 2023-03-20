package Aniket;
import java.util.Scanner;

public class ch1_practice_set {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
//        Quetion no.1
//        Add integer number

        int a = 78;
        int b = 36;
        int c = 82;
        System.out.println("Additon of these three integer number:");
        int sum = a+b+c;
        System.out.println(sum);

//        Quetion no.2
//        To find the cgpa

//       ctr+d to use to replicate the line
         float mathamatics4 = 67;
         float oops = 78;
         float graphics =55;
        float  mco = 98;
        float dm = 49;
        System.out.println("The cgpa of these student is: ");
         float cgpa =  (mathamatics4 + oops + graphics + mco + dm)/50;
        System.out.println(cgpa);


//        Quetion no. 3
//        add a two line

        System.out.println("What is your name");
        String name =  sc.next();
        System.out.println("Hello "+ name +" have a good day");

//        Quetion no. 4
//        kilometer to miles conversion

        System.out.println("Enter  the kilometer: ");
        float kl = sc.nextFloat();
       double miles = (kl)/1.609;
        System.out.print(miles);
        System.out.println(" miles");

//        Quetion no. 5
//         find integer number

        System.out.println("Enter the integer number: ");
         boolean b1 = sc.hasNextInt();
        System.out.println(b1);




    }
}
