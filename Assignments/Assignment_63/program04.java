/* Write a program which accepts matrix and check whether it is identity matrix or not.

Identity matrix is a sqaure matrix with 1's along diagonal from upper left
to lower right and 0's in all other positions. */

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

    public boolean chkIdentity(int Arr[][], int iRow, int iCol)
    {
        if(iRow != iCol)
        {
            return false;
        }

        boolean bFlag = true;

        for(int i = 0; i < iRow; i++)
        {
            for(int j = 0; j < iCol; j++)
            {
                if(i == j && Arr[i][j] != 1)
                {
                    bFlag = false;
                    break;
                }
                else if(Arr[i][j] != 0 && i!= j)
                {
                    bFlag = false;
                    break;
                }
            }
        }

        return bFlag;
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

        System.out.println();

        aobj.displayMatrix(Arr, m);

        System.out.println();

        boolean bRet = aobj.chkIdentity(Arr, n, m);

        if(bRet == true)
        {
            System.out.println("Matrix is Identity Matrix");
        }
        else
        {
            System.out.println("Matrix is Not Identity Matrix");
        }
    }
}