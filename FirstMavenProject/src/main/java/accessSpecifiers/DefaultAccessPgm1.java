package accessSpecifiers;

public class DefaultAccessPgm1 {
    void getValues(int age,String name) {
    	System.out.println("Inside Default class : ");
    	System.out.println("Age : "+age);
    	System.out.println("Name : "+name);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DefaultAccessPgm1 obj=new DefaultAccessPgm1();
		obj.getValues(10, "Tom");

	}

}
