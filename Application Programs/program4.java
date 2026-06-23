import java.util.*;

class Demo
{
    public void CheckEvenOdd(int iNo)
    {
        int iRemainder = 0;
        iRemainder = iNo % 2;

        if(iRemainder == 0)
        {
            System.out.println(iNo+" is Even");
        }
        else
        {
            System.out.println(iNo+" is Odd");
        }
    }
}

class program4
{
    public static void main(String A[])
    {
        int iValue = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number : ");
        iValue = sobj.nextInt();

        Demo dobj = new Demo();

        dobj.CheckEvenOdd(iValue);
    }
}