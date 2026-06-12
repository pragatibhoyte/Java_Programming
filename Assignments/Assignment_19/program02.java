// Write a program to display the grade of a student based on marks

import java.util.Scanner;

class Logic
{
    void displayGrade(int marks)
    {
        if (marks<=100 && marks>=80)
        {
            System.out.println("Excellent");
        }

        else if(marks>=70)
        {
            System.out.println("Very Good");
        }

        else if(marks>=50)
        {
            System.out.println("Good");
        }

        else if(marks>=40)
        {
            System.out.println("Average");
        }
        else
        {
            System.out.println("Poor");
        }
    }
}

class program02
{
    public static void main(String A[])
    {
        int iValue = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Marks : ");
        iValue = sobj.nextInt();

        Logic lobj = new Logic();
        lobj.displayGrade(iValue);
    }
}