/*
    Write a program to check whether a given number is Neon Number or not.

    Description:
    A number is Neon if the sum of digits of its square equals the number.

    Input:
    One integer num

    Output:
    Neon Number or Not Neon Number

    Example:
    Input: 9
    Explanation: 9² = 81, sum digits = 8+1=9
    Output: Neon Number

*/

import java.util.Scanner;

class NumberX
{
    public boolean ChkNeon(int iNo)
    {
        boolean bFlag = false;
        int iSquare = iNo * iNo;
        int iSum = 0, iDigit = 0;

        while(iSquare != 0)
        {
            iDigit = iSquare % 10;
            iSum = iSum + iDigit;
            iSquare = iSquare / 10;
        }

        if(iSum == iNo)
        {
            bFlag = true;
        }

        return bFlag;
    }
}

class program01
{
    public static void  main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number : ");
        int iValue = sobj.nextInt();

        NumberX nobj = new NumberX();

        boolean bRet = nobj.ChkNeon(iValue);

        if(bRet == true)
        {
            System.out.println("Neon number");
        }
        else
        {
            System.out.println("Not Neon number");
        }
    }
}