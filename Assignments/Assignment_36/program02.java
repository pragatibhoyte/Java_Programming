/* Write a program whic accepts number from user and off 7th and 10th bit of that
   number. Return modified number  
   Input : 577
   Output : 1   */ 


import java.util.*;

class Bitwise
{
    public int OffBit(int iNo)
    {
        int iMask1 = 0x40;  // 7th bit mask
        int iMask2 = 0x200; // 10th bit mask
        int iResult = 0;

        int iMask = iMask1 | iMask2;

        iMask = ~iMask;

        iResult = iNo & iMask;

        return iResult;
    }
}

class program02
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        Bitwise bobj = new Bitwise();

        System.out.println("Enter Number : ");
        int iValue = sobj.nextInt();

        int iRet = bobj.OffBit(iValue);

        System.out.println("Modified Number : "+iRet);

    }
}


