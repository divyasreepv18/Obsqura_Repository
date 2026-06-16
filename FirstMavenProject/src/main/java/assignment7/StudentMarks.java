package assignment7;
public class StudentMarks {
int mark1,mark2,mark3;
String name;
	public StudentMarks(String name, int mark1, int mark2, int mark3) {
	        this.name = name;
	        this.mark1 = mark1;
	        this.mark2 = mark2;
	        this.mark3 = mark3;
	    }

	   public int totalMarks() {
		   int total;
		   total=mark1 + mark2 + mark3;
	        return total;
	    }
	    public void findGrade() {
	        int total1 = totalMarks();
	        double avg = total1 / 3.0;

	        if(avg >= 90)
	            System.out.println("Grade : A");
	        else if(avg >= 75)
	            System.out.println("Grade : B");
	        else if(avg >= 60)
	            System.out.println("Grade : C");
	        else if(avg >= 40)
	            System.out.println("Grade : D");
	        else
	            System.out.println("Grade : F");
	    }	   
	    }
	
