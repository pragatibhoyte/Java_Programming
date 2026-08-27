/*
    Write a program to check whether a given number is a Strong Number or not.

    Description:
    A number is called Strong Number if the sum of factorials of each digit is equal to the number itself.

    Input:
    One integer num

    Output:
    Print: Strong Number or Not Strong Number

    Example:
    Input: 145
    Explanation: 1! + 4! + 5! = 1 + 24 + 120 = 145
    Output: Strong Number
*/

import java.util.*;

class NumberX
{
    public boolean ChkStrongNumber(int Num)
    {
        int iDigit = 0;
        int temp = Num;
        int Factorial = 1;
        int iSum = 0;

        while(Num != 0)
        {
            Factorial = 1;
            iDigit = Num % 10;

            for(int i = 1 ; i <= iDigit ; i++)
            {
                Factorial = Factorial * i;
            }

            iSum = iSum + Factorial;

            Num = Num /10;
        }

        if(iSum == temp)
        {
            return true;
        }

        return false;
    }
}

class program01
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number : ");
        int iValue = sobj.nextInt();

        NumberX nobj = new NumberX();

        boolean bRet = nobj.ChkStrongNumber(iValue);

        if(bRet == true)
        {
            System.out.println("Number is Strong number");
        }
        else
        {
            System.out.println("Number is NOT Strong number");
        }
    }
}