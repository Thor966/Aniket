package Aniket;
import java.util.Scanner;
public class ch_4_swithststement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your number!");
        int Botton = sc.nextInt();

//        switch (Botton){
//            case 1:
//                System.out.println("Hello!");
//                break;
//            case 2:
//                System.out.println("Who are you?");
//                break;
//            case 3:
//                System.out.println("What is your name?");
//                break;
//            case 4:
//                System.out.println("My name is Aniket");
//                break;
//            default:
//                System.out.println("Invalid botton\nPlease try again!");
//        }

        // In java inhance switch is available as follws
        switch (Botton){
            case 1 -> System.out.println("Hello");
            case 2-> System.out.println("Who are you?");
            case 3 -> System.out.println("What is your name?");
            case 4-> System.out.println("My name is Aniket");
            default-> System.out.println("Invalid Botton\nPlease try again!");
        }
    }
}
