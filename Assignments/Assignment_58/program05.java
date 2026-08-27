/*
    Write a program to check whether a given number is Palindrome or not.

    Description:
    A number is Palindrome if it remains the same when reversed.

    Input:
    One integer num

    Output:
    Palindrome Number or Not Palindrome Number

    Example:
    Input: 121
    Reverse: 121
    Output: Palindrome Number
*/

import java.util.*;

class program05
{
    static boolean ChkPalindrome(int iNo)
    {
        boolean bFlag = false;
        int iDigit;
        int temp = iNo;
        int rev = 0;

        if(iNo == 0)
        {
            return true;
        }

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            rev = (rev * 10) + iDigit;
            iNo = iNo / 10;
        }
        
        if(temp == rev)
        {
            bFlag = true;
        }

        return bFlag;
    }
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number : ");
        int iValue = sobj.nextInt();

        boolean bRet = ChkPalindrome(iValue);

        if(bRet == true)
        {
            System.out.println("Palindrome Number");
        }
        else
        {
            System.out.println("Not Palindrome Number");
        }
    }
}