/*

Water Bill with Progressive Slabs + Late Fee

Slabs + fixed meter charge. If paid after due date, add 2% penalty per week late (maximum 10%).

Input: units, weeksLate

Output: billAmount

*/

import java.util.*;

class WaterBill
{
    public float CalcBill(int units, int weekslate)
    {
        int FixedCharge = 50;
        float bill = 0;
        float lateCharge = 0;

        if(units <= 100)
        {
            bill = FixedCharge + (units * 1);
        }
        else if(units <= 200)
        {
            bill = FixedCharge + 100 + (units-100)*2;
        }
        else if(units <= 500)
        {
            bill = FixedCharge + 100 + 200 + (units-200)*3;
        }
        else
        {
            bill = FixedCharge + 100 + 200 + 900 + (units-500)*5;
        }

        if(weekslate > 5)
        {
            weekslate = 5;
        }
       
        lateCharge = bill * (2.0f/100) * weekslate;

        bill = bill + lateCharge;

        return bill;
    }
}

class program04
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter units : ");
        int iValue1 = sobj.nextInt();

        System.out.println("Enter weeks late : ");
        int iValue2 = sobj.nextInt();

        WaterBill wobj = new WaterBill();

        float fRet = wobj.CalcBill(iValue1, iValue2);

        System.out.println("Total Bill Amount : "+fRet);
    }
}