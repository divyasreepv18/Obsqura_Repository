package assignment9;

abstract class Employee {
    String name;
    double paymentPerHour;

    Employee(String name, double paymentPerHour) {
        this.name = name;
        this.paymentPerHour = paymentPerHour;
    }

    abstract double calculateSalary();
}

