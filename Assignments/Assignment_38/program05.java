/* Write a program which accepts one number and range of positions from user.
   toggle all bits from that range.
   Input : 897  9  13
   Output : 7297
*/

import java.util.*;

class Bitwise
{
    public int ToggleBit(int iNo, int iStart, int iEnd)
    {
        int iMask = 0;

        for(int i = iStart; i <= iEnd; i++)
        {
            iMask = iMask | (1 << (i - 1));
        }

        return iNo ^ iMask;
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

        System.out.println("Enter starting range : ");
        int iLocation1 = sobj.nextInt();

        System.out.println("Enter ending range : ");
        int iLocation2 = sobj.nextInt();

        int iRet = bobj.ToggleBit(iValue, iLocation1, iLocation2);

        System.out.println("Modified number : "+iRet);
    }
}


