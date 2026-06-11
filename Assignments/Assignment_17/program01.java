// Write a program to find sum of digits of a number

import java.util.Scanner;

class Logic
{
    int sumOfDigits(int iNum)
    {
        int iDigit = 0;
        int iSum = 0;

        while(iNum > 0)
        {
            iDigit = iNum % 10;
            iSum = iSum + iDigit;
            iNum = iNum / 10;
        }

        return iSum;
    }
}

class program01
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();

        int iValue = 0;
        
        System.out.println("Enter Number : ");
        Scanner sobj = new Scanner(System.in);
        iValue = sobj.nextInt();

        System.out.println("Sum of digits : "+lobj.sumOfDigits(iValue));
    }
}

