package Aniket;
import java.io.*;
public class Filewriter1 {
    public static void main(String[] args)  {
     try{
         FileWriter f = new FileWriter("C:\\Users\\Aniket\\OneDrive\\Desktop\\Aniket.txt");
         try{
             f.write("Sachin condom jindabad");
         }
         finally {
             f.close();
         }
         System.out.println("File writed succesfully");
     }
     catch(Exception w){
         System.out.println("Exeception is handled");
        }
    }
}