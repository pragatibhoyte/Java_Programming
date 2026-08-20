import java.util.*;

class program03
{
    public int CalculateCharge(int Weight)
    {
        if(Weight <= 0)
        {
            return -1;
        }

        if(Weight <= 1)
        {
            return 50;
        }
        else if(Weight <= 5)
        {
            return 50 + (Weight - 1) * 20;
        }
        else
        {
            return 150 + (Weight - 5) * 30;
        }
    }

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        program03 pobj = new program03();

        System.out.println("Enter Parcel Weight in kg (integer) : ");
        int Weight = sobj.nextInt();

        int iRet = pobj.CalculateCharge(Weight);

        if(iRet == -1)
        {
            System.out.println("Weight must be greater than 0");
        }
        else
        {
            System.out.println("Parcel Weight : "+Weight+" kg");
            System.out.println("Courier Charges : Rs."+iRet);
        }
    }
}