package vn.techmaster;

public class allPlayers {
    private int number;
    private String name;
    private Position Position;



    public enum Position{
        GK,DF,MF,FW
    }

    public String getName() {
        return name;
    }

    public int getNumer() {
        return number;
    }

    public Position getPosition() {
        return Position;
    }

    public allPlayers(int number, String name, allPlayers.Position position) {
        this.number = number;
        this.name = name;
        Position = position;
    }

    @Override
    public String toString() {
        return "allPlayers{" +
                "numer=" + number +
                ", name='" + name + '\'' +
                ", Position=" + Position +
                '}';
    }
}
