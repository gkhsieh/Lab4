/*
 * The following code needs a lot of TLC. So give it some!
 *
 * 1. Fix all checkstyle errors
 * 2. Determine what it does (it's going to be tough before you finish #1)
 * 3. Improve the name of the methods and variables
 * 4. Add comments and Javadoc comments where needed
 * 5. Remove unnecessary comments as appropriate
 */

public class ReclamationProject
{
    static String subFinder(String a, String b)
    {

        //makes string a the shorter string
        if (a.length() > b.length())
        {
            String temp = a;
            a = b;
            b = temp;
        }

        //initialize return string
        String sub = "";

        //finds first occurrence of shared substring of maximum length in string a
        for (int i = 0; i < a.length(); i++)
        {
            for (int j = a.length() - i; j > 0; j--)
            {
                for (int k = 0; k < b.length() - j; k++)
                {
                    sub = (a.regionMatches(i, b, k, j) && j > sub.length()) ? a.substring(i,i + j) : sub; //searches for
                }
            }
        }

        //returns the string
        return sub;

    }
}
