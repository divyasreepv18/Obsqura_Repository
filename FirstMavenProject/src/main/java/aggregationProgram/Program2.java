package aggregationProgram;

public class Program2 {
    int c; 
    int d;
    Program1 obj;//Aggregation
    
    public Program2(int c, int d, Program1 obj) {
    	this.c=c;
    	this.d=d;
    	this.obj=obj;
    }
    
    public void display() {
    	System.out.println("c : "+c);
    	System.out.println("d : "+d);
    	System.out.println("a : "+obj.a);
    	System.out.println("b : "+obj.b);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Program1 obj1=new Program1(1,2);
		Program2 obj2=new Program2(5,6, obj1);
		obj2.display();
		

	}

}
