import java.util.*;

class Bank
{
    public void LoanApproval(int Age, int Income, int CreditScore, String loan)
    {
        if(Age < 0 || Income < 0 || CreditScore < 0)
        {
            System.out.println("Age / Income / Credit score must be non negative");
            return;
        }

        loan = loan.toLowerCase();

        if(loan.equals("no") == false && loan.equals("yes") == false)
        {
            System.out.println("Yes/ No must be valid");
            return;
        }

        if(Age < 21 || Age > 60)
        {
            System.out.println("Loan Rejected : Age should lie within 21 to 60");
        }
        else if(Income < 25000)
        {
            System.out.println("Loan Rejected : Monthly income should be at least Rs.25000");
        }
        else if(CreditScore < 700)
        {
            System.out.println("Loan Rejected : Credit Score should be at least 700");
        }
        else if(loan.equals("yes"))
        {
            System.out.println("Loan Rejected : Must not have an existing unpaid loan");
        }
        else
        {
            System.out.println("Loan Approved");
        }
    }
}

class program02
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Age : ");
        int Age = sobj.nextInt();

        System.out.println("Enter Monthly income : ");
        int income = sobj.nextInt();

        System.out.println("Enter Credit Score : ");
        int CreditScore = sobj.nextInt();

        System.out.println("Is there any existing unpaid loan : ");
        String loan = sobj.next();

        Bank bobj = new Bank();

        bobj.LoanApproval(Age, income, CreditScore, loan);
    }
}