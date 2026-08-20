import java.util.*;

class program04
{
    int Count = 0;

    public int RemainingBalance(int Budget, int Items, int Arr[])
    {
        

        if(Budget < 0 || Items < 0)
        {
            return -1;
        }

        for(int i = 0; i < Arr.length; i++)
        {
            if(Arr[i] <= 0)
            {
                return -1;
            }
        }

        for(int i = 0; i < Arr.length; i++)
        {
            if(Arr[i] > Budget)
            {
                break;
            }

            Budget = Budget - Arr[i];
            Count++;
        }

        return Budget;
    }

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        program04 pobj = new program04();

        System.out.println("Enter Budget Amount : ");
        int Budget = sobj.nextInt();

        System.out.println("Enter Number of Items: ");
        int Items = sobj.nextInt();

        System.out.println("Enter " + Items + " item prices : ");
        
        int Arr[] = new int[Items];

        for(int i = 0; i < Arr.length; i++)
        {
            Arr[i] = sobj.nextInt();
        }

        int iRet = pobj.RemainingBalance(Budget, Items, Arr);

        if(iRet == -1)
        {
            System.out.println("Invalid input");
        }
        else
        {
            System.out.println("Items Purchased : "+ pobj.Count);
            System.out.println("Remaining Balance : Rs."+iRet);
        }
    }
}