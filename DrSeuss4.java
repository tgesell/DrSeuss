/**
 * We don't even need an array.  We can just "count" up from A.
 * Now our message function does not even require a parameter.  In fact, all of the "Cat"
 * functions look so similar now, it makes me wonder if we can't combine them somehow.
 *
 */
public class DrSeuss4
{
    private char catLetter;
     
    public DrSeuss4()
    {
      catLetter = 'A'; 
    }      
    
    public void message()
    {
        System.out.println("I can clean up this spot, but I need some help from my friend cat " + catLetter );
        catLetter++; 
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

    public static void main (String[] args)
    {
        DrSeuss4 cith = new DrSeuss4();
        cith.catInTheHat();
    }
}
