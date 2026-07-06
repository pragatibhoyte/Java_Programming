// Prime number using flag

import java.util.*;

class program38
{
    public static boolean ChkPrime(int iNo)
    {
        boolean bFlag = true;

        for(int iCnt = 2; iCnt <= (iNo/2); iCnt++)
        {
            if(iNo % iCnt == 0)
            {
                bFlag = false;
            }          
        }

        return bFlag;
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