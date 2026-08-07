/* 
   Write a java program to accept file name from user and and open 
   that file in write mode and write some data at the end of file

*/

import java.io.*;
import java.util.*;

class program03
{
    public static void main(String A[])    throws IOException
    {
        String fileName;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter File name : ");
        fileName = sobj.next();

        try 
        {
            FileWriter fw = new FileWriter(fileName, true);

            fw.append(" I love java");

            System.out.println("File appended susccessfully");

            fw.close();
        } 
        catch (FileNotFoundException e) 
        {
            System.out.println("File does not exists");
        }

        sobj.close();
    }
}

