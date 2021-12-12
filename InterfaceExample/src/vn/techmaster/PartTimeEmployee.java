package vn.techmaster;

public class PartTimeEmployee extends Employee{
    int workingHours;

    public PartTimeEmployee(String name, int paymentPerHour, int workingHours) {
        super(name, paymentPerHour);
        this.workingHours = workingHours;
    }


    @Override
    public int calculatorSalary() {
        return workingHours*getPaymentPerHour();
    }

    @Override
    public String getName() {
        return getName();
    }

    @Override
    public String toString() {
        return "PartTimeEmployee{" +
                "name='" + name + '\'' +
                ", paymentPerHour=" + paymentPerHour +
                ", workingHours=" + workingHours +
                '}';
    }
}
