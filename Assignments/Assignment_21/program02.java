// Write a program to count how many even and odd numbers are present between 1 and N

import java.util.Scanner;

class Logic
{
    void countEvenOddRange(int iNo)
    {
        int iCnt = 0;
        int iCountEven = 0;
        int iCountOdd = 0;

        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            if(iCnt % 2 == 0)
            {
                iCountEven++;
            }
            else
            {
                iCountOdd++;
            }
        }

        System.out.println("Count of Even numbers : "+iCountEven);
        System.out.println("Count of Odd numbers : "+iCountOdd);
    }
    
}

class program02
{
    public static void main(String A[])
    {
        int iValue = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number : ");
        iValue = sobj.nextInt();

        Logic lobj = new Logic();
        lobj.countEvenOddRange(iValue);
    }
}