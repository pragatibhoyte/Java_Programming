import java.util.*;

class University
{
    public void CalculateResult(int Arr[])
    {
        int i = 0;
        double Average = 0;
        int iSum = 0;

        for(i = 0; i < Arr.length; i++)
        {
            if(Arr[i] < 0 || Arr[i] > 100)
            {
                System.out.println("Invalid Marks");
                return;
            }
        }

        for(i = 0; i < Arr.length; i++)
        {
            if(Arr[i] < 35)
            {
                System.out.println("Result : Fail");
                return;
            }
            else
            {
                iSum = iSum + Arr[i];
            }
            
        }
        
        Average = (double)iSum / Arr.length;

        System.out.println("Average Marks : "+Average);

        if(Average >= 75)
        {
            System.out.println("Final Result : Distinction");
        }
        else if(Average >= 60)
        {
            System.out.println("Final Result : First Class");
        }
        else if(Average >= 50)
        {
            System.out.println("Final Result : Second Class");
        }
        else if(Average < 50)
        {
            System.out.println("Final Result : Pass");
        }
    }
}

class program03
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Arr[] = new int[5];

        System.out.println("Enter Marks of 5 subjects  : ");

        for(int i = 0; i < Arr.length; i++)
        {
            Arr[i] = sobj.nextInt();
        }

        University uobj = new University();

        uobj.CalculateResult(Arr);
    }
}