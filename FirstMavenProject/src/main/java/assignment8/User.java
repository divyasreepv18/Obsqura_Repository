package assignment8;

class User {

    public static void main(String[] args) {

        Bank b = new Bank();

        int pin = 1234;          // User PIN
        double balance = 10000;  // Account Balance
        double amount = 300000;    // Withdrawal Amount
        /*It cannot be accessed directly from the User class.
        Access is provided through methods like setPin() and validatePin().*/
        b.setPin(pin);

        b.withdraw(balance, amount);
    }
}