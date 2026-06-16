package assignment6;

public class Address {
	 String address = "Seattle, Washington";

	    void display(Student s) {

	        System.out.println("Student Name : " + s.name);
	        System.out.println("Roll Number  : " + s.rollNo);
	        System.out.println("Address      : " + address);
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Student s1 = new Student();

	        Address a1 = new Address();

	        a1.display(s1);
	}

}
