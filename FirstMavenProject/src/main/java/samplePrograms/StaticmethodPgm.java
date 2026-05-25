package samplePrograms;

public class StaticmethodPgm {
static String name;
static int age;
//Static method to set values	
	static void setValue(String n, int a) {
		name= n;
		age=a;
	}
	// Static method to display values
	static void getValue() {
		System.out.println("Details: "+name+ " and "+age);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticmethodPgm.setValue("Divya", 30);
		StaticmethodPgm.getValue();
	}

}
