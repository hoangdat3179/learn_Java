package vn.techmaster;

import java.time.LocalDate;

public class Student extends Person{
    private double point;

    public Student(String name, LocalDate date, String address, double point) {
        super(name, date, address);
        this.point = point;
    }

    public double getPoint() {
        return point;
    }

    public void setPoint(double point) {
        this.point = point;
    }

    @Override
    public String toString() {
        return super.toString() + " - " + point ;
    }
}
