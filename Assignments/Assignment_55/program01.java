/*
    A hospital bill includes consultation + medicine + room charges per day. If insured, insurance covers up to ₹50,000 or 70% of bill (whichever is lower). ICU ward costs extra.

    Input: days, wardType(Normal/ICU), medicineBill, consultationFee, insured(Yes/No)

    Output: totalBill, insuranceCover, finalPay

    Validations: all non-negative, wardType valid.
    
*/

import java.util.*;

class Hospital
{
    public int FinalPay = 0;
    int InsuranceCover = 0;
    public int TotalBill = 0;

    public int CalculateInsuranceCover(int days, String WardType, int MedicalBill, int ConsultationBill, String Insured, int room, int ICU)
    {
        if(days < 0 || MedicalBill < 0 || ConsultationBill < 0 || room < 0 || ICU < 0 )
        {
            return -1;
        }

        WardType = WardType.toLowerCase();
        Insured = Insured.toLowerCase();

        if((WardType.equals("normal") || WardType.equals("icu")) == false)
        {
            return 1;
        }

        if((Insured.equals("yes") || Insured.equals("no")) == false)
        {
            return 1;
        }

        if(Insured.equals("yes"))
        {
            if(WardType.equals("icu"))
            {
                TotalBill = days * ICU;
            }
            else
            {
                TotalBill = days * room;
            }

            TotalBill = TotalBill + MedicalBill + ConsultationBill;

            int BillPercent = (TotalBill * 70) / 100;

            if(BillPercent > 50000)
            {
                InsuranceCover = 50000;
            } 
            else
            {
                InsuranceCover = BillPercent;
            }

            FinalPay = TotalBill - InsuranceCover;
        }
        else
        {
            return 0;
        }

        return InsuranceCover;
    }
}

class program01
{
    public static void main(String A[]) 
    {
        Scanner sobj = new Scanner(System.in);

        Hospital hobj = new Hospital();

        System.out.println("Enter Total days in hospital : ");
        int iValue1 = sobj.nextInt();

        System.out.println("Enter Ward Type (Normal / ICU) : ");
        String sValue1 = sobj.next();

        System.out.println("Enter Medicine Bill : ");
        int iValue2 = sobj.nextInt();

        System.out.println("Enter Consultation fess : ");
        int iValue3 = sobj.nextInt();

        System.out.println("Insured (Yes/No) : ");
        String sValue2 = sobj.next();

        System.out.println("Enter Room charges : ");
        int room = sobj.nextInt();

        System.out.println("Enter ICU charges : ");
        int icu = sobj.nextInt();

        int iRet = hobj.CalculateInsuranceCover(iValue1, sValue1, iValue2, iValue3, sValue2, room, icu);

        if(iRet == -1)
        {
            System.out.println("Any Value should be non Negative");
        }
        else if(iRet == 1)
        {
            System.out.println("Invalid Ward type OR Insurance should be Yes/No");
        }
        else if(iRet == 0)
        {
            System.out.println("No Insurance");
        }
        else
        {
            System.out.println("Total Bill : "+hobj.TotalBill);
            System.out.println("Insurance Cover : "+iRet);
            System.out.println("Final Pay : "+hobj.FinalPay);
        }
    }
}