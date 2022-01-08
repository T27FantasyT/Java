package model;

public enum Type {
    HOUSEWARES("Đồ gia dụng"),
    FOOD("Thực phẩm"),
    FASHION("Thời trang");

    String value;

    Type(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
