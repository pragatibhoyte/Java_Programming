// Input : 5
// Output : 5   4   3   2   1

import java.util.*;

class program34
{
    public static void Display(int iNo)
    {
        int iCnt = 0;

        for(iCnt = iNo; iCnt >= 1; iCnt--)
        {
            System.out.print(iCnt+"\t");
        }

        System.out.println("");
    }

    public static void main(String[] args) 
    {
        int iValue = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number : ");
        iValue = sobj.nextInt();

        Display(iValue);
    }
}