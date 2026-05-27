package SuperKeyword;

public class MethodChild extends MethodParent{
	public void getValues(int age ,String name) {
		
		//2.invoke immediate parent class method
		super.getValues(30,"Divya");
		System.out.println("Inside the Child class : ");
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodChild obj= new MethodChild();
		obj.getValues(25, "Arun");
	}

}
