/*
    Write a program to check whether a given number is Spy Number or not.

    Description:
    A number is Spy if:
    (sum of digits) = (product of digits)

    Input:
    One integer num

    Output:
    Spy Number or Not Spy Number

    Example:
    Input: 1124
    Sum = 1+1+2+4 = 8
    Product = 1×1×2×4 = 8
    Output: Spy Number
*/

import java.util.Scanner;

class NumberX
{
    public boolean ChkSpy(int iNo)
    {
        int iSum = 0;
        int iMult = 1;
        int iDigit = 0;

        while(iNo != 0)
        {
            iDigit = iNo % 10;

            iSum = iSum + iDigit;
            iMult = iMult * iDigit;

            iNo = iNo / 10;
        }

        return (iSum == iMult);
    }
}

class program03
{
    public static void  main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number : ");
        int iValue = sobj.nextInt();

        NumberX nobj = new NumberX();

        boolean bRet = nobj.ChkSpy(iValue);

        if(bRet == true)
        {
            System.out.println("Spy number");
        }
        else
        {
            System.out.println("Not Spy number");
        }
    }
}