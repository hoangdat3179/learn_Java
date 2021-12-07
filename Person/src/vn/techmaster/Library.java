package vn.techmaster;

public class Library {
    private String id;
    private String name;
    private String nxb;
    private int year;
    private int number;


    public Library(String id, String name, String nxb, int year, int number) {
        this.name = name;
        this.nxb = nxb;
        this.year = year;
        this.number = number;
    }

    public Library(String name, String nxb, int year, int number, int page, String tinhtrang, int soluongmuon) {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNxb() {
        return nxb;
    }

    public void setNxb(String nxb) {
        this.nxb = nxb;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return id + " - " + name + " - " + nxb  + " - " + year  + " - " + number;
    }
}
