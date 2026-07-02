/* Write a program which accepts one number from user and check whether
   9th or 12th bit is On or off
   Input : 257
   Output : TRUE
*/

import java.util.*;

class Bitwise
{
    public boolean ChkBit(int iNo)
    {
        int iMask1 = 0x100;
        int iMask2 = 0x800;

        int iResult1 = iNo & iMask1;
        int iResult2 = iNo & iMask2;

        if((iResult1 == iMask1) || (iResult2 == iMask2))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

class program03
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        Bitwise bobj = new Bitwise();

        System.out.println("Enter Number : ");
        int iValue = sobj.nextInt();

        boolean bRet = bobj.ChkBit(iValue);

        System.out.println(bRet);
    }
}


