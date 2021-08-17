package java102.adventureTime;


import java.util.Arrays;
import java.util.Scanner;

public class Player {
    private Inventory inventory;
    private int damage;
    private int health;
    private int baseHealth;
    private int money;
    private String name;
    private String charName;
    private Scanner scan=new Scanner(System.in);

    public Player(String name) {
        this.name = name;
        this.inventory=new Inventory();
    }
    public void selectChar(){
        System.out.println("\n==============================");
        System.out.println("**** Characters ****"+"\n==============================");
        GameChar[] gameChars={new Samurai(),new Archer(),new Knight()};
        for (GameChar gameChar:gameChars) {
            System.out.println("Id : "+gameChar.getId()+" \tName : "+gameChar.getName()
                    +" \tDamage : "+gameChar.getDamage()+" \tHealth : "+
                    gameChar.getHealth() +" \tMoney : "+gameChar.getMoney());
        }
        System.out.print("=============================="+"\n**** Choose your character : ");
        int selected=scan.nextInt();
        while(selected<1||selected>3){
            System.out.print("Invalid value,try again : ");
            selected=scan.nextInt();
        }
        switch (selected){
            case 1:
                initPlayer(new Samurai());
                break;
            case 2:
                initPlayer(new Archer());
                break;
            case 3:
                initPlayer(new Knight());
                break;
            default:
                initPlayer(new Samurai());
                break;
        }
    }
    public void info(){
        System.out.println("\n==============================\n## "+
               this.getName()+" : "+this.getCharName()+" ##\n----------"+
                "\nYour weapon : "+this.getInventory().getWeapon().getName()+
                        "\nYour armor : "+this.getInventory().getArmor().getName()+
                       "\nYour food : "+ this.getInventory().getFood()+ "\nYour wood : "+ this.getInventory().getWood()+ "\nYour water : "+ this.getInventory().getWater()+
                        "\nYour damage block : "+this.getInventory().getArmor().getBlock()+
                       "\nYour damage : "+this.getTotalDamage()+
                        "\nYour health : "+this.getHealth()+
                        "\nYour money : "+this.getMoney()+"\n==============================\n");
    }

    public void initPlayer(GameChar gameChar){
        this.setDamage(gameChar.getDamage());
        this.setCharName(gameChar.getName());
        this.setHealth(gameChar.getHealth());
        this.setBaseHealth(gameChar.getHealth());
        this.setMoney(gameChar.getMoney());
    }
    public int getTotalDamage(){
        return damage+this.getInventory().getWeapon().getDamage();
    }

    public int getBaseHealth() {
        return baseHealth;
    }

    public void setBaseHealth(int baseHealth) {
        this.baseHealth = baseHealth;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCharName() {
        return charName;
    }

    public void setCharName(String charName) {
        this.charName = charName;
    }

    public Scanner getScan() {
        return scan;
    }

    public void setScan(Scanner scan) {
        this.scan = scan;
    }
}
