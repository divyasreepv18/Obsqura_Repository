package hierarchicalInheritance;

public class Son extends Father {

	public void sonDetails(String name,int age) {
		System.out.println("Inside Child class 1");
		System.out.println("Son name:"+name);
	
		System.out.println("Son age:"+age);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Son obj =new Son();
        obj.fathersName("Vijayakumar");
        obj.sonDetails("Arun", 35);
	}

}
