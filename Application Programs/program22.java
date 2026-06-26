import java.util.*;

class program22
{   
    public static void main(String A[])
    {
        String sName;
        int iAge= 0;
        float fMarks = 0.0f;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter your Name : ");
        sName = sobj.nextLine();

        System.out.println("Enter your Age : ");
        iAge = sobj.nextInt();

        System.out.println("Enter your Marks : ");
        fMarks = sobj.nextFloat();

        System.out.println("Your Name is : "+sName);
        System.out.println("Your Age is : "+iAge);
        System.out.println("Your Marks is : "+fMarks);
    }
}