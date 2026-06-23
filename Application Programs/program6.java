import java.util.*;

class Demo
{
    public boolean CheckEvenOdd(int iNo)
    {
        int iRemainder = 0;
        iRemainder = iNo % 2;

        if(iRemainder == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

class program6
{
    public static void main(String A[])
    {
        int iValue = 0;
        boolean bRet = false;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number : ");
        iValue = sobj.nextInt();

        Demo dobj = new Demo();

        bRet = dobj.CheckEvenOdd(iValue);

        if(bRet == true)
        {
            System.out.println(iValue+" is Even");
        }
        else
        {
            System.out.println(iValue+" is Odd");
        }
    }
}