// Write a program to calculate the product of digits of a number

import java.util.Scanner;

class Logic
{
    int productOfDigits(int iNo)
    {
        int iDigit = 0;
        int iProduct = 1;

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            
            iProduct = iProduct * iDigit;

            iNo = iNo / 10;
        }

        return iProduct;
    }
}

class program01
{
    public static void main(String A[])
    {
        int iValue = 0;
        int iRet = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number : ");
        iValue = sobj.nextInt();

        Logic lobj = new Logic();
        iRet = lobj.productOfDigits(iValue);

        System.out.println("Product of digits in number is : "+iRet);
    }
}