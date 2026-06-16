package abstration;

public class AbstractChild extends AbstrationParent{
	
	public void showDetails() {
		System.out.println("Inside the childs class methods");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractChild obj= new AbstractChild();
		obj.abstractMethod();
		obj.add();
		obj.showDetails();
	}

	@Override
	public void abstractMethod() {
		// TODO Auto-generated method stub
		System.out.println("Inside the childs class abstract methods");
	}

}
