// Write a program to find largest digit in given number

import java.util.Scanner;

class Logic
{
    int findLargestDigit(int iNo)
    {
        int iDigit = 0;
        int iLargest = 0;

        while(iNo != 0)
        {
            iDigit = iNo % 10;

            if(iDigit > iLargest)
            {
                iLargest = iDigit;
            }

            iNo = iNo / 10;
        }

        return iLargest;
    }
}

class program04
{
    public static void main(String A[])
    {
        int iValue = 0;
        int iRet = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number : ");
        iValue = sobj.nextInt();

        Logic lobj = new Logic();
        iRet = lobj.findLargestDigit(iValue);

        System.out.println("Largest digit in number is : "+iRet);
    }
}