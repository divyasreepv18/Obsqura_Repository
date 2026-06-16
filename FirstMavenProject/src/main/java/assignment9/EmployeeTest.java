package assignment9;

public class EmployeeTest {
    public static void main(String[] args) {

        Contractor contractor = new Contractor("John", 50, 6);
        FullTimeEmployee fullTime = new FullTimeEmployee("David", 50);

        System.out.println("Contractor Salary = $" +
                contractor.calculateSalary());

        System.out.println("Full Time Employee Salary = $" +
                fullTime.calculateSalary());
    }
}