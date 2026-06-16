package assignment7;
public class AverageAndArea {
	//METHOD OVERLOADING
		//Average of int ,float
	public void average(int a, int b, int c) {
        double avg = (a + b + c) / 3.0;
        System.out.println("Average of Integers = " + avg);
    }
	public void average(float a, float b, float c) {
        float avg = (a + b + c) / 3;
        System.out.println("Average of Floats = " + avg);
    }	
	//Area of Square,Rectangle,Circle
	public void area(int side) {
	        System.out.println("Area of Square = " + (side * side));
	    }
	public void area(int length, int breadth) {
	        System.out.println("Area of Rectangle = " + (length * breadth));
	    }
	public void area(double radius) {
	        System.out.println("Area of Circle = " + (3.14 * radius * radius));
	    }
    public static void main(String[] args) {
    	AverageAndArea obj = new AverageAndArea();

        obj.average(10, 20, 30);
        obj.average(10.5f, 20.5f, 30.5f);
        obj.area(10);
        obj.area(10,5);
        obj.area(7.0);
    }
}
