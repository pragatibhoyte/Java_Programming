/* Write a program to check whether one string is rotation of another.

Description : String B is rotation of string A it it can be obtained by shifting characters

Input Format : string1
               string2

Output Format : rotation or not rotation

Example : Input : abcd
                  cdab
          Output : rotation
*/

import java.util.*;

class StringX
{
    public boolean checkRotation(String str1, String str2)
    {
        if(str1.length() != str2.length())
        {
            return false;
        }

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        str1 = str1.concat(str1);

        if(str1.contains(str2))
        {
            return true;
        }

        return false;
    }
}

class program05
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        StringX obj = new StringX();

        System.out.println("Enter first String : ");
        String str1 = sobj.nextLine();

        System.out.println("Enter second String : ");
        String str2 = sobj.nextLine();

        boolean bret = obj.checkRotation(str1, str2);

        if(bret == true)
        {
            System.out.println("Rotation");
        }
        else
        {
            System.out.println("No Rotation");
        }
    }
}
