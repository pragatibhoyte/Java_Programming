import java.util.*;

class ElectricityCompany
{
    public int CalculateBill(int units)
    {
        if(units < 0)
        {
            return -1;
        }
        else if(units <= 100)
        {
            return (units * 5);
        }
        else if(units <= 200)
        {
            return (100*5)+((units-100 )* 7);
        }
        else
        {
            return 500 + 700 + ((units-200) * 10);
        }
    }
}

class program04
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter units consumed : ");
        int units = sobj.nextInt();

        ElectricityCompany eobj = new ElectricityCompany();

        int iRet = eobj.CalculateBill(units);

        if(iRet == -1)
        {
            System.out.println("Invalid Input");
        }

        System.out.println("Total units Consumed : "+units);
        System.out.println("Total Electricity Bill : "+iRet);
    }
}