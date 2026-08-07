/*
    Write a java program to accept file name from user and check 
    whether that fie is regular or not
*/

import java.io.*;
import java.util.*;

class Program02
{
    public static void main(String A[]) 
    {
        String filename;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter file name : ");
        filename = sobj.next();

        File fobj = new File(filename);

        if(fobj.exists() == false)
        {
            System.out.println("File does not exists");
            return;
        }

        if(fobj.isFile())
        {
            System.out.println(filename + " is regular file");
        }
        else
        {
            System.out.println(filename + " is not a regular file");
        }
    }
}