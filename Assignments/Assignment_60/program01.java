// WAP to check whether given string is a Palindrome

// A string is called a palindrome if it reads same forward and backward

// ex : madam

import java.util.*;

class StringX
{
    public boolean Palindrome(String str)
    {
        boolean bFlag = false;

        char Arr[] = str.toCharArray();

        StringBuilder reverse = new StringBuilder();

        for(int i = Arr.length-1; i >= 0; i--)
        {
            reverse.append(Arr[i]);
        }

        if(str.equals(reverse.toString()))
        {
            bFlag = true;
        }

        return bFlag;
    }
}

class program01
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        StringX obj = new StringX();

        System.out.println("Enter String : ");
        String str = sobj.nextLine();

        boolean bRet = obj.Palindrome(str);

        if(bRet)
        {
            System.out.println("String is Palindrome");
        }
        else
        {
            System.out.println("String is Not Palindrome");
        }
    }
}