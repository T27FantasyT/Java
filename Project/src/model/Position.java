package model;

public enum Position {
    PROJECT_MANAGER("Project Manager"),
    ADMIN("Admin"),
    STAFF("Staff");
    private String value;

    Position(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
