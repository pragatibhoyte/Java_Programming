import java.util.*;

class program2
{
    public static int Addition(int iNo1, int iNo2)
    {
        int iSum = 0;
        iSum = iNo1 + iNo2;
        return iSum;
    }
    public static void main(String A[])
    {
        int iValue1 = 0, iValue2 = 0;
        int iRet = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter first number : ");
        iValue1 = sobj.nextInt();

        System.out.println("Enter second number : ");
        iValue2 = sobj.nextInt();

        iRet = Addition(iValue1, iValue2);

        System.out.println("Addition is : "+iRet);
    }
}