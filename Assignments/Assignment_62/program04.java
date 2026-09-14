/* Write a program which accepts matrix and display addition of elements 
   from each column */

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

    public void AddColumn(int Arr[][], int iRow, int iCol)
    {
        int Addition = 0;

        System.out.println("Column wise Addition : ");

        for(int i = 0; i < iCol; i++)
        {
            Addition = 0;
            
            for(int j = 0; j < iRow; j++)
            {
                Addition = Addition + Arr[j][i];
            }

            System.out.print(Addition+"  ");
        }
    }
}

class program04
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

        aobj.displayMatrix(Arr, m);

        aobj.AddColumn(Arr, m, m);
    }
}