package java102.adventureTime;


import java.util.Random;

public class BattleLoc extends Location{
    Random r=new Random();
    private Monster monster;
    private String award;
    private int monsterNum;
    private SafeHouse safeHouse=new SafeHouse(getPlayer());
    public BattleLoc(Player player, String name, int id, Monster monster, String award, int monsterNum) {
        super(player, name, id);
        this.monster=monster;
        this.award=award;
        this.monsterNum=monsterNum;
    }

    @Override
    public String prize(){
        return " ** Prize is ";
    }

    @Override
    public boolean onLocation() {

        int monsterNumber=randomMonsterNum();
        System.out.println("You are in "+this.getName()+" now !");
        System.out.println("Be careful ! "+monsterNumber+" "+this.getMonster().getName()+" is here !");
        System.out.println("<F>ight or <R>un");
        String select=scan.nextLine().toUpperCase();
        if(select.equals("F")&&(combat(monsterNumber)==true)){

            System.out.println("battle");
            System.out.println(this.getName()+" you won !");
            if (this.getMonster().getName().equals("Zombie")) {
                this.getPlayer().getInventory().setFood(1);
            }if(this.getMonster().getName().equals("Vampire")){
                this.getPlayer().getInventory().setWood(1);
            }if(this.getMonster().getName().equals("Bear")){
                this.getPlayer().getInventory().setWater(1);
            }if(this.getMonster().getName().equals("Snake")){
                chanceOfPrize();
            }
            return true;
        }
        if(select.equals("R")||(combat(monsterNumber)==false)){
            System.out.println("you run");
            safeHouse.onLocation();
            return true;
        }
        if(this.getPlayer().getHealth()<=0){
            System.out.println(" you die !!");
            return false;
        }
        return false;
    }
    public void chanceOfPrize(){
        double chance1=Math.random()*100;
        double chance2=Math.random()*100;
        if (chance1<15){
            if(chance2<20){
                Weapon w= Weapon.getWeaponById(1);
                System.out.println("*** you win "+w.getName()+" ***");
                setAward(w.getName());
                this.getPlayer().getInventory().setWeapon(w);
            }else if(chance2<50){
                Weapon w= Weapon.getWeaponById(2);
                System.out.println("*** you win "+w.getName()+" ***");
                setAward(w.getName());
                this.getPlayer().getInventory().setWeapon(w);
            }else {
                Weapon w= Weapon.getWeaponById(3);
                System.out.println("*** you win "+w.getName()+" ***");
                setAward(w.getName());
                this.getPlayer().getInventory().setWeapon(w);
            }
        }else if(chance1<30){
            if(chance2<20){
                Armor a= Armor.getArmorById(1);
                System.out.println("*** you win "+a.getName()+" ***");
                setAward(a.getName());
                this.getPlayer().getInventory().setArmor(a);
            }else if(chance2<50){
                Armor a= Armor.getArmorById(1);
                System.out.println("*** you win "+a.getName()+" ***");
                setAward(a.getName());
                this.getPlayer().getInventory().setArmor(a);
            }else {
                Armor a= Armor.getArmorById(1);
                System.out.println("*** you win "+a.getName()+" ***");
                setAward(a.getName());
                this.getPlayer().getInventory().setArmor(a);
            }
        }else if(chance1<55){
            if(chance2<20){
                System.out.println("*** you win money "+10+" ***");
                this.getPlayer().setMoney(this.getPlayer().getMoney()+10);
            }else if(chance2<50){
                System.out.println("*** you win money "+10+" ***");
                this.getPlayer().setMoney(this.getPlayer().getMoney()+5);
            }else {
                System.out.println("*** you win money "+10+" ***");
                this.getPlayer().setMoney(this.getPlayer().getMoney()+1);
            }

        }else {
            System.out.println("You did not win  any prize");
        }
    }



