// Write a program to ckeck whether a number is a palindrome or not

import java.util.Scanner;

class Logic
{
    boolean checkPalindrome(int iNo)
    {
        int iTemp = iNo;
        int iDigit = 0;
        int iRev = 0;

        while(iNo > 0)
        {
            iDigit = iNo % 10;
            iRev = (iRev * 10) + iDigit;
            iNo = iNo / 10;
        }

        if(iRev == iTemp)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

class program02
{
    public static void main(String A[])
    {
        int iValue = 0;
        boolean bRet = false;

        Logic lobj = new Logic();
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number : ");
        iValue = sobj.nextInt();

        bRet = lobj.checkPalindrome(iValue);

        if(bRet == true)
        {
            System.out.println("Number is palindrome");
        }
        else
        {
            System.out.println("Number is not palindrome");
        }
    }
}

