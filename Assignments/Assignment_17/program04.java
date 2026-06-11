// Write a program to find minimum of three numbers

import java.util.Scanner;

class Logic
{
    void findMin(int iNo1, int iNo2, int iNo3)
    {
        if((iNo1 < iNo2) && (iNo1 < iNo3))
        {
            System.out.println(iNo1+" is smallest number");
        }

        else if((iNo2 < iNo1) && (iNo2 < iNo3))
        {
            System.out.println(iNo2+" is smallest number");
        }

        else
        {
            System.out.println(iNo3+" is smallest number");
        }
    }
}

class program04
{
    public static void main(String A[])
    {
        int iValue1 = 0, iValue2 = 0, iValue3 = 0;

        Logic lobj = new Logic();
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter three numbers : ");
        iValue1 = sobj.nextInt();
        iValue2 = sobj.nextInt();
        iValue3 = sobj.nextInt();

        lobj.findMin(iValue1, iValue2, iValue3);
    }
}

