
import java.util.*;

// Write a program which checks whether 7th & 8th & 9th bit is ON or OFF

class program4
{
    public static boolean CheckBit(int iNo)
    {
        int iMask1 = 0x0;
        int iMask2 = 0x0;
        int iMask3 = 0x0;

        int iMask = 0;
        int iResult = 0;

        iMask1 = 0x40;
        iMask2 = 0x80;
        iMask3 = 0x100;

        iMask = iMask1 | iMask2 | iMask3;

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
            System.out.println("7th & 8th & 9th bit is ON");
        }
        else
        {
            System.out.println("7th & 8th & 9th bit is OFF");
        }
    }
}