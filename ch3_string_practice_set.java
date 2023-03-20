package Aniket;

public class ch3_string_practice_set {
    public static void main(String[] args) {
        // Que no 1
        String name = "Aniket Gawande";
        String ucase = name.toUpperCase();
        System.out.println(ucase);

        //Que no 2
        System.out.println(name.replace(" ", "_"));

        //Que no 3
        String letter = "Dear <name>,thanks a lot";
        System.out.println(letter.replace("<name>","Aniket"));

        //Que no 4
        String string = "Hello my name is   Aniket and i am a  computer enginnering student";
        System.out.println(string.indexOf("  "));
        System.out.println(string.indexOf("   "));

        // Que no 5
        String letter2 = "Dear Director sir,\n\tICEEM College sambhajinagar,\n\tWaluj.";
        System.out.println(letter2);
    }
}
