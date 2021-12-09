package vn.techmaster;

public enum Sex {
        NAM("Nam"),
        NU("Nữ");

    private String value;

    Sex(String value) {

        this.value = value;
    }

    public String getValue() {

        return value;
    }
}

