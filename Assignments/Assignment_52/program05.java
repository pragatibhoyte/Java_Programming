import java.util.*;

class ECommercePlatform
{
    public int CalculateBill(int Amount, String type)
    {
        int Discount = 0;
        int PremiumDiscount = 0;

        if(Amount <= 0)
        {
            return -1;
        }

        type = type.toLowerCase();

        if((type.equals("premium") || type.equals("regular")) == false)
        {
            return -1;
        }

        if(Amount < 2000)
        {
            return Discount;
        }
        else if(Amount >= 5000)
        {
            Discount = (20 * Amount) / 100;
        }
        else if(Amount >= 2000)
        {
            Discount = (10 * Amount) / 100;
        }

        int DiscountPrice = Amount - Discount;

        if(type.equals("premium"))
        {
            PremiumDiscount = (5 * DiscountPrice) / 100;
            Discount = Discount + PremiumDiscount;
        }

        return Discount;
    }
}

class program05
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Purchase Amount : ");
        int Amt = sobj.nextInt();

        System.out.println("Enter Membership type (Premium/Regular) : ");
        String type = sobj.next();

        ECommercePlatform eobj = new ECommercePlatform();

        int iRet = eobj.CalculateBill(Amt, type);

        if(iRet == -1)
        {
            System.out.println("Invalid Input");
            return;
        }

        System.out.println("Original Amount : "+Amt);
        System.out.println("Total Discount : "+iRet);
        System.out.println("Final Payable Amount : "+(Amt-iRet));
    }
}