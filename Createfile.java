package Aniket;

import java.io.*;

public class Createfile {
    public static void main(String[] args) {
         File f = new File("C:\\Users\\Aniket\\OneDrive\\Desktop\\Gawande.txt");
            try {
                if (f.createNewFile()) {
                    System.out.println("File created succesfully.....!");
                } else {
                    System.out.println("File created succesfully...!");
                }
            }
            catch(Exception e){
                System.out.println("Exception Handled..!");
            }




    }
}
