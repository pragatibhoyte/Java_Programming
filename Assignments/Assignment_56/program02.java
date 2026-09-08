import java.util.*;

class CinemaHall
{
    public void ManageSeating(int R, int C)
    {
        Scanner sobj = new Scanner(System.in);

        int Arr[][] = new int[R][C];

        System.out.println("Enter seat status (0-Empty, 1-Booked) ");

        for(int i = 0; i < R; i++)
        {
            System.out.println("Enter seats booking of row "+(i+1));

            for(int j = 0; j < C; j++)
            {
                Arr[i][j] = sobj.nextInt();

                if((Arr[i][j] != 0) && (Arr[i][j] != 1))
                {
                    System.err.println("Invalid input");
                    return;
                }
            }
        }

        int booked = 0;
        int RCount = 0;
        int Max = 0;
        int index = 0;

        for(int i = 0; i < R; i++)
        {
            RCount = 0;

            for(int j = 0; j < C; j++)
            {
                if(Arr[i][j] == 1)
                {
                    booked++;
                    RCount++;
                }
            }

            if(RCount > Max)
            {
                Max = RCount;
                index = i+1;
            }
        }

        System.out.println("Total booked seats : "+booked);

        System.out.println("Row with Maximum Booking : "+index+" ("+Max+" Booked)");

        if(Max == C)
        {
            System.out.println("Row "+index+" is completely full");
        }
        else
        {
            System.out.println("No row is completely full");
        }

        System.out.println("Seat matrix : ");

        for(int i = 0; i < R; i++)
        {
            for(int j = 0; j < C; j++)
            {
                System.out.print(Arr[i][j]+"   ");
            }

            System.out.println();
        }
    }
}

class program02
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        CinemaHall cobj = new CinemaHall();

        System.out.println("Enter Number of Rows : ");
        int R = sobj.nextInt();

        if(R <= 0)
        {
            System.out.println("Invalid Input");
            return;
        }

        System.out.println("Enter Number of Columns : ");
        int C = sobj.nextInt();

        if(C <= 0)
        {
            System.out.println("Invalid Input");
            return;
        }

        cobj.ManageSeating(R, C);
    }
}