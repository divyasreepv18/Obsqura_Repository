package singleInheritance;

public class ChildInheritance extends ParentInheritance {
	public void show() {
		System.out.println("Child class ChildInheritance inherits base/Super class ParentInheritance features");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChildInheritance obj= new ChildInheritance();
		obj.add(4, 5);
		obj.show();
	}

}
