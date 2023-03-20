package Aniket;
import java.util.Scanner;




public class cbse_percentage {
    public static void main(String[] args) {


        System.out.println("math ");
        Scanner sc = new Scanner(System.in);
        int s1 = sc.nextInt();


        System.out.println("physics");
        int s2 = sc.nextInt();


        System.out.println("chemistry");
        int s3 = sc.nextInt();


        System.out.println("biology");
        int s4 = sc.nextInt();


        System.out.println("english");
        int s5 = sc.nextInt();


        int Total = (s1 + s2 + s3 + s4 + s5);
        int per = (Total * 100/500);
        System.out.println("The percentage of student: ");
        System.out.println(per);
    }
}
