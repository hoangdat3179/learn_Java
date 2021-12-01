package vn.techmaster;

public class Student {
        public double id;
        public String ten;
        public double diemlythuyet;
        public double diemthuchanh;
        public String school;

        public double  diemTrungBinh(){
                double dtb = (diemlythuyet + diemthuchanh)/2;
                return dtb;
        }

        public Student(double id, String ten, double diemlythuyet, double diemthuchanh, String school) {
                this.id = id;
                this.ten = ten;
                this.diemlythuyet = diemlythuyet;
                this.diemthuchanh = diemthuchanh;
                this.school = school;
        }

        @Override
        public String toString() {
                return "id=" + id +
                        ", ten= " + ten + '\'' +
                        ", diemlythuyet= " + diemlythuyet +
                        ", diemthuchanh= " + diemthuchanh +
                        ", school= " + school + '\''
                         + "điểm trung bình: " + diemTrungBinh();
        }
}
