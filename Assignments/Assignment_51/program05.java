/*
    Write java program to accept directory name from user and write data of 
    all files along with its name and size into newly craeted file "Marvellous.txt"
*/

import java.io.*;
import java.util.Scanner;

class Demo
{
    void WriteFileData(String dir, String Filename)  throws IOException
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

        int data = 0;

        for(int i = 0; i < Arr.length; i++)
        {
            if(Arr[i].isFile())
            {
                FileReader fr = new FileReader(Arr[i]);

                fw.write(Arr[i].getName()+": ");

                fw.write("\n");

                while((data = fr.read()) != -1)
                {
                    fw.write(data);
                }

                fw.write("\n");
                fw.write("File Size : "+Arr[i].length() + " bytes");

                fw.write("\n");

                fw.write("------------------------------------------------------");

                fw.write("\n");
                fr.close();
            }
        }

        fw.close();
        
        System.out.println("Files Contents successfully written inside Marvellous.txt with file names and size");
    }
}

class program05
{
    public static void main(String A[])  throws IOException
    {
        String DirectoryName;

        Scanner sobj = new Scanner(System.in);
        Demo dobj = new Demo();

        System.out.println("Enter Directory Name :");
        DirectoryName = sobj.next();

        dobj.WriteFileData(DirectoryName, "Marvellous.txt");
    }
}