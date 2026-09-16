// Write a program which accepts matrix and reverse the contents of each column.

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

    public void reverseColumns(int Arr[][], int iRow, int iCol)
    {
        int temp = 0;
        int count = 0;

        for(int i = 0; i < iCol; i++)
        {
            count = iRow - 1;

            for(int j = 0; j < iRow/2; j++)
            {
                temp = Arr[j][i];
                Arr[j][i] = Arr[count][i];
                Arr[count][i] = temp;

                count--;
            }
        }
    }
}

class program03
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

        aobj.reverseColumns(Arr, n, m);

        System.out.println("Reversed columns matrix : ");

        aobj.displayMatrix(Arr, m);
    }
}