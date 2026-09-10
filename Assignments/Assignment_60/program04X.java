// WAP to print duplicate characters from a string

import java.util.*;

class StringX
{
    public void PrintDuplicates(String str)
    {
        HashMap<Character, Integer> hobj = new HashMap<Character, Integer>();

        char Arr[] = str.toCharArray();
        int count = 0;

        for(int i = 0; i < Arr.length; i++)
        {
            if(hobj.containsKey(Arr[i]))
            {
                count = hobj.get(Arr[i]);
            }
            else
            {
                count = 0;
            }

            hobj.put(Arr[i], ++count);
        }

        for(Map.Entry<Character, Integer> entry : hobj.entrySet())
        {
            if(entry.getValue() > 1)
            {
                System.out.println(entry.getKey());
            }
        }
    }
}

class program04X
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