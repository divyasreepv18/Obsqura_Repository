package exceptionPrograms;

public class ExceptionThrows {

	public static void main(String[] args) throws VotingException {
		// TODO Auto-generated method stub
        int age=12;
        if(age>=18) {
        	System.out.println("Eligibile for voting.");
        }
        else {
        	throw new VotingException("Not Eligible.");
        }
	}

}
