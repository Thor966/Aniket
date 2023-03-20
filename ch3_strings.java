package Aniket;
import  java.util.Scanner;

public class ch3_strings {
    public static void main(String[] args) {
         String name = "Aniket";
         System.out.println(name);
         String s = new String("Gawande");
         System.out.println(s);

         Scanner scn = new Scanner(System.in);
//       String sc = scn.next(); // next is only print a single a word
//         System.out.println(sc);
         String s2 = scn.nextLine(); // nextline are print a whole line
         System.out.println(s2);
         int a = 3;
         float b =5.774f;
        System.out.printf("The value a is %d and the value of b is %f\n" ,a,b); // To support the printf in java
        System.out.format("The value of a is %d and vlaue of b is %f\n",a,b); //-----------------||format--------


    }
}
