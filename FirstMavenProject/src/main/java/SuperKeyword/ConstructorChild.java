package SuperKeyword;

public class ConstructorChild extends ConstructorParent{
	public ConstructorChild(int age1, String name1) {
		//3. invoke immediate parent class constructor
		super(30,"Divya");
		System.out.println(" Inside the Child constructor :");
		System.out.println("Name : "+name1);
		System.out.println("Age  : "+age1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorChild obj= new ConstructorChild(35,"Arun");
	
	}

}
