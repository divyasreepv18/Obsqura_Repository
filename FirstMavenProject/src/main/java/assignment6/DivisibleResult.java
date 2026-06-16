package assignment6;

public class DivisibleResult extends AdditionProgram {
	void check(int a, int b) {

        // using super keyword
        int result = super.add(a, b);

        System.out.println("Addition Result = " + result);

        if (result % 10 == 0) {
            System.out.println("Divisible by 10");
        } else {
            System.out.println("Not Divisible by 10");
        }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DivisibleResult obj = new DivisibleResult();

	        obj.check(20, 30);
	}

}
