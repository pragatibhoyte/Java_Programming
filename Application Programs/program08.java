import java.util.*;

class Demo
{
    public int CalculateTicketPrice(int iAge)
    {
        // Input updater
        
        if(iAge < 0)
        {
            iAge = -iAge;
        }

        if(iAge >= 0 && iAge <= 5)
        {
            return 200;
        }
        else if(iAge >= 6 && iAge <= 10)
        {
            return 500;
        }
        else if(iAge >= 11 && iAge <= 20)
        {
            return 700;
        }
        else if(iAge >= 21 && iAge <= 30)
        {
            return 900;
        }
        else if(iAge >= 31 && iAge <= 40)
        {
            return 1000;
        }
        else
        {
            return 300;
        }
    }
}

class program8
{
    public static void main(String A[])
    {
        int iValue = 0;
        int iRet = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Please Enter your Age : ");
        iValue = sobj.nextInt();

        Demo dobj = new Demo();

        iRet = dobj.CalculateTicketPrice(iValue);

        System.out.println("Your ticket price is : "+iRet);
    }
}