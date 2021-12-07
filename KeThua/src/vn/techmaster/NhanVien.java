package vn.techmaster;

public class NhanVien {
    private int id;
    private String name;
    private int age;
    private int phoneNumber;
    private String email;
    private int salary;

    public NhanVien(int id, String name, int age, int phoneNumber, String email, int salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.salary = salary;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Nhân viên - " +
                "id: " + id +
                ", họ và tên: " + name +
                ", tuổi: " + age +
                ", số điện thoại: " + phoneNumber +
                ", email: " + email +
                ", lương cơ bản: " + salary;
    }
}
