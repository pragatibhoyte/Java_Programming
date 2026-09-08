/*
    Fitness App – Weekly Steps

    A fitness app records steps for 7 days. It wants to show how many days the user achieved the goal and what the highest step count was.

    Input:

    7 integers (steps)

    Validations:

    Steps must be ≥ 0

    Expected Output:

    Goal Achieved Days: <count>
    Maximum Steps in Week: <value>

*/

import java.util.*;

class FitnessApp
{
    public void Record()
    {
        Scanner sobj = new Scanner(System.in);

        int days = 7;
        int Goal = 10000;

        System.out.println("Enter daily steps count : ");

        int Arr[] = new int[days];

        int i = 0;

        for(i = 0; i < days; i++)
        {
            System.out.print("Day "+(i+1)+" : ");
            Arr[i] = sobj.nextInt();

            if(Arr[i] < 0)
            {
                System.out.println("Invalid Input");
                return;
            }
        }

        int GoalAchieved = 0;
        int Max = -1;

        for(i = 0; i < days; i++)
        {
            if(Arr[i] >= Goal)
            {
                GoalAchieved++;
            }

            if(Max < Arr[i])
            {
                Max = Arr[i];
            }
        }

        System.out.println("Goal Achieved days : "+GoalAchieved);
        System.out.println("Maximum Steps in week : "+Max);
    }
}

class program03
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        FitnessApp hobj = new FitnessApp();

        hobj.Record();
    }
}