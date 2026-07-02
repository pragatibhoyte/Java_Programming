/* Write a program which accepts one number , two positions from user and check whether
   bit at first or second position is ON or OFF
   Input : 10  3   7
   Output : FALSE
*/

import java.util.*;

class Bitwise
{
    public boolean ChkBit(int iNo, int iPos1, int iPos2)
    {
        int iMask1 = 0x1 << (iPos1 - 1);
        int iMask2 = 0x1 << (iPos2 - 1);

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

class program04
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        Bitwise bobj = new Bitwise();

        System.out.println("Enter Number : ");
        int iValue = sobj.nextInt();

        System.out.println("Enter first position : ");
        int iLocation1 = sobj.nextInt();

        System.out.println("Enter second position : ");
        int iLocation2 = sobj.nextInt();

        boolean bRet = bobj.ChkBit(iValue, iLocation1, iLocation2);

        System.out.println(bRet);
    }
}


