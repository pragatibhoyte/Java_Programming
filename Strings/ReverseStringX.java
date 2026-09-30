import java.util.*;

class ReverseStringX
{
    static String reverseString(String str)
    {
        StringBuilder rev = new StringBuilder();

        for(int i = str.length()-1; i >= 0; i--)
        {
            rev.append(str.charAt(i));
        }

        return rev.toString();
    }

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter string : ");
        String str = sobj.nextLine();

        String sRet = reverseString(str);

        System.out.println(sRet);
    }
}