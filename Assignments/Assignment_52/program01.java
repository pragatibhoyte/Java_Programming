import java.util.*;

class Library
{
    public int CalculateFine(int days)
    {
        if(days < 0)
        {
            return -1;
        }
        else if(days <= 7)
        {
            return 0;
        }
        else if(days <= 12)
        {
            return (days-7) * 5;
        }
        else 
        {
            return (5 * 5) + ((days-12) * 10);
        }
    }
}

class program01
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int iRet = 0;

        System.out.println("Enter the number of days the book was kept : ");
        int days = sobj.nextInt();

        Library lobj = new Library();

        iRet = lobj.CalculateFine(days);

        if(iRet == 0)
        {
            System.out.println("Returned on time. No fine applicable.");
        }
        else if(iRet == -1)
        {
            System.out.println("Invalid Input");
        }
        else
        {
            System.out.println("Total fine to be paid : Rs."+iRet);
        }
    }
}