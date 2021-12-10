package vn.techmaster;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Team {
    static final int GOALKEEPER = 1; //Thủ môn luôn luôn chỉ có một người
    public List<Player> selectedTeam;
    PlayerRepository repo = new PlayerRepository();


    public List<Player> buildTeam(int midfielder, int defender, int forward){
        selectedTeam = new ArrayList<>();
        Random general = new Random();
        int gateKeeperSize = 0;
        int defenderSize = 0;
        int midfieldSize = 0;
        int forwardSize = 0;
        //Chọn thủ môn
        while (gateKeeperSize < GOALKEEPER){//Vì GK chỉ có 1 người nên vòng lặp sẽ dừng lại khi tìm được 1 người
            int rdGoalKeeper = general.nextInt(22);
            if(repo.allPlayers.get(rdGoalKeeper).getPosition().equals(Position.GK)){
                selectedTeam.add(repo.allPlayers.get(rdGoalKeeper));
                gateKeeperSize++;
            }
        }

        //Chọn hậu vệ
        while(defenderSize < defender){
            int rdDefender = general.nextInt(22);
            if(repo.allPlayers.get(rdDefender).getPosition().equals(Position.DF)){
                if(!selectedTeam.contains(repo.allPlayers.get(rdDefender))){ //Nếu cầu thủ chưa có trong đội thì mới thêm vào danh sách
                    selectedTeam.add(repo.allPlayers.get(rdDefender));
                    defenderSize++;
                }
            }
        }

        //Chọn tiền vệ
        while(midfieldSize < midfielder){
            int rdMidfielder = general.nextInt(22);
            if(repo.allPlayers.get(rdMidfielder).getPosition().equals(Position.MF)){
                if(!selectedTeam.contains(repo.allPlayers.get(rdMidfielder))){
                    selectedTeam.add(repo.allPlayers.get(rdMidfielder));
                    midfieldSize++;
                }
            }
        }

        //Chọn tiền đạo
        while(forwardSize < forward){
            int rdForward = general.nextInt(22);
            if(repo.allPlayers.get(rdForward).getPosition().equals(Position.FW)){
                if(!selectedTeam.contains(repo.allPlayers.get(rdForward))){
                    selectedTeam.add(repo.allPlayers.get(rdForward));
                    forwardSize++;
                }
            }
        }

        return selectedTeam;
    }

    public void printList(){
        for (Player player: selectedTeam) {
            System.out.println(player);
        }
    }
}
