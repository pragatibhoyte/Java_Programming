/* Write a program which accepts number and position from user and 
   toggle that bit. Return Modified number
   Input : 10   3
   Output : 14  */ 


import java.util.*;

class Bitwise
{
    public int ToggleBit(int iNo, int iPos)
    {
        int iMask = 0x1;
        int iResult = 0;

        iMask = iMask << (iPos-1);  

        iResult = iNo ^ iMask;

        return iResult;
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

        System.out.println("Enter Position : ");
        int iLocation = sobj.nextInt();

        int iRet = bobj.ToggleBit(iValue, iLocation);

        System.out.println("Modified number : "+iRet);
    }
}


