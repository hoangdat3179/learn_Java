package vn.techmaster;

public class Student extends Person{
    private int theoreticalPoint;
    private int practicePoint;

    public Student(int id, String name, int age, String address, int theoreticalPoint, int practicePoint) {
        super(id, name, age, address);
        this.theoreticalPoint = theoreticalPoint;
        this.practicePoint = practicePoint;
    }

    public int getPracticePoint() {
        return practicePoint;
    }

    public void setPracticePoint(int practicePoint) {
        this.practicePoint = practicePoint;
    }

    public int getTheoreticalPoint() {
        return theoreticalPoint;
    }

    public void setTheoreticalPoint(int theoreticalPoint) {
        this.theoreticalPoint = theoreticalPoint;
    }

    @Override
    public String toString() {
        return super.toString() + "," + "theoreticalPoint= " + theoreticalPoint +
                ", practicePoint= " + practicePoint;
    }
}
