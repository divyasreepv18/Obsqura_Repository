package exceptionPrograms;

public class ExceptionPrg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
      try {
    		int a,b;
    		a=10;
    		b=0;
          float  rem= 10/0;
          System.out.println("The remainder is :"+rem);
      }
    /*  catch(ArithmeticException e) {
    	  System.out.println("Exception caught :"+e);
      }*/
      finally {
    	  System.out.println("Finally block executed.");
      }
	}

}