    public boolean combat(int monsterNum){
        for(int i=1;i<=monsterNum;i++) {
                if (fiftyFiftyChance() == true) {
                    this.getMonster().setHealth(this.getMonster().getOriginalHealth());
                    playerStats();
                    monsterStats(i);
                    while (this.getPlayer().getHealth() > 0 && this.getMonster().getHealth() > 0) {
                        System.out.println("<H>it or <R>un");
                        String selectCombat = scan.nextLine().toUpperCase();
                        if (selectCombat.equals("H")) {
                            yourAttack();
                            if (this.getMonster().getHealth() > 0) {
                                monsterAttack();
                            } else {
                                this.getMonster().setHealth(0);
                                System.out.println("you win fight");
                            }
                        } if (selectCombat.equals("R")) {
                            return false;
                        }
                    }
                } else {
                    monsterAttack();
                    while (this.getPlayer().getHealth() > 0 && this.getMonster().getHealth() > 0) {
                        System.out.println("<H>it or <R>un");
                        String selectCombat2 = scan.nextLine().toUpperCase();
                        if (selectCombat2.equals("H")) {
                            yourAttack();
                            if (this.getMonster().getHealth() > 0) {
                                monsterAttack();
                            } else {
                                this.getMonster().setHealth(0);
                                System.out.println("you win fight");
                            }
                        } if (selectCombat2.equals("R")) {
                            return false;
                        }
                    }
                }
            if(this.getMonster().getHealth()<this.getPlayer().getHealth()){
                System.out.println("You destroy enemy ");
                System.out.println(this.getMonster().getTreasure()+" gold you won");
                this.getPlayer().setMoney(this.getPlayer().getMoney()+this.getMonster().getTreasure());
                System.out.println("Your total money : "+this.getPlayer().getMoney());
            }

        }
        return true;
    }

    public boolean fiftyFiftyChance(){
        double random=Math.random()*100;
        return random<=50;
    }
    public void yourAttack(){
        System.out.println("You hit !");
        this.getMonster().setHealth(this.getMonster().getHealth()-this.getPlayer().getTotalDamage());
        afterHit();
    }

    public int randomDamage(){
        return r.nextInt(4)+3;
    }
    public void monsterAttack(){
        System.out.println("\n"+this.getMonster().getName()+" attack you !");
        int monsterDamage=this.getMonster().getDamage()-this.getPlayer().getInventory().getArmor().getBlock();
        if(monsterDamage<0){
            monsterDamage=0;
        }
        this.getPlayer().setHealth(this.getPlayer().getHealth()-monsterDamage);
        afterHit();
    }

    public void afterHit(){
        System.out.println("Your remaining health : "+this.getPlayer().getHealth());
        if(this.getMonster().getHealth()>0) {
            System.out.println(this.getMonster().getName() + " remaining health : " + this.getMonster().getHealth());
        }else {
            System.out.println(this.getMonster().getName() + " remaining health : 0");
        }
    }

    public void monsterStats(int i){
        if(this.getMonster().getId()==4){
            this.getMonster().setDamage(randomDamage());
        }
        System.out.println(i+"."+this.getMonster().getName()+ " Stats");
        System.out.println("-------------------------");
        System.out.println("Health : "+this.getMonster().getHealth());
        System.out.println("Damage : "+this.getMonster().getDamage());
        System.out.println("Treasure : "+this.getMonster().getTreasure());
    }

    public void playerStats(){
        System.out.println("Gamer Stats");
        System.out.println("-------------------------");
        System.out.println("Health : "+this.getPlayer().getHealth());
        System.out.println("Damage : "+this.getPlayer().getTotalDamage());
    }

    public int randomMonsterNum(){
        return r.nextInt(this.getMonsterNum())+1;
    }

    public Monster getMonster() {
        return monster;
    }

    public void setMonster(Monster monster) {
        this.monster = monster;
    }

    public String getAward() {
        return award;
    }

    public void setAward(String award) {
        this.award = award;
    }

    public int getMonsterNum() {
        return monsterNum;
    }

    public void setMonsterNum(int monsterNum) {
        this.monsterNum = monsterNum;
    }
}
