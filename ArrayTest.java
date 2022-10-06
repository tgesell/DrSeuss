public class ArrayTest
{
    public static void main(String[] args)
    {
        String[] myStringArray = {"cat", "dog", "elephant", "frog", "giraffe", "hog"};
        //lets call the following six output lines, lines 1 through 5

        System.out.println(myStringArray);
        System.out.println(myStringArray[0]);
        System.out.println(myStringArray[1]);
        System.out.println(myStringArray.length);
        System.out.println(myStringArray[5]);

        //uncomment the line below to test it. Lets call it line 6
        //System.out.println(myStringArray[6]);

        for (String word: myStringArray)
        {
            System.out.println(word);
        }
    }
}