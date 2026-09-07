/*

User enters usage: calls (min), data (GB), SMS (count). App suggests the cheapest plan among 4 plans.

Input: mins, gb, sms

Output: recommendedPlan, totalCost

Twist: If usage exceeds plan limits, add per-unit extra.

*/

import java.util.*;

class RechargeApp
{
    public float SuggestPlan(int CallMins, float data, int smsCount)
    {
        // Plan 1 limits
        int callLimit1 = 100;
        float datalimit1 = 1.0f;
        int smslimit1 = 100;

        // Plan 2 limits
        int callLimit2 = 100;
        float datalimit2 = 1.5f;
        int smslimit2 = 150;

        // Plan 3 limits
        int callLimit3 = 200;
        float datalimit3 = 2.0f;
        int smslimit3 = 200;

        // Plan 4 limits
        int callLimit4 = 300;
        float datalimit4 = 3.5f;
        int smslimit4 = 300;

        float Plan1 = 300 + Math.max(0, CallMins-callLimit1)*1 + Math.max(0, data-datalimit1)*150 + Math.max(0, smsCount - smslimit1)*1;

        float Plan2 = 350 + Math.max(0, CallMins-callLimit2)*1 + Math.max(0, data-datalimit2)*150 + Math.max(0, smsCount - smslimit2)*1;

        float Plan3 = 400 + Math.max(0, CallMins-callLimit3)*1 + Math.max(0, data-datalimit3)*150 + Math.max(0, smsCount - smslimit3)*1;

        float Plan4 = 500 + Math.max(0, CallMins-callLimit4)*1 + Math.max(0, data-datalimit4)*150 + Math.max(0, smsCount - smslimit4)*1;

        float minimum = Math.min(Math.min(Plan1, Plan2), Math.min(Plan3, Plan4));

        if(minimum == Plan1)
        {
            System.out.println("Recommended Plan : Plan 1");
        }
        else if(minimum == Plan2)
        {
            System.out.println("Recommended Plan : Plan 2");
        }
        else if(minimum == Plan3)
        {
            System.out.println("Recommended Plan : Plan 3");
        }
        else
        {
            System.out.println("Recommended Plan : Plan 4");
        }

        return minimum;
    }
}

class program03
{
    public static void main(String A[])
    {
        RechargeApp robj = new RechargeApp();

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter total calls (mins) : ");
        int iValue1 = sobj.nextInt();

        System.out.println("Enter data (GB) : ");
        float fValue = sobj.nextFloat();

        System.out.println("Enter SMS (count) : ");
        int iValue2 = sobj.nextInt();

        float fRet = robj.SuggestPlan(iValue1, fValue, iValue2);

        System.out.println("Cheapest recharge plan price is : "+ fRet + "Rs.");
    }
}

