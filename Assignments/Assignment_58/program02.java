import java.util.*;

class NumberX
{
    public boolean ChkArmstrong(int Num)
    {
        int iDigit = 0;
        int temp = Num;
        int iSum = 0;
        int iCount = 0;
        int Ans = 1;

        while(Num != 0)
        {
            iCount++;
            Num = Num / 10;
        }

        Num = temp;

        while(Num != 0)
        {   
            Ans = 1;
            iDigit = Num % 10;

            for(int i = 1; i <= iCount; i++)
            {
                Ans = Ans * iDigit;
            }

            iSum = iSum + Ans;

            Num = Num /10;
        }

        if(iSum == temp)
        {
            return true;
        }

        return false;
    }
}

class program02
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number : ");
        int iValue = sobj.nextInt();

        NumberX nobj = new NumberX();

        boolean bRet = nobj.ChkArmstrong(iValue);

        if(bRet == true)
        {
            System.out.println("Number is Armstrong number");
        }
        else
        {
            System.out.println("Number is NOT Armstrong number");
        }
    }
}