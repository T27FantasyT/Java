package model;

public enum ApproveState {
    APPROVED("Đã phê duyệt"),
    NOT_APPROVE_YET("Chưa phê duyệt"),
    REJECTED("Từ chối");
    private final String value;

    ApproveState(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
