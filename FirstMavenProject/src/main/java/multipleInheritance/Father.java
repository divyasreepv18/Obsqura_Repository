package multipleInheritance;

public class Father extends Grandfather {
	public void sub(int a, int b) {
		a=5;
		b=6;
		System.out.println("Inside intermediate class");
		int c=a-b;
		System.out.println("Difference="+c);
	}
}