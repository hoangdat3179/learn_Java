package vn.techmaster;

public enum Type implements java.lang.reflect.Type {
    Waiter("Phục vụ"),

    Kitchen("Đầu bếp");

    private String value;

    Type(String value) {

        this.value = value;
    }
    public String getValue() {

        return value;
    }

}
