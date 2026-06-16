package assignment8;

class OffSeason {

    void discount(double amount) {
        double discount = amount * 15 / 100;
        double finalAmount = amount - discount;

        System.out.println("Off Season Discount (15%) = " + discount);
        System.out.println("Amount to Pay = " + finalAmount);
    }
}