package Aniket;

import javax.crypto.spec.PSource;
import java.io.*;

public class Fileinfo {
    public static void main(String[] args) {
        File f = new File("C:\\Users\\Aniket\\OneDrive\\Desktop\\Gawande.txt");

        try{
                if(f.createNewFile()){
                    System.out.println("File mian screen var bagh na bro...!");
                }
                else{
                    System.out.println("File nahi create zali bro...!");
                }
        }
        catch(Exception e){
            System.out.println(e);
        }



        try {
            if (f.exists()) {
                System.out.println("Name: " + f.getName());
                System.out.println("Location: " + f.getAbsolutePath());
                System.out.println("Writable: " + f.canWrite());
                System.out.println("Readable: " + f.canRead());
                System.out.println("Size" + f.length());
               // System.out.println("Delete:" +f.delete());
            } else {
                System.out.println("File does not exist..!");
            }
        }
        catch(Exception e){
            System.out.println("Exeption Handled..!");
        }

        System.out.println("This is my file information");
    }

}
