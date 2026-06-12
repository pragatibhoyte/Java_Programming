// Write a program to find the sum of all even numbers up to N

import java.util.Scanner;

class Logic
{
    int sumEvenNumbers(int iNo)
    {
        int iSum = 0;
        int iCnt = 0;

        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            if(iCnt % 2 == 0)
            {
                iSum = iSum + iCnt;
            }
        }

        return iSum;
    }
}

class program01
{
    public static void main(String A[])
    {
        int iValue = 0;
        int iRet = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number : ");
        iValue = sobj.nextInt();

        Logic lobj = new Logic();
        iRet = lobj.sumEvenNumbers(iValue);

        System.out.println("Sum os all even numbers upto this number is : "+iRet);
    }
}