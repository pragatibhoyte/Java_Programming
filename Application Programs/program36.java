import java.util.*;

class program36
{
    public static void main(String A[])
    {
        int iValue = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number : ");
        iValue = sobj.nextInt();

        for(int iCnt = 2; iCnt < iValue; iCnt++)
        {
            if(iValue % iCnt == 0)
            {
                System.out.println("Number is not prime");
                return;
            }
        }

        System.out.println("Number is prime");
    }
}