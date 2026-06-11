// Write a program to find maximum of two numbers

import java.util.Scanner;

class Logic
{
    void findMax(int iNo1, int iNo2)
    {
        if(iNo1 > iNo2)
        {
            System.out.println(iNo1+" is largest number");
        }
        else
        {
            System.out.println(iNo2+" is largest number");
        }
    }
}

class program03
{
    public static void main(String A[])
    {
        int iValue1 = 0, iValue2 = 0;

        Logic lobj = new Logic();
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter two numbers : ");
        iValue1 = sobj.nextInt();
        iValue2 = sobj.nextInt();

        lobj.findMax(iValue1, iValue2);
    }
}

