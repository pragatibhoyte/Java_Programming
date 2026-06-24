import java.util.*;

class program19
{
    public static void Display(int iNo)
    {
        // Input Filter
        
        if(iNo < 0)
        {
            System.out.println("Invalid input");
            return;
        }

        int iCnt = 0;

        for(iCnt = 0; iCnt <= iNo; iCnt++)
        {
            System.out.println(iCnt);
        }
    }
    
    public static void main(String A[])
    {
        int iValue = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter frequency : ");
        iValue = sobj.nextInt();

        Display(iValue);
    }
}