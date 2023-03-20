package Aniket;
import java.io.*;
public class Ch_7_consoleclass {
    public static void main(String[]args){
        Console obj=System.console();
        System.out.println("enter your username :");
        String str=obj.readLine();
        System.out.println("Enter your password :");
         char[] ch= obj.readPassword();

        System.out.println("Enter your username :" +str);
        System.out.println("Enter your password :" +ch);
    }
}
