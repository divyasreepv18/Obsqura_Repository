package samplePrograms;

public class VotingEligibility {

    // Static method with boolean return type
    static boolean checkEligibility(int age) {

        if(age >= 18) {
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {

        boolean result = checkEligibility(16);

        if(result == true) {

            System.out.println("Candidate is eligible to vote");
        }
        else {

            System.out.println("Candidate is not eligible to vote");
        }
    }
}