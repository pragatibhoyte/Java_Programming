/* Write a program which accepts matrix and return largest number from both 
   the diagonals */

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

    public int maxDiagonal(int Arr[][], int iRow, int iCol)
    {
        if(iRow != iCol)
        {
            return -1;
        }

        int maximum = Arr[0][0];

        for(int i = 0; i < Arr.length; i++)
        {
            if(Arr[i][i] > maximum)
            {
                maximum = Arr[i][i];
            }
        }    

        for(int j = 0; j < iRow; j++)
        {
            if(Arr[j][iRow - 1 - j] > maximum)
            {
                maximum = Arr[j][iRow - 1 - j];
            }
        }    

        return maximum;
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

        aobj.displayMatrix(Arr, m);

        int iRet = aobj.maxDiagonal(Arr, m, n);

        System.out.println("Largest number in both the diagonals : "+iRet);
    }
}