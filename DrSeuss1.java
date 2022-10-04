/**
 * Objective: understand how to trace function calls - prelude to recursion
 * In this version, there is one method for every phrase.
 * 
 */

//have students trace code on paper
public class DrSeuss1
{
    public static void catInTheHat()
    {
       System.out.println("I can clean up this spot, but I need some help from my friend cat A");
       catA();
    }

    public static void catA()
    {
       System.out.println("I can clean up this spot, but I need some help from my friend cat B");
       catB();
    }

    public static void catB()
    {
       System.out.println("I can clean up this spot, but I need some help from my friend cat C");
       catC();
    }

    public static void catC()
    {
       System.out.println("I can clean up this spot, but I need some help from my friend cat D");
       catD();
    }

    public static void catD()
    {
        System.out.println("I can clean up this spot with VOOM!" );
    }

    public static void main (String[] args)
    {
        DrSeuss1.catInTheHat();
    }
}