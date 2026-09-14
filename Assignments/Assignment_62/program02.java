/* Write a program which accepts matrix and one number from user and return frequency of 
   that number */

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

    public int countFrequency(int Arr[][], int m, int no)
    {
        int frequency = 0;

        for(int i = 0; i < Arr.length; i++)
        {
            for(int j = 0; j < m; j++)
            {
                if(Arr[i][j] == no)
                {
                    frequency++;
                }
            }
        }       

        return frequency;
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

        aobj.displayMatrix(Arr, m);

        System.out.println("Enter number : ");
        int no = sobj.nextInt();

        int iRet = aobj.countFrequency(Arr, m, no);

        System.out.println("Frequency : "+iRet);
    }
}