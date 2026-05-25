package firstJavaPackage;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 String str1="First program";
	       String str2="First program";
	       int x=100;
	       //First String 
	       System.out.println("String = "+str1); 
	       //Length of string
	       System.out.println("The length of string is: " +str1.length());  
	       //Convert to upper cases
	       System.out.println("String to upper case: " +str1.toUpperCase());
	       //Convert to lower cases
	       System.out.println("String to lower case: " +str1.toLowerCase());
	       //Comparing Str1 equals Str2, if yes =>TRUE(Check cases as well)
	       System.out.println("Equals: " +str1.equals(str2)); 
	     //Comparing Str1 equals Str2, if yes =>TRUE(ignore cases(Lower/upper))
	       System.out.println("Equal Ignore cases: " +str1.equalsIgnoreCase(str2));
	       //converting integer datatype to String Data type 
	       String s=String.valueOf(x);
	       System.out.println("Values of: " +s);
	       //Return character in the specified index
	       System.out.println("First Character is : "+str1.charAt(0));
	       System.out.println("8th Character is : "+str1.charAt(9));
	       
		}

	}