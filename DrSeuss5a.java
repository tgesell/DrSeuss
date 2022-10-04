/**
 * A better version with better phrases at the beginning and end, a starter function for the first phrase,
 * and a recursive "helper" message for the rest.
 */
public class DrSeuss5a
{
   public static void catHelper( char catLetter )
   {
       if( catLetter >= 'D' )
         System.out.println( "I, littlest cat D, can clean up this spot, but I need some VOOM. " +
                             "Which I just happen to have." );
       else
       {
         System.out.print( "I, cat " + catLetter + ", can clean up this spot,"); 
         catLetter++;
         System.out.println( "but I need some help from my friend cat " + catLetter );
         catHelper( catLetter );
       }
   }

   public static void cat()
   {
       System.out.println( "I, the cat in the hat, can clean up this spot, but I need some help from " +
                           "my friend cat A" );
       catHelper('A'); 
   }

   public static void main(String[] args)
   {
       DrSeuss5a.cat();
   }
}