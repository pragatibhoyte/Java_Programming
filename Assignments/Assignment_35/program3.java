
import java.util.*;

// Write a program which checks whether 7th & 15th & 21st, 28th bit is ON or OFF

class program3
{
    public static boolean CheckBit(int iNo)
    {
        int iMask1 = 0x0;
        int iMask2 = 0x0;
        int iMask3 = 0x0;
        int iMask4 = 0x0;

        int iMask = 0;
        int iResult = 0;

        iMask1 = 0x40;
        iMask2 = 0x4000;
        iMask3 = 0x100000;
        iMask4 = 0x8000000;

        iMask = iMask1 | iMask2 | iMask3 | iMask4;

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
            System.out.println("7th & 15th & 21st, 28th bit is ON");
        }
        else
        {
            System.out.println("7th & 15th & 21st, 28th bit is OFF");
        }
    }
}