package exceptionPrograms;

public class MultipleException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    try {
    	int a[]= new int[5]  ;
    	a[5]=10/0;
    	
    }
    catch(ArrayIndexOutOfBoundsException e) {
    	System.out.println("ArrayIndexOutOfBoundsException caught."+e);
    }
   /* catch(ArithmeticException m) {
    	System.out.println("ArithmeticException caught." +m);
    }*/
    
    catch(Exception m) {
    	System.out.println("Exception caught." +m);
    }
	}

}
