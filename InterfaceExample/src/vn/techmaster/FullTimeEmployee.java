package vn.techmaster;

public class FullTimeEmployee extends Employee{
    public FullTimeEmployee(String name, int paymentPerHour) {
        super(name, paymentPerHour);
    }

    @Override
    public int calculatorSalary() {
        return 8*getPaymentPerHour();
    }

    @Override
    public String getName() {
        return getName();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
