package hierarchicalInheritance;

public class Daughter extends Son {
	public void daughterDetails(String name,int age) {
		System.out.println("Inside Child class 2");
		System.out.println("Daughter name:"+name);
	
		System.out.println("Daughter age:"+age);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Daughter obj2= new Daughter();
          obj2.fathersName("Vijayakumar");
          obj2.daughterDetails("Aradhya",30);
	}

}
