// Prime number using iCount

import java.util.*;

class program39
{
    public static boolean ChkPrime(int iNo)
    {
        if(iNo <= 1)
        {
            return false;
        }

        int iCount = 0;

        for(int iCnt = 2; iCnt <= (iNo/2); iCnt++)
        {
            if(iNo % iCnt == 0)
            {
                iCount++;
            }          
        }

        if(iCount > 0)
        {
            return false;
        }

        return true;
    }
    
    public static void main(String A[])
    {
        int iValue = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number : ");
        iValue = sobj.nextInt();

        boolean bRet = ChkPrime(iValue);
        
        if(bRet == true)
        {
            System.out.println("Number is prime");
        }
        else
        {
            System.out.println("Number is not prime");
        }
    }
}