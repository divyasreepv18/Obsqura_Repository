package assignment9;

class HDFC implements RBI {

    @Override
    public double recurringDeposit(double amount, int duration) {

        double maturityAmount =
                amount + (amount * interestrate * duration) / 100;

        return maturityAmount;
    }
}