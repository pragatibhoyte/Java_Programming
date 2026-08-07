/*
    Write a java program to accept Directory name from user and display all
    names of files from that directory and size od each file on screen
*/

import java.io.*;
import java.util.Scanner;

class Program05
{
    public static void main(String A[])  throws IOException
    {
        String DirectoryName;
        int data;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Directory name : ");
        DirectoryName = sobj.next();
        
        File fobj = new File(DirectoryName);

        if(fobj.exists() && fobj.isDirectory())
        {
            File Arr[] = fobj.listFiles();

            System.out.println("Files in Directory are : ");

            for(int i = 0; i < Arr.length; i++)
            {
                System.out.println("File : "+Arr[i].getName() + ", Size : "+ Arr[i].length()+" bytes");
            }
        }
        else
        {
            System.out.println("Directory does not exists");
        }
        
    }
}