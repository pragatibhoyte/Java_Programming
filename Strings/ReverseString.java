import java.util.*;

class ReverseString
{
    static String reverseString(String str)
    {
        StringBuilder rev = new StringBuilder();

        char Arr[] = str.toCharArray();

        for(int i = Arr.length-1; i >= 0; i--)
        {
            rev = rev.append(Arr[i]);
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