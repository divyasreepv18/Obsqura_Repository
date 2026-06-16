package samplePrograms;

public class thisPogram {
	//Instance variable
	//int age=30;
   // String name="Divyasree";
	int age;
	String name;
     public void display(int age, String name) {
    	//System.out.println("Print the details using this");
    	// System.out.println("Name :"+this.name);
    	// System.out.println("Age :"+this.age);
    	 this.age=age;
    	 this.name= name;
    	 
     }
     public void show() {
    	 System.out.println("Print the details using this");
    	 System.out.println("Name :"+name);
    	 System.out.println("Age :"+age);
    	 
    	 
     }
     
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		thisPogram s= new thisPogram();
		s.display(30,"Divyasree");
		s.show();
		
        
	}

}
