// Write a program to calculate the power of a number using loops

import java.util.Scanner;

class Logic
{
    int calculatePower(int base, int exp)
    {
        int iCnt = 0;
        int iPower = 1;
        for(iCnt = 1; iCnt <= exp; iCnt++)
        {
            iPower = iPower * base;
        }

        return iPower;
    }
}

class program05
{
    public static void main(String A[])
    {
        int iValue = 0;
        int iExponent = 0;
        int iRet = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number : ");
        iValue = sobj.nextInt();

        System.out.println("Enter Exponent : ");
        iExponent = sobj.nextInt();

        Logic lobj = new Logic();
        iRet = lobj.calculatePower(iValue, iExponent);

        System.out.println("power of a number : "+iRet);
    }
}