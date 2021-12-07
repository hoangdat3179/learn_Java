package vn.techmaster;

public class SchoolBook extends Library{
    private int page;
    private String tinhtrang;
    private int soluongmuon;

    public SchoolBook(String name, String nxb, int year, int number, int page, String tinhtrang, int soluongmuon) {
        super(name,nxb,year,number,page,tinhtrang,soluongmuon);

    }

    public static void add(SchoolBook newBook) {
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public String getTinhtrang() {
        return tinhtrang;
    }

    public void setTinhtrang(String tinhtrang) {
        this.tinhtrang = tinhtrang;
    }

    public int getSoluongmuon() {
        return soluongmuon;
    }

    public void setSoluongmuon(int soluongmuon) {
        this.soluongmuon = soluongmuon;
    }

    @Override
    public String toString() {
        return super.toString() + " - " + page  + " - " + tinhtrang + " - " + soluongmuon;
    }
}
