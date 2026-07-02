/* Write a program which accepts one number from user and count number of 
   ON (1) bits in it without using % and / operator
   Input : 11
   Output : 3
*/

import java.util.*;

class Bitwise
{
    public int CountOne(int iNo)
    {
        int iCount = 0;

        while(iNo != 0)
        {   
            if((iNo & 1) == 1)
            {
                iCount++;
            }

            iNo = iNo >> 1;
        }

        return iCount;
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

        int iRet = bobj.CountOne(iValue);

        System.out.println("number of 1's : "+iRet);
    }
}


