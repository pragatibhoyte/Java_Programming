// WAP to print duplicate characters from a string

import java.util.*;

class StringX
{
    public void PrintDuplicates(String str)
    {
        boolean bFlag = true;

        str = str.replaceAll("\\s", "");

        str = str.toLowerCase();
    
        char Arr[] = str.toCharArray();

        int CountChar[] = new int[26];
        int CountDigits[] = new int[10];

        int index = 0;

        for(int i = 0; i < Arr.length; i++)
        {
            if(Arr[i] >= 'a' && Arr[i] <= 'z')
            {
                index = Arr[i] - 'a';  // Ascii of a is 97
                CountChar[index]++;
            }

            if(Arr[i] >= '0' && Arr[i] <= '9')
            {
                index = Arr[i] - '0';  
                CountDigits[index]++;
            }
        }

        for(int i = 0; i < CountChar.length; i++)
        {
            if(CountChar[i] > 1)
            {
                System.out.println((char)(i + 'a'));
            }
        }

        for(int j = 0; j < CountDigits.length; j++)
        {
            if(CountDigits[j] > 1)
            {
                System.out.println((char)(j + '0'));
            }
        }
    }
}

class program04
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        StringX obj = new StringX();

        System.out.println("Enter String : ");
        String str = sobj.nextLine();

        obj.PrintDuplicates(str);
    }
}