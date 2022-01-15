public class Player {
    private int number;
    private String fullName;
    private Position position;

    public Player(int number, String fullName, Position position) {
        this.number = number;
        this.fullName = fullName;
        this.position = position;
    }

    public int getNumber() {
        return number;
    }

    public String getFullName() {
        return fullName;
    }

    public Position getPosition() {
        return position;
    }

    @Override
    public String toString() {
        return "Player{" +
                "number=" + number +
                ", fullName='" + fullName + '\'' +
                ", position=" + position +
                '}';
    }
}
