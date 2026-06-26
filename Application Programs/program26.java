import java.util.*;

class NumberX
{
    public boolean ChkDivisibility(int iNo)
    {
        if((iNo % 3 == 0 )&& (iNo % 5 == 0))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

class program26
{   
    public static void main(String A[])
    {
        int iValue = 0;
        boolean bRet = false;

        Scanner sobj = new Scanner(System.in);

        NumberX nobj = new NumberX();

        System.out.println("Enter Number to check divisiblity : ");
        iValue = sobj.nextInt();

        bRet = nobj.ChkDivisibility(iValue);

        if(bRet == true)
        {
            System.out.println(iValue+" is divisible by both 3 and 5");
        }
        else
        {
            System.out.println(iValue+" is not divisible by both 3 and 5");
        }
    }
}