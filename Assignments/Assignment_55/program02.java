/*

Base fare depends on distance slabs. Add charges for class (Sleeper/3AC/2AC). If booking within 24 hours, add Tatkal 30%. Senior citizen gets 40% discount.

Input: distance, classType, bookingHoursBefore, age

Output: finalFare + reason breakdown

*/

import java.util.*;

class TrainBooking
{
    public int FinalFair = 0;
    public int BaseFair = 0;

    public int Charge = 0;

    public int SleeperCharge = 200;
    public int AC3Charge = 150;
    public int AC2Charge = 200;

    public void CalcFair(int Distance, String ClassType, int Hours, int Age)
    {
        ClassType = ClassType.toLowerCase();

        if(Distance <= 0 || Hours < 0 || Age <= 0)
        {
            System.out.println("Invalid Input type");
            return;
        }

        if((ClassType.equals("sleeper") || ClassType.equals("3ac") || ClassType.equals("2ac")) == false)
        {
            System.out.println("Invalid Class type");
            return;
        }

        if(Distance < 100)
        {
            BaseFair = 200;
        }
        else if(Distance < 200)
        {
            BaseFair = 350;
        }
        else if(Distance < 500)
        {
            BaseFair = 500;
        }
        else
        {
            BaseFair = 1000;
        }

        if(ClassType.equals("sleeper"))
        {
            Charge = SleeperCharge;
            FinalFair = BaseFair + Charge;
        }
        else if(ClassType.equals("3ac"))
        {
            Charge = AC3Charge;
            FinalFair = BaseFair + Charge;
        }
        else
        {
            Charge = AC2Charge;
            FinalFair = BaseFair + Charge;
        }

        if(Hours <= 24)
        {
            int TatkalCharge = (FinalFair * 30) /100;
            FinalFair = FinalFair + TatkalCharge;
            System.out.println("Tatkal Charges Added : "+TatkalCharge);
        }

        if(Age >= 60)
        {
            int SeniorCitizenDiscount = (FinalFair * 40) /100;
            FinalFair = FinalFair - SeniorCitizenDiscount;
            System.out.println("Senior citizen discount : "+SeniorCitizenDiscount);
        }

        System.out.println("Base fair : "+BaseFair);
        System.out.println("Class "+ClassType+" charges : "+Charge);

        System.out.println("Final fair : "+FinalFair);
    }
}

class program02
{
    public static void main(String A[]) 
    {
        Scanner sobj = new Scanner(System.in);

        TrainBooking hobj = new TrainBooking();

        System.out.println("Enter Distance : ");
        int iValue1 = sobj.nextInt();

        System.out.println("Enter class type (Sleeper/3AC/2AC): ");
        String sValue1 = sobj.next();

        System.out.println("Enter Booking hours before train timing : ");
        int iValue2 = sobj.nextInt();

        System.out.println("Enter Age : ");
        int iValue4 = sobj.nextInt();

        hobj.CalcFair(iValue1, sValue1, iValue2, iValue4);
    }
}