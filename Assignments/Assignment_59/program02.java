/*
    Write a program to check whether a given number is Automorphic Number or not.

    Description:
    A number is Automorphic if its square ends with the same digits as the number.

    Input:
    One integer num

    Output:
    Automorphic Number or Not Automorphic Number

    Example:
    Input: 25
    Explanation: 25²=625 → ends with 25
    Output: Automorphic Number
*/

import java.util.Scanner;

class NumberX
{
    public boolean ChkAutomorphic(int iNo)
    {
        boolean bFlag = false;
        int iSquare = iNo * iNo;

        String str1 = Integer.toString(iSquare);
        String str2 = Integer.toString(iNo);

        if(str1.endsWith(str2))
        {
            bFlag = true;
        }

        return bFlag;
    }
}

class program02
{
    public static void  main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number : ");
        int iValue = sobj.nextInt();

        NumberX nobj = new NumberX();

        boolean bRet = nobj.ChkAutomorphic(iValue);

        if(bRet == true)
        {
            System.out.println("Automorphic number");
        }
        else
        {
            System.out.println("Not Automorphic number");
        }
    }
}