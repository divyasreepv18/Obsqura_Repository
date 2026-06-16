package assignment8;

class OnSeason extends OffSeason {

    @Override
    void discount(double amount) {
        double discount = amount * 40 / 100;
        double finalAmount = amount - discount;

        System.out.println("On Season Discount (40%) = " + discount);
        System.out.println("Amount to Pay = " + finalAmount);
    }

    public static void main(String[] args) {

        double amount = 10000;

        OffSeason off = new OffSeason();
        off.discount(amount);

        System.out.println();

        OnSeason on = new OnSeason();
        on.discount(amount);
    }
}