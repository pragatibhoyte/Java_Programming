import java.util.*;

class Taxation
{
    public int CalculateTax(int Income)
    {
        int Tax = 0;

        if(Income < 0)
        {
            return -1;
        }

        if(Income <= 250000)
        {
            Tax = 0;
        }
        else if(Income <= 500000)
        {
            Tax = ((Income-250000) * 5) / 100;
        }
        else if(Income <= 1000000)
        {
            Tax = (250000 * 5) / 100;

            Tax = Tax + (((Income - 500000) * 20) / 100);
        }
        else if(Income > 1000000)
        {
            Tax = (250000 * 5) / 100;
            Tax = Tax + (500000 * 20) / 100;
            Tax = Tax + ((Income - 1000000) * 30 / 100);
        }

        return Tax;
    }
}

class program05
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Annual Income : ");
        int income = sobj.nextInt();

        Taxation tobj = new Taxation();

        int iRet = tobj.CalculateTax(income);

        if(iRet == -1)
        {
            System.out.println("Income cannot be negative");
            return;
        }

        System.out.println("Annual Income : "+income);
        System.out.println("Total Tax Payable : Rs."+iRet);
    }
}