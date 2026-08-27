/*
    Write a program to check whether a given number is a Harshad Number or not.

    Description:
    A number is Harshad if it is divisible by the sum of its digits.

    Input:
    One integer num

    Output:
    Harshad Number or Not Harshad Number

    Example:
    Input: 18
    Explanation: sum digits = 1 + 8 = 9, 18 % 9 = 0
    Output: Harshad Number
*/

import java.util.*;

class program04
{
    static boolean ChkHarshad(int iNo)
    {
        int iSum = 0;
        boolean bFlag = false;
        int iDigit;
        int temp = iNo;

        if(iNo == 0)
        {
            return false;
        }

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            iSum = iSum + iDigit;
            iNo = iNo / 10;
        }
        
        if(temp % iSum == 0)
        {
            bFlag = true;
        }

        return bFlag;
    }
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number : ");
        int iValue = sobj.nextInt();

        boolean bRet = ChkHarshad(iValue);

        if(bRet == true)
        {
            System.out.println("Harshad Number");
        }
        else
        {
            System.out.println("Not Harshad Number");
        }
    }
}