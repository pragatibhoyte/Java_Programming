// Write a program to check whether a number is divisible by 5 and 11 or not

import java.util.Scanner;

class Logic
{
    void checkDivisible(int iNo)
    {
        if((iNo % 5 == 0) && (iNo % 11 == 0))
        {
            System.out.println("Number is divisible by 5 and 11");
        }
        else
        {
            System.out.println("Number is not divisible by 5 and 11");
        }
    }
}

class program03
{
    public static void main(String A[])
    {
        int iValue = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number : ");
        iValue = sobj.nextInt();

        Logic lobj = new Logic();
        lobj.checkDivisible(iValue);
    }
}