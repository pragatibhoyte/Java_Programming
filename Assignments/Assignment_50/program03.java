/*
    Write a java program to accept directory name from user and create that directory
*/

import java.io.*;
import java.util.*;

class Program03
{
    public static void main(String A[]) 
    {
        String DirectoryName;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Directory name : ");
        DirectoryName = sobj.next();

        File fobj = new File(DirectoryName);

        if(fobj.mkdir())
        {
            System.out.println("Directory Created successfully");
        }
        else
        {
            System.out.println("Directory name already exists");
        }
    }
}