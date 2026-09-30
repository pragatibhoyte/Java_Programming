import java.util.*;

class Palindrome
{
    static boolean chkPalindrome(String str)
    {
        str = str.trim();
        str = str.replaceAll("\\s+", "");
        str = str.toLowerCase();

        int lIndex = 0;
        int rIndex = str.length() - 1;

        while(lIndex < rIndex)
        {
            if(!Character.isLetterOrDigit(str.charAt(rIndex)))
            {
                rIndex--;
                continue;
            }

            if(!Character.isLetterOrDigit(str.charAt(lIndex)))
            {
                lIndex++;
                continue;
            }

            if(str.charAt(lIndex) != str.charAt(rIndex))
            {
                return false;
            }

            rIndex--;
            lIndex++;
        }

        return true;
    }

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter string : ");
        String str = sobj.nextLine();

        boolean sRet = chkPalindrome(str);

        System.out.println(sRet);
    }
}