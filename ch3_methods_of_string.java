package Aniket;


public class ch3_methods_of_string {
    public static void main(String[] args) {
        String company = "Amazon";

        // 1st methode .legth()
        int length = company.length();
        System.out.println(length);

        // 2nd methode .toloercase()
        String lcase = company.toLowerCase();
        System.out.println(lcase);

        // 3rd methode .touppercase()
        String ucase = company.toUpperCase();
        System.out.println(ucase);

        // 4th methode .trim()
        String nontrimethod = "    google   ";
        System.out.println(nontrimethod);
        String trimmedmethode = nontrimethod.trim();
        System.out.println(trimmedmethode);

        // 5th methode .substring(int start)
        System.out.println(company.substring(2));

        // 6th methode .substring(int start int end)
        System.out.println(company.substring(2,4));

        // 7th methode .replace()
        System.out.println(company.replace("A","G"));

        // 8th methode .Startswith()
        System.out.println(company.startsWith("A"));
        System.out.println(company.startsWith("Gam"));

        // 9th methode .endswith()
        System.out.println(company.endsWith("on"));
        System.out.println(company.endsWith("an"));

       // 10th methode .charAt()
        System.out.println(company.charAt(3));

        //11th methode .indexof("s")
        System.out.println(company.indexOf("o"));

        // 12th methode .indexof("s" , 2)
        System.out.println(company.indexOf("o" , 2));

        // 13th methode .lastIndexOf("s")
        System.out.println(company.lastIndexOf("n"));

        // 14th methode .lastIndexOf()
        System.out.println(company.lastIndexOf("a" ,6));

        // 15th methode .equals()
        System.out.println(company.equals("Amazon"));
        System.out.println(company.equals("jfjhslkjf"));

        // 16th methde .equalsIgnorscase()
        System.out.println(company.equalsIgnoreCase("aMazoN"));



    }
}





