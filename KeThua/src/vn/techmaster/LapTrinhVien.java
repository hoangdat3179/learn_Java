package vn.techmaster;

public class LapTrinhVien extends NhanVien{
    private int overTime;

    public LapTrinhVien(int id, String name, int age, int phoneNumber, String email, int salary, int overTime) {
        super(id, name, age, phoneNumber, email, salary);
        this.overTime = overTime;
    }

    public int getOverTime() {
        return overTime;
    }

    public void setOverTime(int overTime) {
        this.overTime = overTime;
    }

    @Override
    public String toString() {
        return super.toString() + ", số giờ làm thêm: " + overTime + '\n';
    }
}
