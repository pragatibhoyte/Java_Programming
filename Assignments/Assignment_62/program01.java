/* Write a program which accepts matrix from user and return addition of 
   diagonal elements */

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

    public int addDiagonal(int Arr[][], int m)
    {
        if(Arr.length != m)
        {
            return -1;
        }

        int diagonalSum = 0;

        for(int i = 0; i < Arr.length; i++)
        {
            diagonalSum = diagonalSum + Arr[i][i];
        }       

        return diagonalSum;
    }
}

class program01
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

        int iRet = aobj.addDiagonal(Arr, m);

        if(iRet == -1)
        {
            System.out.println("Number of Rows and Columns should be same");
            return;
        }

        System.out.println("Addition of diagonal elements : "+iRet);
    }
}