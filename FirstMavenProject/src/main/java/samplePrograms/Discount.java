package samplePrograms;
public class Discount {
    // Method 1 : Calculate total amount
    static int calculateTotal(int item1, int item2, int item3) {
        int total = item1 + item2 + item3;
        return total;
    }
    // Method 2 : Check discount
    static double checkDiscount(int totalAmount) {
        double finalAmount;
        if(totalAmount > 5000) {
            double discount = totalAmount * 0.20;
            finalAmount = totalAmount - discount;
        }
        else {
            finalAmount = totalAmount;
        }
        return finalAmount;
    }
    public static void main(String[] args) {
        // Get total amount
        int total = calculateTotal(2000, 2500, 1800);
        // Get final amount after discount
        double finalBill = checkDiscount(total);
        System.out.println("Total Amount : " + total);
        System.out.println("Final Amount : " + finalBill);
    }
}