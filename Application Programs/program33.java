// Input : 5
// Output : 1 3 5

import java.util.*;

class program33
{
    public static void Display(int iNo)
    {
        int iCnt = 0;

        for(iCnt = 1; iCnt <= iNo; iCnt+=2)
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