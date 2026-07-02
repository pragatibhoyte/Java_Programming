/* Write a program which accepts number from user and toggle contents 
   of first and last nibble of the number. Return modified string. (Nibble is group of 4 bits)
*/ 

import java.util.*;

class Bitwise
{
    public int ToggleNibble(int iNo)
    {
        int iMask1 = 0xf;
        int iMask2 = 0xf0000000;

        int iMask = iMask1 | iMask2;

        int iResult = iNo ^ iMask;

        return iResult;
    }
}

class program05
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        Bitwise bobj = new Bitwise();

        System.out.println("Enter Number : ");
        int iValue = sobj.nextInt();

        int iRet = bobj.ToggleNibble(iValue);

        System.out.println("Modified number : "+iRet);
    }
}


