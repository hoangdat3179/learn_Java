package vn.techmaster;

import java.time.LocalDate;
import java.util.ArrayList;

public class GuestRepo {
    public ArrayList<Guest> getData(){
        ArrayList<Guest> listCustomer = new ArrayList<>();
        listCustomer.add(new Guest((listCustomer.size()+1),"Triều", LocalDate.of(2000,6,5),Gender.NAM,"Hà Nội","0983746172","trieu1213@gmail.com"));
        listCustomer.add(new Guest((listCustomer.size()+1),"Trang", LocalDate.of(1991,2,5),Gender.NU,"Hồ Chí Minh","0984736281","trang21412@gmail.com"));
        listCustomer.add(new Guest((listCustomer.size()+1),"Thu", LocalDate.of(1994,5,12),Gender.NU,"Hồ Chí Minh","0947362812","thu293219@gmail.com"));
        listCustomer.add(new Guest((listCustomer.size()+1),"V.Anh", LocalDate.of(1994,3,21),Gender.NAM,"Hà Nội","0937462718","vietanh213@gmail.com"));
        listCustomer.add(new Guest((listCustomer.size()+1),"Tùng", LocalDate.of(1990,4,22),Gender.NAM,"Vĩnh Phúc","0938472617","tung123@gmail.com"));
        listCustomer.add(new Guest((listCustomer.size()+1),"Vân", LocalDate.of(1989,2,17),Gender.NU,"Hà Nội","0937462718","van231@gmail.com"));
        listCustomer.add(new Guest((listCustomer.size()+1),"Phương", LocalDate.of(1998,7,30),Gender.NU,"Hà Nội","0947362718","phuong123@gmail.com"));
        return listCustomer;
    }
}
