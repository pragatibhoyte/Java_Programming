// Write a program to print all numbers from 1 to N that are divisible by both 2 and 3

import java.util.Scanner;

class Logic
{
    void printDivisibleBy2and3(int iNo)
    {
        int iCnt = 0;
        int iCountFacts = 0;

        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            if((iCnt % 2 == 0) && (iCnt % 3 == 0))
            {
                System.out.print(iCnt+"\t");
            }
        }

        System.out.println();
    }
    
}

class program05
{
    public static void main(String A[])
    {
        int iValue = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number : ");
        iValue = sobj.nextInt();

        Logic lobj = new Logic();
        lobj.printDivisibleBy2and3(iValue);
    }
}