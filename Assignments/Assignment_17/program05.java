// Write a program to print the multiplication of a number

import java.util.Scanner;

class Logic
{
    void printTable(int iNo)
    {
        int iCnt = 0;

        for(iCnt = 1; iCnt <= 10; iCnt++)
        {
            System.out.println(iNo * iCnt);
        }
    }
}

class program05
{
    public static void main(String A[])
    {
        int iValue = 0;

        Logic lobj = new Logic();
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number : ");
        iValue = sobj.nextInt();

        lobj.printTable(iValue);
    }
}

