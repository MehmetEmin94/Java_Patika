package java102.adventureTime;


public class Cave extends BattleLoc{
    public Cave(Player player) {
        super(player, "Cave", 3, new Zombie(), "food",3);
    }

    @Override
    public String prize(){
        return " ** Prize is Food **";
    }
}
