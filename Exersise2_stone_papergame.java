package Aniket;
import java.util.Scanner;
import java.util.Random;

public class Exersise2_stone_papergame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random ra = new Random();
        System.out.println("Enter your chance");
        int user = sc.nextInt(3);

        /* 0 for scissor
           1 for paper
           2 for stone*/


        System.out.println("Computers choice");
        int computer = ra.nextInt(3);
        System.out.println("computer chance:"+computer);

        if(user==computer){
            System.out.println("Match is draw\n\\tBeacause of you and computer are same");
        }
        else if(user==0 && computer ==1){
            System.out.println("you select the scissor\n\tYou Win!\n\tcomputer loss");
        }
        else if(user==0 && computer==2){
            System.out.println("You select scissor\n\tYou loss\n\tcomputer win!");
        }
        else if (user==1 && computer==0){
            System.out.println("you select the paper\n\tyou loss\n\tcomputer win!");
        }
        else if (user==2 && computer==0){
            System.out.println("you select the stone\n\tyou Win!\n\tcomputer loss");
        }
        else if (user==1 && computer==2){
            System.out.println("you select the paper\n\tyou Win!\n\tcomputer loss");
        }
        else if (user==2 && computer==1){
            System.out.println("you select the stone\n\tyou Win!\n\tcomputer win");
        }


        System.out.println("Thank you for playing our game!");


    }
}
