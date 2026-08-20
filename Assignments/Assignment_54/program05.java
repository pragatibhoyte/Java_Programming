import java.util.*;

class program05
{
    public String BatteryWarnings(int Battery)
    {
        if(Battery < 0 || Battery > 100)
        {
            return "Invalid Input";
        }

        if(Battery <= 5)
        {
            return "Critical";
        }
        if(Battery <= 15)
        {
            return "Low";
        }
        else
        {
            return "Normal";
        }
    }

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        program05 pobj = new program05();

        System.out.println("Enter Battery Percentage : ");
        int Battery = sobj.nextInt();

        String sRet = pobj.BatteryWarnings(Battery);

        System.out.println("Battery Percentage : "+Battery);
        System.out.println(sRet);
    }
}