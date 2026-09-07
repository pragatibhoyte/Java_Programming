import java.util.*;

class CinemaBooking
{
    int Rows;
    int Cols;

    public CinemaBooking(int a, int b)
    {
        Rows = a;
        Cols = b;
    }

    public void booking(int Booked[][], int Requested[][])
    {
        float totalCost = 0;

        // Check whether requested seats are already booked

        for(int i = 0; i < Booked.length; i++)
        {
            for(int j = 0; j < Requested.length; j++)
            {
                if(Booked[i][0] == Requested[j][0] &&
                   Booked[i][1] == Requested[j][1])
                {
                    System.out.println("Seat " + Requested[j][0] + " "
                                       + Requested[j][1] + " is already booked");

                    System.out.println("Booking Failed");
                    return;
                }
            }
        }

        // Calculate price according to row

        for(int i = 0; i < Requested.length; i++)
        {
            int row = Requested[i][0];

            if(row == 1)
            {
                totalCost = totalCost + 300;
            }
            else if(row == 2)
            {
                totalCost = totalCost + 250;
            }
            else if(row == 3)
            {
                totalCost = totalCost + 200;
            }
            else if(row == 4)
            {
                totalCost = totalCost + 150;
            }
        }

        // Apply 10% discount if group size >= 6
        
        if(Requested.length >= 6)
        {
            totalCost = totalCost - (totalCost * 10.0f / 100);
        }

        // Calculate remaining seats
        int totalSeats = Rows * Cols;
        int remainingSeats = totalSeats - Booked.length - Requested.length;

        System.out.println("Booking Successful");
        System.out.println("Total Cost : " + totalCost);
        System.out.println("Remaining Seats : " + remainingSeats);
    }
}


class program05
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        CinemaBooking cobj = new CinemaBooking(4,5);

        System.out.println("Enter total number of seats booked : ");
        int iNo = sobj.nextInt();

        int Brr[][] = new int[iNo][2];

        System.out.println("Enter booked seats (row column) : ");

        for(int i = 0; i < iNo; i++)
        {
            for(int j = 0; j < 2; j++)
            {
                Brr[i][j] = sobj.nextInt();
            }
        }

        System.out.println("Enter Number of seats you wanna book : ");
        int no = sobj.nextInt();

        int Arr[][] = new int[no][2];

        System.out.println("Enter requested seats (row column) : ");

        for(int i = 0; i < no; i++)
        {
            for(int j = 0; j < 2; j++)
            {
                Arr[i][j] = sobj.nextInt();
            }
        }

        cobj.booking(Brr, Arr);
    }
}