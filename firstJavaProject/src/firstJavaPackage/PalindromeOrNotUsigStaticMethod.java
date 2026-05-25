package firstJavaPackage;

public class PalindromeOrNotUsigStaticMethod{

    // Method 1 - find reverse
    static int findReverse(int num)
    {
        int rem;
        int reverse = 0;

        while(num > 0)
        {
            rem = num % 10;
            reverse = (reverse * 10) + rem;
            num = num / 10;
        }

        return reverse;
    }

    // Method 2 - check palindrome or not
    static void checkPalindrome(int num)
    {
        int rev = findReverse(num);

        if(num == rev)
        {
            System.out.println(num + " is a Palindrome Number");
        }
        else
        {
            System.out.println(num + " is Not a Palindrome Number");
        }
    }

    // Main method
    public static void main(String[] args)
    {
        checkPalindrome(123);
    }
}