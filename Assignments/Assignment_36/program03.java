/* Write a program whic accepts number from user and toggle 7th bit of that
   number. Return modified number  
   Input : 137
   Output : 201   */ 


import java.util.*;

class Bitwise
{
    public int ToggleBit(int iNo)
    {
        int iMask = 0x40;  // 7th bit mask
        int iResult = 0;

        iResult = iNo ^ iMask;

        return iResult;
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

        int iRet = bobj.ToggleBit(iValue);

        System.out.println("Modified Number : "+iRet);

    }
}


