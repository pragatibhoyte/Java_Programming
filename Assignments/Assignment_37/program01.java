/* Write a program which accepts number and position from user and check wheather
   bit at that position is on or off. If bit is one return TRUE otherwise return FALSE
   Input : 10   2
   Output : TRUE   */ 


import java.util.*;

class Bitwise
{
    public boolean ChkBit(int iNo, int iPos)
    {
        int iMask = 0x1;
        int iResult = 0;

        iMask = iMask << (iPos-1);   

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
}

class program01
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        Bitwise bobj = new Bitwise();

        System.out.println("Enter Number : ");
        int iValue = sobj.nextInt();

        System.out.println("Enter Position : ");
        int iLocation = sobj.nextInt();

        boolean bRet = bobj.ChkBit(iValue, iLocation);

        System.out.println(bRet);
    }
}


