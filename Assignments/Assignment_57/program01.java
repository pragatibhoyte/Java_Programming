/*
    1. Hotel Billing System

    A hotel charges ₹3000 per day. For long stays, hotel provides discount to retain customers.

    Rules:

    ₹3000/day
    If stay > 7 days → 5% discount on total bill

    Input:

    Number of days stayed

    Validations:

    Days must be ≥ 0

    Expected Output:

    Total Stay Duration: <days> days
    Final Bill Amount: ₹<amount>

*/

import java.util.*;

class Hotel
{
    public float CalcBill(int days)
    {
        if(days < 0)
        {
            return -1;
        }

        int Bill = days * 3000;

        if(days > 7)
        {
            Bill = Bill - (5*Bill/100);
        }

        return Bill;
    }
}

class program01
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        Hotel hobj = new Hotel();

        System.out.println("Enter Number of days stayed : ");
        int iValue = sobj.nextInt();

        float fRet = hobj.CalcBill(iValue);

        if(fRet == -1)
        {
            System.out.println("Invalid Input");
            return;
        }

        System.out.println("Total Stay Duration : "+iValue+" days");
        System.out.println("Final Bill Amount : "+fRet+" Rs.");
    }
}