/* Write a program which accepts matrix and check whether it is Sparse matrix or not.

Sparse matrix is a matrix with majority of its elements equal to zero. */

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

    public boolean chkSparse(int Arr[][], int iRow, int iCol)
    {
        boolean bFlag = false;
        int countZero = 0; 
        int countOcc = 0;

        for(int i = 0; i < iRow; i++)
        {
            for(int j = 0; j < iCol; j++)
            {
                if(Arr[i][j] == 0)
                {
                    countZero++;
                }
                else
                {
                    countOcc++;
                }
            }
        }

        if(countOcc < countZero)
        {
            bFlag = true;
        }

        return bFlag;
    }
}

class program05
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

        boolean bRet = aobj.chkSparse(Arr, n, m);

        if(bRet == true)
        {
            System.out.println("Matrix is Sparse Matrix");
        }
        else
        {
            System.out.println("Matrix is Not Sparse Matrix");
        }
    }
}