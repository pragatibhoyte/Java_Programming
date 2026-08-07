/* 
   Write a java program to accept file name from user and 
   display all names of files from that directory
*/

import java.io.*;
import java.util.*;

class program05
{
    public static void main(String A[]) 
    {
        String DirectoryName;
        int ch = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Directory name : ");
        DirectoryName = sobj.next();

        File fobj = new File(DirectoryName);

        if(fobj.isDirectory() && fobj.exists())
        {
            String Arr[] = fobj.list();

            System.out.println("Files from directory are : ");

            for(int i = 0; i < Arr.length; i++)
            {
                System.out.println(Arr[i]);
            }
        }
        else
        {
            System.out.println("Directory does not exists");
        }

        sobj.close();
    }
}

