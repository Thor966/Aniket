package Aniket;
import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;
import java.util.jar.JarOutputStream;

public class ch_4_calender {
    public static void main(String[] args) {

        System.out.println("Please enter your number");
        Scanner sc = new Scanner(System.in);

        int calender = sc.nextInt();

        switch (calender){
            case 1:{
                System.out.println("January");
                break;
            }
            case 2:{
                System.out.println("February");
                break;
            }
            case 3:{
                System.out.println("March");
                break;
            }
            case 4:{
                System.out.println("April");
                break;
            }
            case 5:{
                System.out.println("May");
                break;
            }
            case 6:{
                System.out.println("June");
                break;
            }
            case 7:{
                System.out.println("July");
                break;
            }
            case 8:{
                System.out.println("August");
                break;
            }
            case 9:{
                System.out.println("Septeber");
                break;
            }
            case 10:{
                System.out.println("October");
                break;
            }
            case 11 :{
                System.out.println("November");
                break;
            }
            case 12 :{
                System.out.println("December");
                break;
            }
            default :{
                System.out.println("Aata kay naveen shodh lavto kay zandu bam");
            }

        }
    }
}
