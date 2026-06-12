// Write a program to find smallest digit in given number

import java.util.Scanner;

class Logic
{
    int findSmallestDigit(int iNo)
    {
        int iDigit = 0;
        int iSmallest = 9;

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            
            if(iDigit < iSmallest)
            {
                iSmallest = iDigit;
            }

            iNo = iNo / 10;
        }

        return iSmallest;
    }
}

class program05
{
    public static void main(String A[])
    {
        int iValue = 0;
        int iRet = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number : ");
        iValue = sobj.nextInt();

        Logic lobj = new Logic();
        iRet = lobj.findSmallestDigit(iValue);

        System.out.println("Smallest digit in number is : "+iRet);
    }
}