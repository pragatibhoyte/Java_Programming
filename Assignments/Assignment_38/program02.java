/* Write a program which accepts two numbers from user and display position
   of common ON bits from that two numbers
   Input : 10   15
   Output : 2  4
*/

import java.util.*;

class Bitwise
{
    public void CommonOnBits(int iNo1, int iNo2)
    {
        int iCount = 0;

        while((iNo1 != 0) || (iNo2 != 0))
        {   
            iCount++; 

            if(((iNo1 & 1) == 1)  && ((iNo2 & 1) == 1))
            {
                System.out.println(iCount);
            }

            iNo1 = iNo1 >> 1;
            iNo2 = iNo2 >> 1;
        }
    }
}

class program02
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        Bitwise bobj = new Bitwise();

        System.out.println("Enter first Number : ");
        int iValue1 = sobj.nextInt();

        System.out.println("Enter second Number : ");
        int iValue2 = sobj.nextInt();

        bobj.CommonOnBits(iValue1, iValue2);
    }
}


