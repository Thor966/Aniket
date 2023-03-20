package Aniket;
import java.util.Scanner;
public class ch4_conditinaloperator {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Please enter your age");
        int age = scn.nextInt();
        if(age>21){
            System.out.println("Bhausaheb ch lagn dya re laun ");
        }
        else{
            System.out.println("Vishal la tila laun sodun dya gavat");
        }
    }
}
