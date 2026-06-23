import java.util.*;

class Demo
{
    public int CheckEvenOdd(int iNo)
    {
        int iRemainder = 0;
        iRemainder = iNo % 2;

        return iRemainder;
    }
}

class program5
{
    public static void main(String A[])
    {
        int iValue = 0, iRet = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number : ");
        iValue = sobj.nextInt();

        Demo dobj = new Demo();

        iRet = dobj.CheckEvenOdd(iValue);

        if(iRet == 0)
        {
            System.out.println(iValue+" is Even");
        }
        else
        {
            System.out.println(iValue+" is Odd");
        }
    }
}