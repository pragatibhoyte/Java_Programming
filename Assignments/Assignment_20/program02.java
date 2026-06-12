// Write a program to print numbers from N down to 1 in reverse order

import java.util.Scanner;

class Logic
{
    void printReverse(int iNo)
    {
        int iCnt = 0;

        for(iCnt = iNo; iCnt >= 1; iCnt--)
        {
            System.out.print(iCnt+"\t");
        }

        System.out.println();
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
        lobj.printReverse(iValue);
    }
}