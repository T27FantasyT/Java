package model;

public enum Type {
    FASHION("Thời trang"),
    FOOD("Thực phẩm"),
    HOUSEWARES("Đồ gia dụng");
    String value;

    Type(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}

