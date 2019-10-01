
/**
 * A bit more sophisticated. We introduce an array, array initializer list.  Methods cannot be static - why?
* 
 */
public class DrSeuss3
{
    private String [] catLetter;
    private int next;

    public DrSeuss3()
    {
      catLetter = new String [] { "A", "B", "C", "D" }; 
      next = 0;
    }      

    public void message()
    {
        System.out.println("I can clean up this spot, but I need some help from my friend cat " + catLetter[next] );
        next++;
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
        System.out.println("I can clean up this spot with VOOM!" );
    }

    public static void run()
    {
        DrSeuss3 cith = new DrSeuss3();
        cith.catInTheHat();
    }
}