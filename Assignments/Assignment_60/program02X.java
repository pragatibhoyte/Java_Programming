// WAP to check whether given string is a Anagram

// Two strings are called Anagrams if they contain the same characters 
// with the same frequency with the same frequency, regardless of order.

// ex : listen  silent

import java.util.*;

class StringX
{
    public boolean Anagram(String str1, String str2)
    {
        if(str1.length() != str2.length())
        {
            return false;
        }

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        char Arr[] = str1.toCharArray();
        char Brr[] = str2.toCharArray();

        Arrays.sort(Arr);
        Arrays.sort(Brr);

        return Arrays.equals(Arr, Brr);
    }
}

class program02X
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        StringX obj = new StringX();

        System.out.println("Enter String 1: ");
        String str1 = sobj.nextLine();

        System.out.println("Enter String 2: ");
        String str2 = sobj.nextLine();

        boolean bRet = obj.Anagram(str1, str2);

        if(bRet)
        {
            System.out.println("Strings are Anagram");
        }
        else
        {
            System.out.println("Strings are Not Anagram");
        }
    }
}