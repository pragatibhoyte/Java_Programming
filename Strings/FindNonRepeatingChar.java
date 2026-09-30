import java.util.*;

class FindNonRepeatingChar
{
    public static void nonReapeatingCharCount(String str)
    {
        str = str.toLowerCase();
        int frequency[] = new int[26];

        for(int i = 0; i < str.length(); i++)
        {
            if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
            {
                frequency[str.charAt(i)-97]++;
            }
        }
        
        for(int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);

            if(ch >='a' && ch <= 'z' && frequency[ch-'a'] == 1)
            {
                System.out.println(ch);
                return;
            }
        }
    }

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter string : ");
        String str = sobj.nextLine();

        nonReapeatingCharCount(str);
    }
}