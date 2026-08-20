import java.util.*;

class program01
{
    public int CalculateFair(int Distance, String PeakHr)
    {
        int Fair = 0;

        if(Distance < 0)
        {
            return -1;
        }

        PeakHr = PeakHr.toLowerCase();

        if((PeakHr.equals("yes") || PeakHr.equals("no")) == false)
        {
            return 1;
        }

        if(Distance <= 10)
        {
            Fair = 50 + (Distance * 12);
        }
        else if(Distance > 10)
        {
            Fair = 50 + (10 * 12) + ((Distance-10) * 15);
        }

        if(PeakHr.equals("yes"))
        {
            Fair = Fair + (Fair * 20) / 100;
        }

        return Fair;
    }

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        program01 pobj = new program01();

        System.out.println("Enter Distance in km (integer) : ");
        int distance = sobj.nextInt();

        System.out.println("Peak hour (Yes/No) : ");
        String pHr = sobj.next();

        int iRet = pobj.CalculateFair(distance, pHr);

        if(iRet == -1)
        {
            System.out.println("Distance cannot be negative");
            return;
        }
        else if(iRet == 1)
        {
            System.out.println("Peak hours input should be Yes or No");
            return;
        }
        else
        {
            System.out.println("Distance : "+distance+" km");
            System.out.println("Peak Hour : "+ pHr);
            System.out.println("Total Fare Rs.: "+iRet);
        }
    }
}