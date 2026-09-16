// Write a program which accepts matrix and display transpose of matrix
// The transpose of a given matrix is formed by interchanging the rows and columns of a matrix 

// For same or any number of rows and columns

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

    public int[][] TransposeMatrix(int Arr[][], int iRow, int iCol)
    {
        int transpose[][] = new int[iCol][iRow];

        for(int i = 0; i < iRow; i++)
        {            
            for(int j = 0; j < iCol; j++)
            {
                transpose[j][i] = Arr[i][j];
            }
        }

        return transpose;
    }
}

class program01X
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

        int iRet[][] = aobj.TransposeMatrix(Arr, n, m);

        System.out.println("Transpose matrix : ");

        aobj.displayMatrix(iRet, n);
    }
}