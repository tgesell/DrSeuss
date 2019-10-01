/**
 * Objective: understand how to trace function calls - prelude to recursion
 * 
 */

//have students trace code on paper
public class DrSeuss1
{
    public void catInTheHat()
    {
       System.out.println("I can clean up this spot, but I need some help from my friend cat A");
       catA();
    }

    public void catA()
    {
       System.out.println("I can clean up this spot, but I need some help from my friend cat B");
       catB();
    }

    public void catB()
    {
       System.out.println("I can clean up this spot, but I need some help from my friend cat C");
       catC();
    }

    public void catC()
    {
       System.out.println("I can clean up this spot, but I need some help from my friend cat D");
       catD();
    }

    public void catD()
    {
        System.out.println("I can clean up this spot with VOOM!" );
    }

    public static void main (String[] args)
    {
        DrSeuss1 seussReciter = new DrSeuss1();
        seussReciter.catInTheHat();
    }
}