// Write a program to ckeck whether a number is positive, negative, or zero

import java.util.Scanner;

class Logic
{
    void ckeckSign(int iNo)
    {
        if(iNo < 0)
        {
            System.out.println("Number is negative");
        }
        else if(iNo > 0)
        {
            System.out.println("Number is positive");
        }
        else
        {
            System.out.println("Number is Zero");
        }
    }
}

class program05
{
    public static void main(String A[]) 
    {   
        int iValue = 0;
        Scanner sobj = new Scanner(System.in);
        Logic lobj = new Logic();

        System.out.println("Enter number : ");
        iValue = sobj.nextInt();
        
        lobj.ckeckSign(iValue);
    }
}