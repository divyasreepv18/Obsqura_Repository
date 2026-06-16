package assignment9;

public class Main {
    public static void main(String[] args) {

        HDFC customer = new HDFC();

        double depositAmount = 10000;
        int duration = 2; // years

        double maturity =
                customer.recurringDeposit(depositAmount, duration);

        System.out.println("Deposit Amount : " + depositAmount);
        System.out.println("Duration       : " + duration + " years");
        System.out.println("Maturity Amount: " + maturity);
    }
}