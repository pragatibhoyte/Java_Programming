/* Write a java program to accept file name from 
   user and and open that file and display contents on screen*/

import java.io.*;
import java.util.*;

class program02
{
    public static void main(String A[])    throws IOException
    {
        String fileName;
        int ch = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter File name : ");
        fileName = sobj.next();

        try 
        {
            FileReader fr = new FileReader(fileName); 

            while((ch = fr.read()) != -1)
            {
                System.out.print((char)ch);
            }

            fr.close();
        } 
        catch (FileNotFoundException e) 
        {
            System.out.println("File does not exists");
        }

        sobj.close();
    }
}

