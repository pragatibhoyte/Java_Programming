import java.util.*;

class Warehouse
{
    public void CheckStock(int Stock, int Quantity)
    {
        if(Stock < 0)
        {
            System.out.println("Stock cannot be negative");
            return;
        }

        if(Quantity <= 0)
        {
            System.out.println("Requested quantity must be greater than zero");
            return;
        }

        if(Stock < Quantity)
        {
            System.out.println("Order Failed : Insufficient stock");
        }
        else
        {
            Stock = Stock - Quantity;
            System.out.println("Order Processed Successfully");
            System.out.println("Remaining Stock : "+Stock);

            if(Stock < 5)
            {
                System.out.println("Low Stock Alert!");
            }
        }
    }
}

class program03
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Current stock : ");
        int stock = sobj.nextInt();

        System.out.println("Enter Requested quantity : ");
        int quantity = sobj.nextInt();

        Warehouse bobj = new Warehouse();

        bobj.CheckStock(stock, quantity);
    }
}