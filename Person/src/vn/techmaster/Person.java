package vn.techmaster;

import java.time.LocalDate;

public class Person {
    private String name;
    private LocalDate date;
    private String address;

    public Person(String name, LocalDate date, String address) {
        this.name = name;
        this.date = date;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return name + " - " + date + " - " + address;
    }
}
