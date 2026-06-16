package assignment8;

class Bank {
	/* Encapsulation: The pin variable is declared as private*/
    private int pin;
    void setPin(int pin) {
        this.pin = pin;
    }

    boolean validatePin() {
        return (pin == 1001 || pin == 1234 || pin == 1212);
    }

    void withdraw(double balance, double amount) {

        if (validatePin()) {

            if (amount <= balance) {
                balance = balance - amount;

                System.out.println("Withdrawal Successful");
                System.out.println("Withdraw Amount = " + amount);
                System.out.println("Remaining Balance = " + balance);
            } else {
                System.out.println("Insufficient Balance");
            }

        } else {
            System.out.println("Invalid PIN");
        }
    }
}