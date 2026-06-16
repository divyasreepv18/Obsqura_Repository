package samplePrograms;

public class ExamStringBufferMethods {

	public static void main(String[] args) {
		//StringBuffer Methods
		System.out.println("....String Buffer methods....");
		StringBuffer sb= new StringBuffer("Hello");
		System.out.println("String : "+sb);
		//Length of the string
		System.out.println("String length : "+sb.length());
		
		//Method 1: append
		sb.append(" Divya");
		System.out.println("1.Append the word: " +sb);
		//method 2: insert
		sb.insert(5," Welcome");
		System.out.println("2.Insert the word: " +sb);
		//method 3: delete
		sb.delete(5,13);
		System.out.println("3.Delete the word: " +sb);
		//method 4: replace
		sb.replace(5, 11, " JAVA");
		System.out.println("4.replace the word: " +sb);
		//method 5: reverse
		System.out.println("5.reverse the word: "+sb.reverse());
				
	}

}
