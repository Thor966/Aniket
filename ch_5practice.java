package Aniket;
import java.util.Scanner;
public class ch_5practice {
    public static void main(String[] args) {
//        int a =4;
//        for(int i=0; i<=4; i++){
//            for(int j=0; j<=i; j++){
//                System.out.print('*');
//            }
//            System.out.println();
//        }

//        int b =5;
//        int sum =0;
//        int i =0;
//        while(i<5){
//            sum = sum + (2*i);
//            i++;
//        }
//        System.out.println(sum);

        Scanner sc = new Scanner(System.in);

//        int table = sc.nextInt();
//        for(int i=1; i<=10; i++){
//            System.out.println(table*i);
//        }

//        int c = 10;
//        for(int i=10; i>=0; i--){
//            System.out.println(c*i);
//        }

//        int d = 5;
//        int fact =1;
//        for( int i=1; i<=5; i++) {
//            fact = (fact *= i);
//        }
//        System.out.println(fact);

//        int e = 5;
//        int i =1;
//        int fact = 1;
//
//        while(i<=5){
//            fact = fact*=i;
//            i++;
//        }
//        System.out.println(fact);
//
//        int row=5, i=1, j=1;
//        while (i <= row)
//        {
//            while (j <= i)
//            {
//                System.out.print("*");
//                j++;
//            }
//            System.out.println();
//            i++;
//        }


        // simple star program using loop
        // print star pattern
        // que 1
        /*
         *****
         *****
         *****
         *****
         */
//        int i =1;
//        int j = 1;
//        // outer loop
//        for (i=1; i<=4; i++){ // column
//            // inner loop
//            for (j=1; j<=5; j++){  // row
//                System.out.print("*");
//            }
//            System.out.println();
//
//        }



        //Que 2
        /*

         *
         **
         ***
         ****
         *****

         */
//
//        for (int a=1; a<=5; a++){
//            for (int b=1; b<=a; b++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }


//        Que 3
        /*
         ****
         ***
         **
         *
         */
//        for (int a=5; a>=1; a--){
//            for (int b=1; b<=a; b++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }



        //Que 4
        /*
         *****
         *   *
         *   *
         *****
//         */
//        for(int i=1; i<=4; i++){
//            for(int j=1; j<=5; j++){
//                if(i==1||j==1||i==4||j==5){
//                    System.out.print("*");
//
//                }
//                else{
//                    System.out.print(" ");
//                }
//
//            }
//            System.out.println();
//
//        }



        // Que 5
        /*
         * * * *
         * * *
         * *
         *
         */
//        for(int i=4;i>=1; i--){
//           for(int j=1; j<=i; j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }



        //Que 6
        /*
        *
        **
        ***
        ****
         */
//       for(int i=1; i<=4; i++){
//           // inner loop --> print space
//           for(int j=1; j<=4-i; j++){
//               System.out.print(" ");
//           }
//           // this inner loop print star
//           for(int k=1; k<=i; k++){
//               System.out.print("*");
//           }
//           System.out.println();
//       }


        //Que 7
        /*
        1
        12
        123
        1234
        12345

//         */
//        for(int i=1; i<=5; i++){
//            for(int j=1; j<=i; j++){
//                System.out.print(j);
//            }
//            System.out.println();
//        }

        // Que 8

        /*
        12345
        1234
        123
        12
        1
//         */
//        for(int i=5; i>=1; i--){
//            for(int j=1; j<=i; j++){
//                System.out.print(j);
//            }
//            System.out.println();
//        }


        //Que 9
        /*
        1
        2 3
        4 5 6
        7 8 9 10
        11 12 13 14 15
         */
//         int number =1;
//        for (int i=1; i<=5; i++){
//            for(int j=1; j<=i; j++){
//                System.out.print(number+" ");
//                number++;
//            }
//            System.out.println();
//
//        }

        // Que 10
        /*
        1
        0 1
        1 0 1
        0 1 0 1
        1 0 1 0 1

         */
//        for(int i=1; i<=5; i++){
//            for(int j=1; j<=i; j++) {
//                int sum = i + j;
//                if (sum % 2 == 0) {
//                    System.out.print("1"+" ");
//                } else {
//                    System.out.print("0"+" ");
//                }
//            }
//            System.out.println();
//        }
        // Que 10
//        for(int i=1; i<=5; i++){
//            for(int j=1; j<=5-i; j++){
//                System.out.print(" ");
//            }
//            for(int k=1; k<=5; k++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        // Que 11
        /*
            1
           2 2
          3 3 3
         4 4 4 4
        5 5 5 5 5
         */
//        int number =1;
//        for(int i=1; i<=5; i++) {
//            for (int j = 1; j <= 5 - i; j++) {
//                System.out.print(" ");
//            }
//            for (int k = 1; k <= i; k++) {
//                System.out.print(i+" ");
//            }
//            System.out.println();
//        }

//        que 12

        /*
         1
        212
       32123
      4321234
     543212345

         */
//        for(int i=1; i<=5; i++){
//            for(int j=1; j<=5-i; j++){
//                System.out.print(" ");
//            }
//            for(int k=i; k>=1; k--){
//                System.out.print(k);
//            }
//            for(int l=2; l<=i; l++){
//                System.out.print(l);
//            }
//            System.out.println();
//        }

        // que 13
        /*

         *        *
         **      **
         ***    ***
         ****  ****
         **********
         **********
         ****  ****
         ***    ***
         **      **
         *        *

         */
        // half part of butterfly
//        for(int i=1; i<=5; i++){
//            for(int j=1; j<=i; j++){
//                System.out.print("*");
//            }
//
//            // spaces
//            int space = 2 *( 5-i);
//            for(int j=1; j<=space; j++){
//                System.out.print(" ");
//            }
//            // another half side
//            for(int k=1; k<=i; k++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//
//        // Bottom half side of butterfly
//        for(int i=5; i>=1; i--){
//            for(int j=1; j<=i; j++){
//                System.out.print("*");
//            }
//
//            // spaces
//            int space = 2 * (5-i);
//            for(int j=1; j<=space; j++){
//                System.out.print(" ");
//            }
//
//            // another half side
//            for(int j=1; j<=i; j++){
//                System.out.print('*');
//            }
//            System.out.println();
//        }


        //Que 14
        /*
              *****
             *****
            *****
           *****
          *****
         */

//        for(int i=1; i<=5; i++){
//            for(int j=5; j>=i; j--){
//                System.out.print(" ");
//            }
//            for(int j=1; j<=5; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//        Que 15
//            for(int i=1; i<=5; i++){
//                for(int j=1; j<=5-i; j++){
//                    System.out.print(" ");
//                }
//                for(int j=i; j>=1; j-- ){
//                    System.out.print(j);
//                }
//                for(int j=2; j<=i; j++){
//                    System.out.print(j);
//                }
//                System.out.println();
//            }

        // Que 16
        /*
         *
        ***
       *****
      *******
      *******
      *****
       ***
        *
         */
         // upper side
//        for(int i=1; i<=4; i++){
//            for(int j=1; j<=4-i; j++){
//                System.out.print(" ");
//            }
//            for(int j=1; j<=2*i-1; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//
//
//        // lower side
//        for(int i=4; i>=1; i--){
//            for(int j=1; j<=4-i; j++){
//                System.out.print(" ");
//            }
//            for(int j=1; j<=2*i-1; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }


        // Que 17
        /*
         *        *
         **      **
         * *    * *
         *  *  *  *
         **********
         **********
         *  *  *  *
         * *    * *
         **      **
         *        *

         */

       // uper side of butterfly
//        for(int i=1; i<=5; i++){
//            for(int j=1; j<=i; j++){
//                if(i==1 || j==1 || i==5 || j==i) {
//                    System.out.print("*");
//                }
//                else{
//                    System.out.print(" ");
//                }
//            }
//            int space = 2*(5-i);
//            for(int j=1; j<=space; j++){
//                System.out.print(" ");
//            }
//            for(int k=1; k<=i; k++){
//                if(i==1 || k==1 || i==5 || k==i) {
//                    System.out.print("*");
//                }
//                else{
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }
//
//
//        // lower part of butterfly
//        for(int i=5; i>=1; i--){
//            for(int j=1; j<=i; j++){
//                if(i==1 || j==1 || i==5 || j==i) {
//                    System.out.print("*");
//                }
//                else{
//                    System.out.print(" ");
//                }
//            }
//            int space = 2*(5-i);
//            for(int j=1; j<=space; j++){
//                System.out.print(" ");
//            }
//            for(int k=1; k<=i; k++){
//                if(i==1 || k==1 || i==5 || k==i) {
//                    System.out.print("*");
//                }
//                else{
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }

        // Que 18
        /*
            *****
           *   *
          *   *
         *   *
        *****

//         */
        for(int i=1; i<=5; i++){
            for(int j=5; j>=i; j--){
                System.out.print(" ");
            }
            for(int j=1; j<=5; j++){
                if(i==1 || j==1|| i==5 || j==5) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
           }
            System.out.println();
        }

        // Que 19
        /*
        1
        1 2
        1 2 3
        1 2 3 4
        1 2 3 4 5
         */

//        for(int i=1; i<=5; i++){
//            for(int j=1; j<=i; j++){
//                System.out.print(j+" ");
//            }
//            System.out.println();
//        }

        // Que 20
        /*
        1111
        222
        33
        4
         */
//
//        for(int i=1; i<=4; i++){
//            for(int j=i; j<=4; j++){
//                System.out.print(i);
//            }
//            System.out.println();
//        }




    }



}
