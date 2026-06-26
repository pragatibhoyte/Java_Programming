import java.util.*;

    class NumberX
    {
        public void DisplayFactors(int iNo)
        {
            int iCnt = 0;

            for(iCnt = 1; iCnt < (iNo); iCnt++)
            {
                if(iNo % iCnt == 0)
                {
                    System.out.print(iCnt+"\t");
                }
            }

            System.out.println("\n");
        }
    }

class program27
{   
    public static void main(String A[])
    {
        int iValue = 0;

        Scanner sobj = new Scanner(System.in);

        NumberX nobj = new NumberX();

        System.out.println("Enter Number : ");
        iValue = sobj.nextInt();
        
        nobj.DisplayFactors(iValue);
    }
}

// Time Complexity : O(N)