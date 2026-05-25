package firstJavaPackage;

public class PersonalDetailsStaticMethod {
	//static variables
	static int age;
	static String name;
	
	//Static method to set name and age values
static void setDetails(int a, String n) {
	//parameter values assigned to static variables
	age=a;
	name=n;
	
}
//Static method to get name and age values
static void getdDetails() {
//parameter values assigned to static variables
System.out.println("Details:");
System.out.println("Age  : "+age);
System.out.println("Name : "+name);

}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		setDetails(30,"Divyasree");
		getdDetails();
		

	}

}
