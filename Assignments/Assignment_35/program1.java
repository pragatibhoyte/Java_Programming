
import java.util.*;

// Write a program which checks whether 15th bit is ON or OFF

class program1
{
    public static boolean CheckBit(int iNo)
    {
        int iMask = 0x0;
        int iResult = 0;

        iMask = 0x4000;   // 15th bit mask

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
            System.out.println("15th bit is ON");
        }
        else
        {
            System.out.println("15th bit is OFF");
        }
    }
}