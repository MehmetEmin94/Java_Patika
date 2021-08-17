package java102.adventureTime;

public class Inventory {
    private Weapon weapon;
    private Armor armor;
    private int food;
    private int wood;
    private int water;


    public Inventory() {
        this.weapon=new Weapon("fist",-1,0,0);
        this.armor=new Armor(-1,"clothes",0,0);

    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public int getWood() {
        return wood;
    }

    public void setWood(int wood) {
        this.wood = wood;
    }

    public int getWater() {
        return water;
    }

    public void setWater(int water) {
        this.water = water;
    }

    public Armor getArmor() {
        return armor;
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
}
