package Aniket;
import java.util.Scanner;
public class ch4_ifelse_robot_botton {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your botton number:");
        int Botton = sc.nextInt();

//        if(Botton==1){
//            System.out.println("Hello");
//        }
//        else{
//            if(Botton==2){
//                System.out.println("Nikal bhosdike");
//            }
//            else{
//                if(Botton==3)
//                System.out.println("Zandu Bam");
//                else{
//                    System.out.println("Chala ja madarchod ye botton invalid he");
//                }
//            }
//
//        }
        // Above methode code is not systematic so, in java are another methode is if elseif laddder as follows:

        if(Botton==1){
            System.out.println("hello");
        }
        else if(Botton==2){
            System.out.println("Nikal Bhosdike");
        }
        else if (Botton==3){
            System.out.println("Zandu Bam");
        }
        else{
            System.out.println("Chala ja madarchod ye invalid botton he");
        }




    }
}
