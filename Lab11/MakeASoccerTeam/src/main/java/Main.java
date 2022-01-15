import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Team team = new Team();
        ArrayList<Player> newTeam = new ArrayList<>();
        team.getAllPlay(newTeam);
        ArrayList<Player> chooseTeam = team.buildTeam(4,4,2,newTeam);
        team.show(chooseTeam);
    }
}
