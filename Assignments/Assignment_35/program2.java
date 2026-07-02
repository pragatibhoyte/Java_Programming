
import java.util.*;

// Write a program which checks whether 5th and 18th bit is ON or OFF

class program2
{
    public static boolean CheckBit(int iNo)
    {
        int iMask1 = 0x0;
        int iMask2 = 0x0;
        int iMask = 0;
        int iResult = 0;

        iMask1 = 0x10;     // 5th bit mask
        iMask2 = 0x20000;  // 18th bit mask

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
            System.out.println("5th and 18th bit is ON");
        }
        else
        {
            System.out.println("5th and 18th bit is OFF");
        }
    }
}