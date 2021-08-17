package java102.adventureTime;


public class River extends BattleLoc{
    public River(Player player) {
        super(player, "River", 5, new Bear(), "water",2);
    }
    @Override
    public String prize(){
        return " ** Prize is Water **";
    }
}
