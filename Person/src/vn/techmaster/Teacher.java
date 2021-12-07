package vn.techmaster;

import java.time.LocalDate;

public class Teacher extends Student{
        private String name;

    public Teacher(String name, LocalDate date, String address, double point, String name1) {
        super(name, date, address, point);
        this.name = name1;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return super.toString() + " - " + name;
    }
}
