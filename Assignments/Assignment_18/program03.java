// Write a program to print all odd numbers upto N

import java.util.Scanner;

class Logic
{
    void printOddNumbers(int iNo)
    {
        int iCnt = 0;
        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            if(iCnt % 2 != 0)
            {
                System.out.println(iCnt);
            }
        }
    }
}

class program03
{
    public static void main(String A[]) 
    {   
        int iValue = 0;
        Scanner sobj = new Scanner(System.in);
        Logic lobj = new Logic();

        System.out.println("Enter number : ");
        iValue = sobj.nextInt();
        
        lobj.printOddNumbers(iValue);
    }
}