// Write a program to check whether a given year is a leap year or not

import java.util.Scanner;

class Logic
{
    void checkLeapYear(int year)
    {
        if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0) )
        {
            System.out.println("It is leap year");
        }
        else
        {
            System.out.println("It is not leap year");
        }
    }
}

class program01
{
    public static void main(String A[])
    {
        int iValue = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter year : ");
        iValue = sobj.nextInt();

        Logic lobj = new Logic();
        lobj.checkLeapYear(iValue);
    }
}