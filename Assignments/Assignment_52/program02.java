import java.util.*;

class Bank
{
    private int Balance;
    private int Amount;

    public Bank(int A, int B)
    {
        this.Balance = A;
        this.Amount = B;
    }
    
    public void Withdraw()
    {
        if(Balance < 0 || Amount <= 0)
        {
            System.out.println("Invalid Input");
            return;
        }

        if(Amount % 100 != 0)
        {
            System.out.println("Transaction Failed : Withdrawal amount must be multiple of Rs.100");
            return;
        }

        if(Amount > 25000)
        {
            System.out.println("Transaction Failed : Maximum withdrawal per transaction is Rs.25000");
            return;
        }

        if(Balance-Amount < 1000)
        {
            System.out.println("Transaction Failed : After withdrawal, balance must remain at least Rs.1000");
            return;
        }

        Balance = Balance - Amount;

        System.out.println("Transaction Successful.");
        System.out.println("Remaining Balance : "+Balance);
    }
}

class program02
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int iRet = 0;

        System.out.println("Enter current balance : ");
        int iBal = sobj.nextInt();

        System.out.println("Enter requested withdrawal amount : ");
        int iAmt = sobj.nextInt();

        Bank bobj = new Bank(iBal, iAmt);

        bobj.Withdraw();
    }
}