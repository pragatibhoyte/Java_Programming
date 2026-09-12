/* Write a program to find longest word of sentence

Description : Identify the word having maximum length

Input Format : One sentence
Output Format : print : longest word

Example : Input : Java is powerful
          Output : powerful
*/

import java.util.*;

class StringX
{
    public String FindLongestWord(String str)
    {
        str = str.trim();
        str = str.replaceAll("\\s+", " ");

        String Tokens[] = str.split(" ");
        String Longest = "";

        for(int i = 0; i < Tokens.length; i++)
        {
            if(Tokens[i].length() > Longest.length())
            {
                Longest = Tokens[i];
            }
        }

        return Longest;
    }
}

class program02
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        StringX obj = new StringX();

        System.out.println("Enter String : ");
        String str = sobj.nextLine();

        String sRet = obj.FindLongestWord(str);

        System.out.println("Longest word is : "+sRet);
    }
}