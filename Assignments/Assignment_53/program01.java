import java.util.*;

class Parking
{
    public int CalculateCharges(int hours)
    {
        if(hours < 0)
        {
            return -1;
        }

        if(hours <= 2)
        {
            return 20;
        }
        else if(hours >= 3 && hours <= 10)
        {
            return 20 + (hours - 2)*10;
        }
        else
        {
            return 20 + (hours - 2)*10 + 50;
        }
    }
}

class program01
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Total parking hours : ");
        int hrs = sobj.nextInt();

        Parking pobj = new Parking();

        int iRet = pobj.CalculateCharges(hrs);

        if(iRet == -1)
        {
            System.out.println("Hours cannot be negative");
            return;
        }

        System.out.println("Total Parking Duration : "+hrs+" hours");
        System.out.println("Total Parking Fee : Rs."+iRet);
    }
}