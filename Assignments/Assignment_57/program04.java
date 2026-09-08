/*
    Telecom Call Billing

    A telecom company bills calls based on duration slabs. The system needs to calculate final charge for a given call duration.

    Rules:

    First 5 minutes free
    Next 10 minutes (6–15) → ₹1 per minute
    Beyond 15 → ₹2 per minute

    Input:

    Call duration in minutes (integer)

    Validations:

    Minutes must be ≥ 0

    Expected Output:

    Call Duration: <minutes> minutes
    Total Call Charge: ₹<amount>

*/

import java.util.*;

class TelecomCompany
{
    public int CalcBill(int mins)
    {
        int Bill = 0;

        if(mins < 0)
        {
            System.out.println("Invalid input");
            return -1;
        }

        if(mins <= 5)
        {
            Bill = 0;
        }
        else if(mins <= 15)
        {
            Bill = (mins-5)*1;
        }
        else
        {
            Bill = 10*1 + (mins-15)*2;
        }

        return Bill;
    }
}

class program04
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        TelecomCompany hobj = new TelecomCompany();

        System.out.println("Enter Call duartion in minutes (Integer) : ");
        int no = sobj.nextInt();

        int iRet = hobj.CalcBill(no);

        if(iRet == -1)
        {
            System.out.println("Invalid input");
            return;
        }

        System.out.println("Call Duration : "+no+" minutes");
        System.out.println("Total Call charges : "+iRet+" Rs.");
    }
}