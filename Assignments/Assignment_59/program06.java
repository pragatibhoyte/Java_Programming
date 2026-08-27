/*
    Write a program to check whether a given number is Trimorphic Number or not.

    Description:
    A number is Trimorphic if its cube ends with the number itself.

    Input:
    One integer num

    Output:
    Trimorphic Number or Not Trimorphic Number

    Example:
    Input: 4
    Explanation: 4³=64 → ends with 4
    Output: Trimorphic Number
*/

import java.util.Scanner;

class NumberX
{
    public boolean ChkTrimorphic(int iNo)
    {
        int iCube = iNo * iNo * iNo;

        String strCube = Integer.toString(iCube);
        String striNo = Integer.toString(iNo);

        return (strCube.endsWith(striNo));
    }
}

class program06
{
    public static void  main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number : ");
        int iValue = sobj.nextInt();

        NumberX nobj = new NumberX();

        boolean bRet = nobj.ChkTrimorphic(iValue);

        if(bRet == true)
        {
            System.out.println("Trimorphic number");
        }
        else
        {
            System.out.println("Not Trimorphic number");
        }
    }
}