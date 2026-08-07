/*
    Write a java program to accept file name from user and calculate
    checksum of that file and display on screen
*/

import java.io.*;
import java.util.Scanner;
import java.util.zip.CRC32;

class Program04
{
    public static void main(String A[])  throws IOException
    {
        String FileName;
        int data;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter File name : ");
        FileName = sobj.next();

        try
        {
            FileInputStream fs = new FileInputStream(FileName);

            CRC32 crc = new CRC32();

            while((data = fs.read()) != -1)
            {
                crc.update(data);
            }

            fs.close();

            System.out.println("Checksum value : "+crc.getValue());
        }
        catch(FileNotFoundException e)
        {
            System.out.println("File does not exists");
        }

    }
}