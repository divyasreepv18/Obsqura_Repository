package firstJavaPackage;

public class FactorialUsingStaticMethod {

	static int num=6;
	static int fact=1;

static void factorialMethod() {
	int number=num;
	int factorial= fact;
	 {
	        for(int i = 1; i <= num; i++)
	        {
	            fact = fact * i;
	        }
	    }
	
}
// another static method
static void display()
{
    System.out.println("The factorial of given number: " + num+ " is "+fact);
   // System.out.println("Factorial is : " + fact);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		factorialMethod();
		display();
		
	}

}
