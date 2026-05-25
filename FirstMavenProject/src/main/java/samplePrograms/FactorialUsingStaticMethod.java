package samplePrograms;

public class FactorialUsingStaticMethod {


	static void findFactorial(int num) {
		 int fact=1;
		
		 for(int i=1;i<=num;i++) {
	     fact=fact*i;
		 }
		 System.out.println("Factorial of number:"+num+ " is "+fact);
	} 
	
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FactorialUsingStaticMethod.findFactorial(5);
	}

}
