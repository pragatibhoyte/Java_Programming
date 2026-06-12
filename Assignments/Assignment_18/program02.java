// Write a program to print all even numbers upto N

import java.util.Scanner;

class Logic
{
    void printEvenNumbers(int iNo)
    {
        int iCnt = 0;
        for(iCnt = 2; iCnt <= iNo; iCnt++)
        {
            if(iCnt % 2 == 0)
            {
                System.out.println(iCnt);
            }
        }
    }
}

class program02
{
    public static void main(String A[]) 
    {   
        int iValue = 0;
        Scanner sobj = new Scanner(System.in);
        Logic lobj = new Logic();

        System.out.println("Enter number : ");
        iValue = sobj.nextInt();
        
        lobj.printEvenNumbers(iValue);
    }
}