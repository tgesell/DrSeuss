/** Objective: understand how to trace function calls. This is also an example
 * of "code factoring".  The first version was re-factored to utilize a common method that
 * displays a common portion of all the phrases.
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

    public static void main (String[] args)
    {
        DrSeuss2.catInTheHat();
    }
}