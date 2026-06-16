package assignment9;

class Contractor extends Employee {
    int workingHours;

    Contractor(String name, double paymentPerHour, int workingHours) {
        super(name, paymentPerHour);
        this.workingHours = workingHours;
    }

    @Override
    double calculateSalary() {
        return paymentPerHour * workingHours;
    }
}
