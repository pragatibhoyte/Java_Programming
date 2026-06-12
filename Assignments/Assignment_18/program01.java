// Write a program to check whether a number is prime or not

import java.util.Scanner;

class Logic
{
    boolean checkPrime(int iNo)
    {
        if(iNo <= 1)
        {
            return false;
        }
        
        int iCnt = 0;
        int iCount = 0;
        for(iCnt = 2; iCnt <= (iNo/2); iCnt++)
        {
            if (iNo % iCnt == 0)
            {
                iCount++;
                break;
            }
        }

        if(iCount == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

class program01
{
    public static void main(String A[]) 
    {   
        int iValue = 0;
        boolean bRet = false;
        Scanner sobj = new Scanner(System.in);
        Logic lobj = new Logic();

        System.out.println("Enter number : ");
        iValue = sobj.nextInt();
        
        bRet = lobj.checkPrime(iValue);

        if(bRet == true)
        {
            System.out.println("Number is prime");
        }
        else
        {
            System.out.println("Number is not prime");
        }
    }
}