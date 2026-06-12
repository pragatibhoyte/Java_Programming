// Write a program to display factors of a given number
import java.util.Scanner;

class Logic
{
    void displayFactors(int iNo)
    {
        int iCnt = 0;

        for(iCnt = 1; iCnt <= iNo/2; iCnt++)
        {
            if(iNo % iCnt == 0)
            {
                System.out.print(iCnt+"\t");
            }
        }
    }
    
}

class program03
{
    public static void main(String A[])
    {
        int iValue = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number : ");
        iValue = sobj.nextInt();

        Logic lobj = new Logic();
        lobj.displayFactors(iValue);
    }
}