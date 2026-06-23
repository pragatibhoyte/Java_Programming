import java.util.*;

class Demo
{
    public float Addition(float fNo1, float fNo2)
        {
            float fSum = 0.0f;
            fSum = fNo1 + fNo2;
            return fSum;
        }
}

class program3
{
    public static void main(String A[])
    {
        float fValue1 = 0.0f, fValue2 = 0.0f;
        float fRet = 0.0f;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter first number : ");
        fValue1 = sobj.nextFloat();

        System.out.println("Enter second number : ");
        fValue2 = sobj.nextFloat();

        Demo dobj = new Demo();

        fRet = dobj.Addition(fValue1, fValue2);

        System.out.println("Addition is : "+fRet);
    }
}