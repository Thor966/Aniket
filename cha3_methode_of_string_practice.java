package Aniket;



public class cha3_methode_of_string_practice {
    public static void main(String[] args) {
        // 1st methode .length
        String friend = "Vishal";
        int length = friend.length();
        System.out.println(length);

        // 2nd methode .tolowercase
        String lcase = friend.toLowerCase();
        System.out.println(lcase);

        // 3rd methode .touppercase
        String ucase = friend.toUpperCase();
        System.out.println(ucase);

        // 4th methode .trim
        String nontrimstring = "      Datta     ";
        System.out.println(nontrimstring);
        String trimmedstring = nontrimstring.trim();
        System.out.println(trimmedstring);

        //5th methode .substring(int start)
        System.out.println(friend.substring(5));

        // 6th methode .substring(int start , int end)
        System.out.println(friend.substring(2,5));


        // 7th methode .replace
        System.out.println(friend.replace('V' , 'K'));
        System.out.println(friend.replace("Vishal", "Zandubam"));

        //8th methode .startwith
        System.out.println(friend.startsWith("V"));
        System.out.println(friend.startsWith("Vish"));
        System.out.println(friend.startsWith("Zandu"));

        // 9th methode .endswith
        System.out.println(friend.endsWith("l"));
        System.out.println(friend.endsWith("shal"));
        System.out.println(friend.endsWith("sl"));

        // 10th methode .charAt
        System.out.println(friend.charAt(4));

        // 11th methode .indexof()
        System.out.println(friend.indexOf("a"));

        // 12th methode .indexof("s" , 2)
        System.out.println(friend.indexOf("h",1));

        // 13th methode .lastIndexof("s")
        System.out.println(friend.lastIndexOf("i"));

        // 14th methode .lastIndexOf("s", 2)
        System.out.println(friend.lastIndexOf("i",2));

        // 15th methode .equals()
        System.out.println(friend.equals("Vishal"));
        System.out.println(friend.equals("vishalya"));

        // 16th methode .equalsignorecadse()
        System.out.println(friend.equalsIgnoreCase("ViSHal"));




    }
}
