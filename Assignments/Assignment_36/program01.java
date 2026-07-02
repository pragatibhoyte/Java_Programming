/* Write a program whic accepts number from user and off 7th bit of that
   number if it is on. Return modified number  
   Input : 79
   Output : 15   */ 


import java.util.*;

class Bitwise
{
    public int OffBit(int iNo, int iPos)
    {
        int iMask = 0x1;
        int iResult = 0;

        iMask = iMask << (iPos-1);   // 7th bit mask

        iMask = ~iMask;

        iResult = iNo & iMask;

        return iResult;
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

        int iRet = bobj.OffBit(iValue, 7);

        System.out.println("Modified Number : "+iRet);

    }
}


