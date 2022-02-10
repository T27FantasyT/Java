package model;

public enum State {
    COMPLETE("Hoàn thành"),
    INCOMPLETE("Chưa hoàn thành");

    private final String value;

    State(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
