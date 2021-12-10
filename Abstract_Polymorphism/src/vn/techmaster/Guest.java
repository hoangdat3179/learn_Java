package vn.techmaster;

import java.time.LocalDate;

public class Guest {
    private int id;
    private String name;
    private LocalDate date;
    private Gender gender;
    private String nativeCountry;
    private String Number;
    private String email;

    public Guest(int id, String name, LocalDate date, Gender gender, String nativeCountry, String number, String email) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.gender = gender;
        this.nativeCountry = nativeCountry;
        Number = number;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Gender getGender() {
        return gender;
    }

    public Gender setGender(Gender gender) {
        return gender = gender;
    }

    public String getNativeCountry() {
        return nativeCountry;
    }

    public void setNativeCountry(String nativeCountry) {
        this.nativeCountry = nativeCountry;
    }

    public String getNumber() {
        return Number;
    }

    public void setNumber(String number) {
        Number = number;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    @Override
    public String toString() {
        return "Khách hàng " +
                "id= " + id +
                ", tên: " + name +
                ", ngày sinh: " + Util.formatDate(date) +
                ", Giới tính: " + gender.getValue() +
                ", quê quán:  " + nativeCountry +
                ", số điện thoại: " + Number +
                ", email: " + email;
    }
}
