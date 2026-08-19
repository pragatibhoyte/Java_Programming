import java.util.*;

class TrafficPoliceApp
{
    public int CalculateFine(String Helmet, String Licence, String OverSpeeding)
    {
        int Fine = 0;

        Helmet = Helmet.toLowerCase();
        Licence = Licence.toLowerCase();
        OverSpeeding = OverSpeeding.toLowerCase();

        if(
            !(Helmet.equals("yes") || Helmet.equals("no")) &&
            !(Licence.equals("yes") || Licence.equals("no")) &&
            !(OverSpeeding.equals("yes") || OverSpeeding.equals("no"))
          )
        {
            return -1;
        }

        if(Helmet.equals("no"))
        {
            Fine = Fine + 500;
        }

        if(Licence.equals("no"))
        {
            Fine = Fine + 1000;
        }

        if(OverSpeeding.equals("yes"))
        {
            Fine = Fine + 1500;
        }

        return Fine;
    }
}

class program04
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Helmet worn (Yes/ No): ");
        String helmet = sobj.next();

        System.out.println("Licence Available (Yes/ No): ");
        String licence = sobj.next();

        System.out.println("Overspeeding (Yes/ No): ");
        String overspeed = sobj.next();

        TrafficPoliceApp tobj = new TrafficPoliceApp();

        int iRet = tobj.CalculateFine(helmet, licence, overspeed);

        if(iRet == -1)
        {
            System.out.println("Inputs must be Yes / No only");
            return;
        }

        System.out.println("Total Fine Amount : "+iRet);
    }
}