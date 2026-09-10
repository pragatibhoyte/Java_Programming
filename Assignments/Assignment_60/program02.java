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

        boolean bFlag = false;

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        char Arr[] = str1.toCharArray();
        char Brr[] = str2.toCharArray();

        int Count1[] = new int[26];
        int Count2[] = new int[26];

        int index1 = 0;
        int index2 = 0;

        for(int i = 0; i < Arr.length; i++)
        {
            index1 = Arr[i] - 97;
            Count1[index1]++;

            index2 = Brr[i] - 97;
            Count2[index2]++;
        }

        if(Arrays.equals(Count1, Count2))
        {
            bFlag = true;
        }

        return bFlag;
    }
}

class program02
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