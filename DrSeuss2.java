/*** Objective: understand how to trace function calls. This is also an example
 * of "code factoring".
 * 

 */
public class DrSeuss2
{
    public static void message( String catLetter )
    {
        System.out.println("I can clean up this spot, but I need some help from my friend cat " + catLetter );
    }

    public static void catInTheHat()
    {
       message("A");
       catA();
    }

    public static void catA()
    {
       message("B");
       catB();
    }

    public static void catB()
    {
       message("C");
       catC();
    }

    public static void catC()
    {
       message("D");
       catD();
    }

    public static void catD()
    {
        System.out.println("I can clean up this spot with VOOM!" );
    }

    public static void run()
    {
        DrSeuss2.catInTheHat();
    }
}