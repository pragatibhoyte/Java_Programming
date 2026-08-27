/*
    Write a program to check whether a given number is Disarium Number or not.

    Description:
    A number is Disarium if:
    Sum of digits raised to their position (starting from 1) equals the number.

    Input:
    One integer num

    Output:
    Disarium Number or Not Disarium Number

    Example:
    Input: 135
    Explanation: 1¹ + 3² + 5³ = 1 + 9 + 125 = 135
    Output: Disarium Number
*/

import java.util.Scanner;

class NumberX
{
    public boolean ChkDisarium(int iNo)
    {
        int iCount = 0;
        int temp = iNo;
        int iDigit = 0;
        int iMult = 1;
        int iTotal = 0;

        while(iNo != 0)
        {
            iCount++;
            iNo = iNo/10;
        }

        iNo = temp;

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            iMult = 1;

            for(int i = 1; i <= iCount; i++)
            {
                iMult = iMult * iDigit;
            }

            iTotal = iTotal + iMult;

            iNo = iNo / 10;
            iCount--;
        }

        return (temp == iTotal);
    }
}

class program05
{
    public static void  main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number : ");
        int iValue = sobj.nextInt();

        NumberX nobj = new NumberX();

        boolean bRet = nobj.ChkDisarium(iValue);

        if(bRet == true)
        {
            System.out.println("Disarium number");
        }
        else
        {
            System.out.println("Not Disarium number");
        }
    }
}