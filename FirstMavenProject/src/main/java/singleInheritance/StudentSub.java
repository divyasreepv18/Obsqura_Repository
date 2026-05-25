package singleInheritance;

public class StudentSub extends StudentSuper {
public void markScore() {
	int a=50;
	int b=50;
	System.out.println("Mark1: "+a);
	System.out.println("Mark2: "+b);
	int total= a+b;
	System.out.println("Total score: "+total);
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Student details:");
		StudentSub obj= new StudentSub();
		obj.studentsDetails();
		obj.markScore();
	}

}
