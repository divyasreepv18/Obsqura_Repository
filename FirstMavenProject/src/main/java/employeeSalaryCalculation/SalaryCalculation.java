package employeeSalaryCalculation;

class SalaryCalculation extends Employee {

    double hra, pf;

    void calculate() {

        hra = basicPay * 0.05;
        pf = basicPay * 0.20;
    }
}