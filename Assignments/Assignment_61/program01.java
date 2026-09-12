/* Write a program to reverse each word of sentence

Description : Reverse individual words but keep word order same

Input Format : One sentence
Output Format : print : sentence with reversed words

Example : Input : Java is powerful
          Output : avaJ si lufrewop
*/

import java.util.*;

class StringX
{
    public void ReverseWords(String str)
    {
        str = str.trim();
        str = str.replaceAll("\\s+", " ");

        // str = str.toLowerCase();

        String Tokens[] = str.split(" ");

        for(int i = 0; i < Tokens.length; i++)
        {
            char Arr[] = Tokens[i].toCharArray();

            StringBuilder reverse = new StringBuilder();
                
            for(int k = Arr.length-1; k >= 0;k--)
            {
                reverse.append(Arr[k]);
            }

            System.out.print(reverse+" ");
        }
    }
}

class program01
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        StringX obj = new StringX();

        System.out.println("Enter String : ");
        String str = sobj.nextLine();

        obj.ReverseWords(str);
    }
}