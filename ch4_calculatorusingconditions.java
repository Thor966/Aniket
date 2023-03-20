package Aniket;
import java.util.Scanner;
public class ch4_calculatorusingconditions {
    public static void main(String[] args) {

        System.out.println("Enter your number");
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int calculator = sc.nextInt();

        switch(calculator){
            case 1:
                System.out.println(a+b);
                break;
            case 2:
                System.out.println(a-b);
                break;
            case 3:
                System.out.println(a*b);
                break;
            case 4 :
                System.out.println(a/b);
                break;
            case 5:
                System.out.println(a%b);
        }


    }
}
