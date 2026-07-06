import java.util.*;

class program37
{
    public static boolean ChkPrime(int iNo)
    {
        for(int iCnt = 2; iCnt <= (iNo/2); iCnt++)
        {
            if(iNo % iCnt == 0)
            {
                return false;   // bad programming practice
            }          
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