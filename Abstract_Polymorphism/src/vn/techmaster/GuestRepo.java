package vn.techmaster;

import java.time.LocalDate;
import java.util.ArrayList;

public class GuestRepo {
    public ArrayList<Guest> listGuest;
    public GuestRepo() {
        listGuest = new ArrayList<>();
        listGuest.add(new Guest(1,"Nguyễn Văn Nam",LocalDate.of(1990,12,12),Sex.NAM,"Hà Nội","0947572837","fhasi@gmail.com"));
        listGuest.add(new Guest(2 ,"Nguyễn Thị Nữ",LocalDate.of(1990,05,12), Sex.NU, "Hà Nội", "0984736281", "fhsdfgi@gmail.com"));
    }
}
