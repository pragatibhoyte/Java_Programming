// Prime number 

import java.util.*;

class program43
{
    public static boolean ChkPrime(int iNo)
    {
        if(iNo <= 1)
        {
            return false;
        }

        int iCnt = 0;

        for(iCnt = 2; iCnt*iCnt <= iNo; iCnt++)
        {
            if(iNo % iCnt == 0)
            {
                break;
            }          
        }

        if(iCnt*iCnt > iNo)
        {
            return true;
        }

        return false;
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