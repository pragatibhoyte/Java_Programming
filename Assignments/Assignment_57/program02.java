/*
    Online Election System

    An online election system stores votes by voter ID. Every voter can vote only once. If the same ID appears again, the vote must be rejected and counted as duplicate.

    Input:

    Number of votes N
    N voter IDs

    Validations:

    N ≥ 0
    IDs must be non-negative integers

    Expected Output:

    Valid Votes: <count>
    Rejected Duplicate Votes: <count>

*/

import java.util.*;

class Election
{
    public void VotesAnalyzing(int Arr[])
    {
        int Valid = 0;
        int Duplicate = 0;
        boolean found = false;

        for(int i = 0; i < Arr.length; i++)
        {
            found = false;

            for(int j = 0; j < i; j++)
            {
                if(Arr[i] == Arr[j])
                {
                    found = true;
                    break;
                }
            }

            if(found == true)
            {
                Duplicate++;
            }
            else
            {
                Valid++;
            }
        }

        System.out.println("Valid votes : "+Valid);
        System.out.println("Rejected Duplicate votes : "+Duplicate);
    }
}

class program02
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        Election hobj = new Election();

        System.out.println("Enter Number of votes : ");
        int N = sobj.nextInt();

        int Arr[] = new int[N];

        System.out.println("Enter voter IDs : ");
        
        for(int i = 0; i < N; i++)
        {
            Arr[i] = sobj.nextInt();
        }

        hobj.VotesAnalyzing(Arr);
    }
}