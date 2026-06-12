// Write a program to count total number of factors of given number
import java.util.Scanner;

class Logic
{
    void displayFactors(int iNo)
    {
        int iCnt = 0;
        int iCountFacts = 0;

        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            if(iNo % iCnt == 0)
            {
                iCountFacts++;
            }
        }

        System.out.println("Count of factors : "+iCountFacts);
    }
    
}

class program04
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