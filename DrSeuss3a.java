/**
 * A bit more sophisticated version of 3a, with better phrases - especially the first one.
 *
 */
public class DrSeuss3a
{
    private String [] catLetter;
    private int next;

    public DrSeuss3a()
    {
      catLetter = new String [] { "in the hat", "A", "B", "C", "D" }; 
      next = 0;
    }      

    public void message()
    {
        System.out.print("I, cat " + catLetter[next] + ", can clean up this spot, " );
        next++;
        System.out.println( "but I need some help from my friend cat " + catLetter[next] );
    }

    public void catInTheHat()
    {
       message();
       catA();
    }

    public void catA()
    {
       message();
       catB();
    }

    public void catB()
    {
       message();
       catC();
    }

    public void catC()
    {
       message();
       catD();
    }

    public void catD()
    {
        System.out.println("I, cat D, can clean up this spot with VOOM!" );
    }

    public static void main (String[] args)
    {
        DrSeuss3a cith = new DrSeuss3a();
        cith.catInTheHat();
    }
}