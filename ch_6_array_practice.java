package Aniket;
import java.util.Scanner;
public class ch_6_array_practice {
    public static void main(String[] args) {
        // Quetion no 1

//        additon of array

        /* int number[] = {23,45,65,43,34};
        int sum = 0;

        for(int i=0; i<number.length; i++){
            sum = sum + number[i];
        }
        System.out.println(sum);
        *

        //Quetion no 2
        Scanner sc = new Scanner(System.in);

        int number[] =  {45,34,77,67,56};
        int num = 45;
        // providing the size
            for(int j=0; j<number.length; j++){
                if(num==number[j]){
                    System.out.println("Number is found "+j);

                }

            }

         int roll []={43,67,78,98,46,2435,67};
         int sum =0;
         for(int i=0; i<roll.length; i++){
             sum = sum + roll[i];
         }
        System.out.println("The average value is"+sum/roll.length);


        // Quetion no. 3
        // Adding a two matrices
        int matrix1[][] = {{1,2,3},{5,6,7}};
        int matrix2[][] = {{5,8,9},{9,3,1}};
        int result[][] = {{0,0,0},{0,0,0}};

        for(int i=0; i< matrix1.length; i++){
            for(int j=0; j<matrix1[i].length; j++){
                result[i][j]  = matrix1[i][j] + matrix2[i][j];
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }


        //Quetion no.4

        int array[] = {5,7,8,9,10};
        int l = array.length;
        int a = Math.floorDiv(l, 2);
        int temp;
        for(int i=0; i<a; i++){
            temp = array[i];
            array[i] = array[l-i-1];
            array[l-i-1] = temp;
        }
        for(int element : array){
            System.out.println(element);
        }



        // Quetion no.5

        int array1 [] = {34,45,78,6,46};
        int max = 0;
        for(int element : array1) {
            if (element > max) {
                max = element;
            }
        }
        System.out.println(max);

        // Quetion no.6

        int array2[] = {574,347,23,354,32,54};
        int min = 6000;
        for(int element:array2){
            if(element<min){
                min = element;
            }
        }
        System.out.println(min);

         */

        String str ="hello";
        System.out.println(str);
    }
}
