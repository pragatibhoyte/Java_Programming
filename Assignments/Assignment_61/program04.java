/* Write a program to count vowels and consonants in a string

Description : count total vowels (a e i o u) and consonants seperately.

Input Format : One string
Output Format : print : vowels : <count>
                        consonants : <count>

Example : Input : Education
          Output : vowels : 5
                   consonants : 4
*/

import java.util.*;

class StringX
{
    public void countVowelsConsonants(String str)
    {
        str = str.toLowerCase();

        str = str.trim();

        char Arr[] = str.toCharArray();

        int countVowel = 0;
        int countConsonant = 0;

        for(int i = 0; i <Arr.length; i++)
        {
            if(Arr[i] == 'a' || Arr[i] == 'e' || Arr[i] == 'i' || Arr[i] == 'o' || Arr[i] == 'u')
            {
                countVowel++;
            }
            else if(Arr[i] >= 'a' && Arr[i] <= 'z')
            {
                countConsonant++;
            }
        }

        System.out.println("Vowels : "+countVowel);
        System.out.println("Consonants : "+countConsonant);
    }
}

class program04
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        StringX obj = new StringX();

        System.out.println("Enter String : ");
        String str = sobj.nextLine();

        obj.countVowelsConsonants(str);
    }
}
