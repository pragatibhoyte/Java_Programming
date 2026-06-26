import java.util.*;

    class NumberX
    {
        public int SumFactors(int iNo)
        {
            int iCnt = 0;
            int iSum = 0;

            for(iCnt = 1; iCnt <= (iNo/2); iCnt++)
            {
                if(iNo % iCnt == 0)
                {
                    iSum = iSum + iCnt;
                }
            }

            return iSum;
        }
    }

class program30
{   
    public static void main(String A[])
    {
        int iValue = 0;
        int iRet = 0;

        Scanner sobj = new Scanner(System.in);
        
        NumberX nobj = new NumberX();

        System.out.println("Enter Number : ");
        iValue = sobj.nextInt();
        
        iRet = nobj.SumFactors(iValue);

        System.out.println("Summation of factors is : "+iRet);
    }
}

// Time Complexity : O(N/2)