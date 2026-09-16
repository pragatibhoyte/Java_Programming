// Write a program which accepts matrix and reverse the contents of each row.

import java.util.*;

class ArrayX
{
    public void displayMatrix(int Arr[][], int m)
    {
        for(int i = 0; i < Arr.length; i++)
        {
            for(int j = 0; j < m; j++)
            {
                System.out.print(Arr[i][j]+"  ");
            }

            System.out.println();
        }
    }

    public void reverseRows(int Arr[][], int iRow, int iCol)
    {
        int temp = 0;
        int count = 0;

        for(int i = 0; i < iRow; i++)
        {
            count = iCol - 1;

            for(int j = 0; j < iCol/2; j++)
            {
                temp = Arr[i][j];
                Arr[i][j] = Arr[i][count];
                Arr[i][count] = temp;

                count--;
            }
        }
    }
}

class program02
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        ArrayX aobj = new ArrayX();

        System.out.println("Enter number of Rows : ");
        int n = sobj.nextInt();

        System.out.println("Enter number of Columns : ");
        int m = sobj.nextInt();

        int Arr[][] = new int[n][m];

        System.out.println("Array Elements");

        for(int i = 0; i < n; i++)
        {
            System.out.println("Enter elements for row "+(i+1)+" : ");

            for(int j = 0; j < m; j++)
            {
                Arr[i][j] = sobj.nextInt();
            }
        }

        System.out.println();

        aobj.displayMatrix(Arr, m);

        System.out.println();

        aobj.reverseRows(Arr, n, m);

        System.out.println("Reversed rows matrix : ");

        aobj.displayMatrix(Arr, m);
    }
}