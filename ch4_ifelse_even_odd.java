package Aniket;
import java.util.Scanner;
public class ch4_ifelse_even_odd {
    public static void main(String[] args) {
        System.out.println("Please enter your number:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if(num%2==0){
            System.out.println("Given number is even");
        }
        else{
            System.out.println("Given number is odd");
        }
    }
}
