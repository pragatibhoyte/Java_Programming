// Write a program to find the sum of even and odd digits separately in a number

import java.util.Scanner;

class Logic
{
    void sumEvenOddDigits(int iNo)
    {
        int iSumEven = 0;
        int iSumOdd = 0;
        int iDigit = 0;

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            if((iDigit % 2 )== 0)
            {
                iSumEven = iSumEven + iDigit;
            }
            else
            {
                iSumOdd = iSumOdd + iDigit;
            }

            iNo = iNo / 10;
        }

        System.out.println("Sum of odd numbers : "+iSumOdd);
        System.out.println("Sum of even numbers : "+iSumEven);
    }
}

class program04
{
    public static void main(String A[]) 
    {   
        int iValue = 0;
        Scanner sobj = new Scanner(System.in);
        Logic lobj = new Logic();

        System.out.println("Enter number : ");
        iValue = sobj.nextInt();
        
        lobj.sumEvenOddDigits(iValue);
    }
}