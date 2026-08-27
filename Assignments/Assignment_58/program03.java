/*
    Write a program to check whether a given number is Perfect Number or not.

    Description:
    A number is Perfect if the sum of all proper divisors (excluding the number) is equal to the number.

    Input:
    One integer num

    Output:
    Perfect Number or Not Perfect Number

    Example:
    Input: 28
    Explanation: divisors = 1, 2, 4, 7, 14 → sum = 28
    Output: Perfect Number
*/

import java.util.*;

class program03
{
    static boolean ChkPerfect(int iNo)
    {
        int iSum = 0;
        boolean bFlag = false;
        
        for(int i = 1; i <= iNo/2; i++)
        {   
            if(iNo % i == 0)
            {
                iSum = iSum + i;
            }
        }

        if(iNo == iSum)
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

        boolean bRet = ChkPerfect(iValue);

        if(bRet == true)
        {
            System.out.println("Perfect Number");
        }
        else
        {
            System.out.println("Not Perfect Number");
        }
    }
}