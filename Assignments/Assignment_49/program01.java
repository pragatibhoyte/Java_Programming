// Write a java program to accept file name from user and open that file

import java.io.*;
import java.util.*;

class program01
{
    public static void main(String A[])    throws IOException
    {
        String fileName;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter File name : ");
        fileName = sobj.next();

        try 
        {
            FileReader fr = new FileReader(fileName); 
            System.out.println("File opened successfully");
            fr.close();
        } 
        catch (FileNotFoundException e) 
        {
            System.out.println("File does not exists");
        }

        sobj.close();
    }
}

