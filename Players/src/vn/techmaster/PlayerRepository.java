package vn.techmaster;

import java.util.ArrayList;
import java.util.List;

public class PlayerRepository {
    public List<Player> allPlayers;

    public PlayerRepository() {
            allPlayers = new ArrayList<>();
            allPlayers.add(new Player(23, "Nguyễn Văn Toản", Position.GK));
            allPlayers.add(new Player(1, "Quan Văn Chuẩn", Position.GK));
            allPlayers.add(new Player(12, "Trịnh Xuân Hoàng", Position.GK));

            allPlayers.add(new Player(2, "Đặng Văn Tới", Position.DF));
            allPlayers.add(new Player(3, "Liễu Quang Vinh", Position.DF));
            allPlayers.add(new Player(4, "Nguyễn Thanh Bình", Position.DF));
            allPlayers.add(new Player(5, "Bùi Hoàng Việt Anh", Position.DF));
            allPlayers.add(new Player(14, "Trần Văn Công", Position.DF));
            allPlayers.add(new Player(15, "Lê Văn Xuân", Position.DF));
            allPlayers.add(new Player(18, "Mai Sỹ Hoàng", Position.DF));

            allPlayers.add(new Player(6, "Nguyễn Trọng Long", Position.MF));
            allPlayers.add(new Player(8, "Nguyễn Hai Long", Position.MF));
            allPlayers.add(new Player(10, "Lý Công Hoàng Anh ", Position.MF));
            allPlayers.add(new Player(11, "Trần Bảo Toàn", Position.MF));
            allPlayers.add(new Player(13, "Nguyễn Hữu Thắng", Position.MF));
            allPlayers.add(new Player(19, "Lê Văn Đô", Position.MF));
            allPlayers.add(new Player(20, "Mai Xuân Quyết", Position.MF));
            allPlayers.add(new Player(21, "Nguyễn Văn Việt", Position.MF));

            allPlayers.add(new Player(7, "Trần Văn Đạt", Position.FW));
            allPlayers.add(new Player(9, "Lê Xuân Tú", Position.FW));
            allPlayers.add(new Player(16, "Hồ Thanh Minh", Position.FW));
            allPlayers.add(new Player(18, "Nhâm Mạnh Dũng", Position.FW));
            allPlayers.add(new Player(22, "Nguyễn Trần Việt Cường", Position.FW));

    }
}
