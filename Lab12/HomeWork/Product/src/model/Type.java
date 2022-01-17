package model;

public enum Type {
    Mobile("Điện thoại"),
    Laptop("Laptop"),
    Apple("Apple"),
    Accessory("Phụ kiện");

    public String value;

    Type(String value) {
        this.value = value;
    }
}
