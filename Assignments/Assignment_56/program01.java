import java.util.*;

class Student
{
    public void PerformanceAnalyzer(int N, int M)
    {
        Scanner sobj = new Scanner(System.in);

        int Arr[][] = new int[N][M];

        for(int i = 0; i < N; i++)
        {
            System.out.println("Enter Marks of student "+(i+1));

            for(int j = 0; j < M; j++)
            {
                Arr[i][j] = sobj.nextInt();

                if((0 > Arr[i][j]) || (Arr[i][j] > 100))
                {
                    System.err.println("Each mark must be between 0 and 100");
                    return;
                }
            }
        }

        int total = 0;
        int Max = 0;
        int index = 0;

        System.out.println("Student Totals : ");

        for(int i = 0; i < N; i++)
        {
            total = 0;

            for(int j = 0; j < M; j++)
            {
                total = total + Arr[i][j];
            }

            if(total > Max)
            {
                Max = total;
                index = i;
            }

            System.out.println("Student "+(i+1)+" : "+total);
        }

        System.out.println("Topper : Student "+(index+1));

        int Average = 0;

        System.out.println("Subject Averages : ");

        for(int i = 0; i < M; i++)
        {
            Average = 0;
            total = 0;

            for(int j = 0; j < N; j++)
            {
                total = total + Arr[j][i];
            }

            Average= (total/N);

            System.out.println("Subject "+(i+1)+": "+Average);
        }

        System.out.println("Failed Students : ");

        for(int i = 0; i < N; i++)
        {
            for(int j = 0; j < M; j++)
            {
                if(Arr[i][j] < 35)
                {
                    System.out.println((i+1));
                    break;
                }
            }
        }
    }
}

class program01
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        Student pobj = new Student();

        System.out.println("Enter Number of sudents : ");
        int N = sobj.nextInt();

        if(N <= 0)
        {
            System.out.println("Invalid Input");
            return;
        }

        System.out.println("Enter Number of subjects : ");
        int M = sobj.nextInt();

        if(M <= 0)
        {
            System.out.println("Invalid Input");
            return;
        }

        pobj.PerformanceAnalyzer(N, M);
    }
}