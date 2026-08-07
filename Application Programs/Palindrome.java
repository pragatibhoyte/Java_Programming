class Palindrome {

    int palindrome(int x)
    {
        int reverse = 0;
        int digit = 0;
        // boolean bFlag = false;

        while(x != 0)
        {
            digit = x % 10;
            reverse = (reverse * 10) + digit;
            x = x / 10;
        }
        
        // if(x == reverse)
        // {
        //     bFlag = true;
        // }

        return reverse;
    }
    
    public static void main(String[] args) {
        
        Palindrome pobj = new Palindrome();

        System.err.println(pobj.palindrome(121));
    }
}
