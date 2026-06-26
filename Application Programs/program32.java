import java.util.*;

    class NumberX
    {
        public boolean ChkPerfect(int iNo)
        {
            int iCnt = 0;
            int iSum = 0;

            for(iCnt = 1; iCnt <= (iNo/2); iCnt++)
            {
                if(iNo % iCnt == 0)
                {
                    iSum = iSum + iCnt;
                }

                if(iSum > iNo)
                {
                    break;
                }
            }

            if(iSum == iNo)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
    }

class program32
{   
    public static void main(String A[])
    {
        int iValue = 0;
        boolean bRet = false;

        Scanner sobj = new Scanner(System.in);
        
        NumberX nobj = new NumberX();

        System.out.println("Enter Number : ");
        iValue = sobj.nextInt();
        
        bRet = nobj.ChkPerfect(iValue);

        if(bRet == true)
        {
            System.out.println(iValue+" is Perfect Number");
        }
        else
        {
            System.out.println(iValue+" is Not Perfect Number");
        }
    }
}

// Time Complexity : O(N/2)