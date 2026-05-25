package multipleInheritance;

public class Son extends Father {
	
	public void div(int a, int b) {
		a=10;
		b=2;
		System.out.println("inside child class");
		int c=a/b;
		System.out.println("the division values " +c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Son obj = new Son();
        obj.add(5,6);
        obj.div(10,2);
        obj.sub(10, 5);
        
	}

}
