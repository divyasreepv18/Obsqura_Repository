package accessSpecifiers;

public class PrivateSpecifiers {
    //PRIVATE method 
	private void getValues(String name) {
		System.out.println("In Private access modifier: "+name);
	}
	public static void main(String[] args) {
		PrivateSpecifiers obj= new PrivateSpecifiers();
        obj.getValues("Daya");
	}

}
