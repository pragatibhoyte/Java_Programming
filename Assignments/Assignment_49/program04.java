/* 
   Write a java program to accept file name from user and create 
   new file of that name if it is not existing

*/

import java.io.*;
import java.util.*;

class program04
{
    public static void main(String A[]) 
    {
        String fileName;
        int ch = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter File name : ");
        fileName = sobj.next();

        try
        {
            File file = new File(fileName);

            if(file.createNewFile())
            {
                System.out.println("File created successfully");
            }
            else
            {
                System.out.println("File already exists");
            }
        }
        catch(IOException e)
        {
            System.out.println("Unable to create file");
        }

        sobj.close();
    }
}

