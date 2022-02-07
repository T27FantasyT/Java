public enum State {
    COMPLETE("Hoàn thành"),
    INCOMPLETE("Chưa hoàn thành");

    private String value;

    State(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
