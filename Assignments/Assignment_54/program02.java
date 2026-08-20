import java.util.*;

class program02
{
    public void ScholarshipApproval(int Marks, int Attendence, int Income)
    {
        if(Marks < 0 || Marks > 100 || Attendence < 0 || Attendence > 100)
        {
            System.out.println("Marks and Attendence must be 0-100");
            return;
        }

        if(Income < 0)
        {
            System.out.println("Income cannot be negative");
            return;
        }

        if(Marks < 80)
        {
            System.out.println("Scholarship Rejected : Marks must be >= 80");
        }
        else if(Attendence < 75)
        {
            System.out.println("Scholarship Rejected : Attendence must be >= 75");
        }
        else if(Income > 300000)
        {
            System.out.println("Scholarship Rejected : Income must be <= 300000");
        }
        else
        {
            System.out.println("Scholarship Approved");
        }
    }

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        program02 pobj = new program02();

        System.out.println("Enter Marks percent (integer) : ");
        int Marks = sobj.nextInt();

        System.out.println("Enter Attendence percent (integer) : ");
        int Attendence = sobj.nextInt();

        System.out.println("Enter Family income (integer) : ");
        int Income = sobj.nextInt();

        pobj.ScholarshipApproval(Marks, Attendence, Income);
    }
}