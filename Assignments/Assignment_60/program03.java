// WAP to check whether given string is a Pangram

// A string is called pangram if it contains all alphabets from 'a' to 'z' atleast once.

// ex : the quick brown fox jumps over the lazy dog

import java.util.*;

class StringX
{
    public boolean Pangram(String str)
    {
        boolean bFlag = true;

        str = str.replaceAll("\\s", "");

        str = str.toLowerCase();
    
        char Arr[] = str.toCharArray();

        int Count[] = new int[26];

        int index = 0;

        for(int i = 0; i < Arr.length; i++)
        {
            if(Arr[i] >= 'a' && Arr[i] <= 'z')
            {
                index = Arr[i] - 'a';  // Ascii of a is 97
                Count[index]++;
            }
        }

        for(int i = 0; i < Count.length; i++)
        {
            if(Count[i] == 0)
            {
                bFlag = false;
                break;
            }
        }

        return bFlag;
    }
}

class program03
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        StringX obj = new StringX();

        System.out.println("Enter String : ");
        String str = sobj.nextLine();

        boolean bRet = obj.Pangram(str);

        if(bRet)
        {
            System.out.println("String is Pangram");
        }
        else
        {
            System.out.println("String is Not Pangram");
        }
    }
}