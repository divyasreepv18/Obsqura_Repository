package assignment7;

public class ReverseNumber {

    int number; // instance variable
    // Constructor 1: takes a number to reverse
    ReverseNumber(int number) { // argument same name as instance variable
        this.number = number;
    }
    // Constructor 2: default (reverses 0)
    ReverseNumber() {
        this.number = 0;
    }
    int reverse() {
        int n = number;
        int reversed = 0;
        while (n != 0) {
            reversed = reversed * 10 + n % 10;
            n /= 10;
        }
        return reversed;
    }
    public static void main(String[] args) {
        // Main invokes only ONE constructor
        ReverseNumber obj = new ReverseNumber(12345);
        System.out.println("Original:  " + obj.number);
        System.out.println("Reversed:  " + obj.reverse());
    }
}