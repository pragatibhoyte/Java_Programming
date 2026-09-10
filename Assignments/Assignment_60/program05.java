// WAP to count frequency of each character

import java.util.*;

class StringX
{
    public void calculateFrequency(String str)
    {
        HashMap <Character, Integer> hobj = new HashMap<Character, Integer>();

        str = str.toLowerCase();

        char Arr[] = str.toCharArray();

        for(int i = 0; i < Arr.length; i++)
        {
            if(hobj.containsKey(Arr[i]))
            {
                hobj.put(Arr[i], (hobj.get(Arr[i])+1));
            }
            else
            {
                hobj.put(Arr[i],1);
            }
        }

        for(Map.Entry<Character, Integer> entry : hobj.entrySet())
        {
            System.out.println(entry.getKey()+" -> "+entry.getValue());
        }
    }
}

class program05
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        StringX obj = new StringX();

        System.out.println("Enter String : ");
        String str = sobj.nextLine();

        obj.calculateFrequency(str);
    }
}