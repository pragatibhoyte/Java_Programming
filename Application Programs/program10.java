import java.util.*;

class Demo
{
    public int CalculateTicketPrice(int iAge)
    {
        // Input Filter
        
        if(iAge < 0)
        {
            return -1;
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

class program10
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

        if(iRet == -1)
        {
            System.out.println("Please enter positive Age");
        }
        else
        {
            System.out.println("Your ticket price is : "+iRet);
        }
    }
}