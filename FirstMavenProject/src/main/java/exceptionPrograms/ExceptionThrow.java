package exceptionPrograms;

public class ExceptionThrow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age=16;
		System.out.println("Voting Eligibility");
		if(age>=18) {
			System.out.println("Qualified");
		}
		else {
			throw new ArithmeticException("Not Qualified");
		}

	}

}
