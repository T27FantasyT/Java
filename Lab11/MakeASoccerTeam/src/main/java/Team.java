import java.util.ArrayList;
import java.util.Random;

public class Team {
    public ArrayList<Player> getAllPlay(ArrayList<Player> players) {
        players.add(new Player(1, "Nguyễn Văn Hoàng", Position.GK));
        players.add(new Player(23, "Bùi Tấn Trường", Position.GK));
        players.add(new Player(50, "Trần Nguyên Mạnh", Position.GK));
        players.add(new Player(3, "Quế Ngọc Hải", Position.DF));
        players.add(new Player(2, "Đỗ Duy Mạnh", Position.DF));
        players.add(new Player(5, "Trần Đình Trọng", Position.DF));
        players.add(new Player(7, "Nguyền Phong Hồng Duy", Position.DF));
        players.add(new Player(17, "Vũ Văn Thanh", Position.DF));
        players.add(new Player(16, "Nguyễn Thanh Bình", Position.DF));
        players.add(new Player(19, "Nguyễn Quang Hải", Position.MF));
        players.add(new Player(11, "Nguyễn Tuấn Anh", Position.MF));
        players.add(new Player(10, "Nguyễn Công Phượng", Position.MF));
        players.add(new Player(6, "Lương Xuân Trường", Position.MF));
        players.add(new Player(14, "Phan Văn Đức", Position.MF));
        players.add(new Player(18, "Phạm Đức Huy", Position.MF));
        players.add(new Player(9, "Nguyễn Văn Toàn", Position.FW));
        players.add(new Player(20, "Hà Đức Chinh", Position.FW));
        players.add(new Player(22, "Nguyễn Tiến Linh", Position.FW));
        players.add(new Player(26, "Trần Văn Đạt", Position.FW));
        return players;
    }
    public void show(ArrayList<Player> players){
        for(Player p : players){
            System.out.println(p);
        }
    }

    public ArrayList<Player> buildTeam(int df, int mf, int fw, ArrayList<Player> allPlayer) {
        ArrayList<Player> choiceTeam = new ArrayList<>();
        int teamNumber = allPlayer.size();
        Random random = new Random();
        int gkNumber = 0;
        int dfNumber = 0;
        int mfNumber = 0;
        int fwNumber = 0;
        while (gkNumber < 1) {
            int gkRandom = random.nextInt(teamNumber);
            if (allPlayer.get(gkRandom).getPosition() == Position.GK) {
                gkNumber++;
                choiceTeam.add(allPlayer.get(gkRandom));
            }
        }
        while(dfNumber < df){
            int dfRandom = random.nextInt(teamNumber);
            if(allPlayer.get(dfRandom).getPosition()==Position.DF){
                if(!choiceTeam.contains(allPlayer.get(dfRandom))){
                    dfNumber++;
                    choiceTeam.add(allPlayer.get(dfRandom));
                }

            }
        }

        while(mfNumber <mf){
            int mfRandom = random.nextInt(teamNumber);
            if(allPlayer.get(mfRandom).getPosition()==Position.MF){
                if(!choiceTeam.contains(allPlayer.get(mfRandom))){
                    mfNumber++;
                    choiceTeam.add(allPlayer.get(mfRandom));
                }
            }
        }
        while(fwNumber<fw){
            int fwRandom = random.nextInt(teamNumber);
            if (allPlayer.get(fwRandom).getPosition() == Position.FW) {
                if(!choiceTeam.contains(allPlayer.get(fwRandom))){
                    fwNumber++;
                    choiceTeam.add(allPlayer.get(fwRandom));
                }
            }
        }

        return choiceTeam;
    }


}
