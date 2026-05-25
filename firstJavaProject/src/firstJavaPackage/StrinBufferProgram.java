package firstJavaPackage;

public class StrinBufferProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       //StrinBuffer class is created
		StringBuffer sb= new StringBuffer("Divya sree");
		//Reversing the value of object
		sb.reverse();
		System.out.println(sb);
		//appending value
		StringBuffer sb1= new StringBuffer("Welcome");
		sb1.append(" Divyasree");
		System.out.println(sb1);
		//Insert is used to add values in the mentioned index
		StringBuffer sb2= new StringBuffer("Hello");
		sb2.insert(4,"AAA");
		System.out.println(sb2);
		
		//Deleting the string in the mentioned Begin index and end index
		StringBuffer sb3= new StringBuffer("ABCDEFG");
		sb3.delete(0, 3);
		System.out.println(sb3);
		StringBuffer sb4= new StringBuffer("abcdefgh");
		sb4.delete(2, 4);
		System.out.println(sb4);
		
		//REPLACE 
		StringBuffer sb5= new StringBuffer("abcdef");
		sb5.replace(1, 3,"xxxxx");
		System.out.println(sb5);

	}
	

}
