/*
    Write a program to check whether a given number is Sunny Number or not.

    Description:
    A number is Sunny if num + 1 is a perfect square.

    Input:
    One integer num

    Output:
    Sunny Number or Not Sunny Number

    Example:
    Input: 8
    Explanation: 8+1=9, 9 is perfect square
    Output: Sunny Number
*/

import java.util.Scanner;

class NumberX
{
    public boolean ChkSunny(int iNo)
    {
        int temp = iNo + 1;

        int iRoot = (int)Math.sqrt(temp);
        int iSquare = iRoot * iRoot;

        return (temp == iSquare);
    }
}

class program04
{
    public static void  main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number : ");
        int iValue = sobj.nextInt();

        NumberX nobj = new NumberX();

        boolean bRet = nobj.ChkSunny(iValue);

        if(bRet == true)
        {
            System.out.println("Sunny number");
        }
        else
        {
            System.out.println("Not Sunny number");
        }
    }
}