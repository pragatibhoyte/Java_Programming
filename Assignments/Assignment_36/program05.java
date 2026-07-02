/* Write a program whic accepts one number from user and on its first 4 bits.
   Return modified number  
   Input : 73
   Output : 79   */ 


import java.util.*;

class Bitwise
{
    public int OnBit(int iNo)
    {
        int iMask = 0xf;  
        
        int iResult = iNo | iMask;

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

        int iRet = bobj.OnBit(iValue);

        System.out.println("Modified Number : "+iRet);

    }
}


