package samplePrograms;

public class PalindromeUsingStaticMethod {

    // Method 1 : Reverse the number
    static int reverse(int num) {
        int rev = 0;
        while(num > 0) {
            int rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;
        }
        return rev;
    }
    // Method 2 : Check palindrome
    static void checkPalindrome(int num) {
        int reversedNumber = reverse(num);
        if(num == reversedNumber) {
            System.out.println(num + " is a Palindrome Number");
        }
        else {
            System.out.println(num + " is Not a Palindrome Number");
        }
    }
    public static void main(String[] args) {

        checkPalindrome(121);

    }
}