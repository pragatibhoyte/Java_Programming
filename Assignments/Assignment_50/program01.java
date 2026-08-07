/*
    Write a java program to accept two file names from user and open
    first file and create new file file(Second name) and copy data from 
    first file into newly created file
*/

import java.io.*;
import java.util.*;

class Program01
{
    public static void main(String A[])  throws IOException
    {
        String filename1, filename2;
        int ch = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Source file name : ");
        filename1 = sobj.next();

        System.out.println("Enter destination file name : ");
        filename2 = sobj.next();

        try
        {
            FileReader fr = new FileReader(filename1);

            FileWriter fw = new FileWriter(filename2);

            while((ch = fr.read()) != -1)
            {
                fw.write(ch);
            }

            System.out.println("File contents copied successfully");

            fr.close();
            fw.close();
        }
        catch(FileNotFoundException e)
        {
            System.out.println("File "+filename1+" does not exists");
        }

    }
}