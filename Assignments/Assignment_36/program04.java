/* Write a program whic accepts number from user and toggle 7th and 10th bit of that
   number. Return modified number  
   Input : 137
   Output : 713   */ 


import java.util.*;

class Bitwise
{
    public int ToggleBit(int iNo)
    {
        int iMask1 = 0x40;  // 7th bit mask
        int iMask2 = 0x200;  // 10th bit mask

        int iMask = iMask1 | iMask2;
        
        int iResult = iNo ^ iMask;

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

        int iRet = bobj.ToggleBit(iValue);

        System.out.println("Modified Number : "+iRet);

    }
}


