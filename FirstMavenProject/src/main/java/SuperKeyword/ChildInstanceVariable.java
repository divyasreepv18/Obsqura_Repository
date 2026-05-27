package SuperKeyword;

public class ChildInstanceVariable extends ParentInstanceVariable {
	 String name="Arun";
     
     public void getValues() {
     //1. refer immediate parent class instance variable 
      System.out.println("Inside Parent class : "+super.name);
   	  System.out.println("Inside Child class : "+name);
    
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildInstanceVariable obj= new ChildInstanceVariable();
		obj.getValues();
	}

}
