/* Write a program to remove duplicate characters from a string.

Description : Remove repeated characters while keeping first occurance

Input Format : One sentence
Output Format : print : string without duplicate characters

Example : Input : banana
          Output : ban
*/

import java.util.*;

class StringX
{
    public String removeDuplicates(String str)
    {
        str = str.toLowerCase();

        str = str.trim();

        str = str.replaceAll("\\s+", "");

        char Arr[] = str.toCharArray();

        Set <Character> sobj = new LinkedHashSet <Character>();

        for(int i = 0; i < Arr.length; i++)
        {
            sobj.add(Arr[i]);
        }

        String updated = "";

        for(Object i : sobj)
        {
            updated = updated + i;
        }

        return updated;
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

        String ret = obj.removeDuplicates(str);

        System.out.println("String : "+ret);
    }
}
