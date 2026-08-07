/*
    Write java program to accept directory name from user and write names of 
    all files from that directory into one newly created file names as "Marvellous.txt"
*/

import java.io.*;
import java.util.Scanner;

class Demo
{
    void WriteFileNames(String dir, String Filename)  throws IOException
    {
        File fobj = new File(dir);

        if(fobj.exists() == false || fobj.isDirectory() == false)
        {
            System.out.println("Directory does not exists");
            return;
        }

        FileWriter fw = new FileWriter(Filename);

        File Arr[] = fobj.listFiles();

        if(Arr == null)
        {
            System.out.println("Unable to access directory");
            return;
        }

        for(int i = 0; i < Arr.length; i++)
        {
            if(Arr[i].isFile())
            {
                fw.write(Arr[i].getName() + "\n");
            }
        }

        fw.close();
        
        System.out.println("File names successfully written inside Marvellous.txt");
    }
}

class program02
{
    public static void main(String A[])  throws IOException
    {
        String DirectoryName;

        Scanner sobj = new Scanner(System.in);
        Demo dobj = new Demo();

        System.out.println("Enter Directory Name :");
        DirectoryName = sobj.next();

        dobj.WriteFileNames(DirectoryName, "Marvellous.txt");
    }
}