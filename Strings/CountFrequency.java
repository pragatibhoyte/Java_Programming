import java.util.*;

class CountFrequency
{
    public static void countCharOcc(String str)
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
        
        for(int i = 0;i < 26; i++)
        {
            if(frequency[i] > 0)
            {
                System.out.println((char)('a'+i)+" = "+frequency[i]);
            }
        }
    }

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter string : ");
        String str = sobj.nextLine();

        countCharOcc(str);
    }
}