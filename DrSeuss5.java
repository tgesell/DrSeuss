public class DrSeuss5
{
   public static void cat( char catLetter )
   {
       if( catLetter > 'D' )
         System.out.println( "I can clean up this spot, but I need some VOOM. Which I just happen to have." );
       else
       {
         System.out.println( "I can clean up this spot, but I need some help from my friend cat " + catLetter );
         catLetter++;
         cat( catLetter );
       }
   }

    public static void main (String[] args)
   {
       DrSeuss5.cat('A');
   }
}
