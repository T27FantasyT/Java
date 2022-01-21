public enum Sex {
    MALE("Nam"),
    FEMALE("Nữ");
    private String value;

    Sex(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
