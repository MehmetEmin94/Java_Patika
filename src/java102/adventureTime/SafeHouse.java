package java102.adventureTime;

public class SafeHouse extends NormalLoc{
    public SafeHouse(Player player) {
        super(player, "Safe House",1);
    }

    @Override
    public boolean onLocation(){
        System.out.println("You are in safe house.");
        System.out.println("Your health is getting full.");
        this.getPlayer().setHealth(this.getPlayer().getBaseHealth());
        if(this.getPlayer().getInventory().getFood()==1&&this.getPlayer().getInventory().getWood()==1&&this.getPlayer().getInventory().getWater()==1){
            return false;
        }
        return true;
    }
}
