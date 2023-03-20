package Aniket;

/*abstract class programing{
   public abstract void Developer();
   public abstract void skill();
}
abstract class HTML extends programing
{
    public void Developer(){
        System.out.println("Tim birners lee");
    }

}
class Java extends HTML
{
   public void skill()
   {
       System.out.println("Best language programming skill");
   }
}


public class only_practice {
    public static void main(String[] args) {


        programing j = new Java();
        j.Developer();
        j.skill();

    }
}
*/



// Polymorphism

// Compiletime polymorphism
/*
class Gawande{
    void add(int a, int b){
       int o=a; int p =b;
        System.out.println("The addition of two number is" + (o+p));
    }
    void add(float x, int y){
        float z = x-y;
        System.out.println("The subtraction of two number is "  +z );
    }


}
class only_practice{
    public static void main(String[] args) {
        Gawande g = new Gawande();
       g.add(45,25);
       g.add(33.5f,57);
    }
}*/

//Runtime polymorphism


/*
class Jangle
{
    void Disp(){
        System.out.println("Print star pattern");
    }
}
class Vishal extends Jangle
{
    void Disp(){
        super.Disp();
        for(int i=0; i<=5; i++){
            for(int j=0; j<=5; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
class Bhausaheb extends Vishal{
    void Disp(){
        super.Disp();
        for(int i=0; i<=5; i++){
            for(int j=0; j<=5-i; j++){
                System.out.print(" ");
            }
            for(int j=0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
class only_practice{
    public static void main(String[] args) {
       Bhausaheb b =new Bhausaheb();
       b.Disp();
    }
}*/



class only_practice {
    public static void main(String[] args) {

    }
}

