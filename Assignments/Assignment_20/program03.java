// Write a program to check whether a number is a perfect or not

import java.util.Scanner;

class Logic
{
    boolean checkPerfect(int iNo)
    {
        int iCnt = 0;
        int iSumFacts = 0;

        for(iCnt = 1; iCnt < iNo; iCnt++)
        {
            if(iNo % iCnt == 0)
            {
                iSumFacts = iSumFacts + iCnt;
            }
        }

        if(iNo == iSumFacts)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

class program03
{
    public static void main(String A[])
    {
        int iValue = 0;
        boolean bRet = false;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number : ");
        iValue = sobj.nextInt();

        Logic lobj = new Logic();
        bRet = lobj.checkPerfect(iValue);

        if(bRet == true)
        {
            System.out.println("Number is perfect number");
        }
        else
        {
            System.out.println("Number is not perfect number");
        }
    }
}