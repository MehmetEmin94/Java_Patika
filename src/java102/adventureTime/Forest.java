package java102.adventureTime;


public class Forest extends BattleLoc{
    public Forest(Player player) {
        super(player, "Forest", 4, new Vampire(), "Wood",3);
    }
    @Override
    public String prize(){
        return " ** Prize is Wood **";
    }
}
