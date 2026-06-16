package assignment9;

class FullTimeEmployee extends Employee {

    FullTimeEmployee(String name, double paymentPerHour) {
        super(name, paymentPerHour);
    }

    @Override
    double calculateSalary() {
        return paymentPerHour * 8; // fixed 8 hours
    }
}
