package employeeSalaryCalculation;

class SalarySlip extends SalaryCalculation {

    double totalSalary;

    void display() {

        totalSalary = basicPay + hra - pf - deduction + bonus;

        System.out.println("------ Salary Slip ------");
        System.out.println("Employee name   : " + name);
        System.out.println("Basic Pay   : " + basicPay);
        System.out.println("Deduction   : " + deduction);
        System.out.println("HRA         : " + hra);
        System.out.println("PF          : " + pf);
        System.out.println("Bonus       : " + bonus);
        System.out.println("Total Salary: " + totalSalary);
    }

    public static void main(String[] args) {

        SalarySlip obj = new SalarySlip();

        obj.calculate();
        obj.display();
    }
}