
import java.util.*;

/* Write a program which checks whether first and last bit is ON or OFF. 
    First bit means bit number 1 and last bit means bit number 32  */

class program5
{
    public static boolean CheckBit(int iNo)
    {
        int iMask1 = 0x0;
        int iMask2 = 0x0;

        int iMask = 0;
        int iResult = 0;

        iMask1 = 0x1;
        iMask2 = 0x80000000;

        iMask = iMask1 | iMask2;

        iResult = iNo & iMask;

        if(iResult == iMask)
        {
            return true;
        }
        else
        {
            return false;
        } 
    }

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number : ");
        int iValue = sobj.nextInt();

        boolean bRet = CheckBit(iValue);

        if(bRet == true)
        {
            System.out.println("first and last bit is ON");
        }
        else
        {
            System.out.println("first and last bit is OFF");
        }
    }
}