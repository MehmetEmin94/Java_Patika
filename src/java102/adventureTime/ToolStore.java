package java102.adventureTime;


public class ToolStore extends NormalLoc{
    public ToolStore(Player player) {
        super(player, "Store", 2);
    }
    @Override
    public boolean onLocation() {
        System.out.println("Welcome to Tool-Shop.");
        int showMenu=0;
        while(showMenu==0){
            System.out.println("1-Weapons");
            System.out.println("2-Armors");
            System.out.println("3-Exit Store");
            System.out.println("----------\nYour selection : ");
            int selectCase=scan.nextInt();
            while(selectCase<1||selectCase>3){
                System.out.print("Invalid value,try again : ");
                selectCase=scan.nextInt();
            }
            switch (selectCase){
                case 1:
                    printWeapon();
                    buyWeapon();
                    break;
                case 2:
                    printArmor();
                    buyArmor();
                    break;
                case 3:
                    System.out.println("You're always welcome");
                    showMenu=1;
            }
        }
        return true;
    }
    public void printWeapon(){
        System.out.println("---- Weapons ----");
        for (Weapon w:Weapon.weapons()) {
            System.out.println(w.getId()+") "+w.getName()+" --> Price : "+w.getPrice()+" ---\tDamage : "+w.getDamage());
        }
        System.out.println("0) Exit");
    }
    public void buyWeapon(){
        System.out.print("\nSelect weapon for better damage : ");
        int selectWeapon=scan.nextInt();
        while(selectWeapon<0||selectWeapon>Weapon.weapons().length){
            System.out.print("Invalid value,try again : ");
            selectWeapon=scan.nextInt();
        }
        if(selectWeapon!=0){
            Weapon selectedWeapon= Weapon.getWeaponById(selectWeapon);
            if(selectedWeapon!=null){
                if (this.getPlayer().getMoney()-selectedWeapon.getPrice()>=0){
                    this.getPlayer().setMoney(this.getPlayer().getMoney()-selectedWeapon.getPrice());
                    System.out.println(this.getPlayer().getMoney()+" left your money.");
                    this.getPlayer().getInventory().setWeapon(selectedWeapon);
                    System.out.println(this.getPlayer().getInventory().getWeapon().getName()+" your new weapon.");
                    System.out.println("You're always welcome");
                }else{
                    System.out.println("Your money is not enough for buy "+selectedWeapon.getName());
                    System.out.println("** Come back another time **");

                }
            }else {
                System.out.println("You're always welcome");
            }
        }

    }

    public  void printArmor(){
        System.out.println("---- Weapons ----");
        for (Armor a: Armor.armors()) {
            System.out.println(a.getId()+") "+a.getName()+" --> Price : "+a.getPrice()+" ---\tBlock : "+a.getBlock());
        }
        System.out.println("0) Exit");
    }

    public void buyArmor(){
        System.out.print("\nSelect armor for better safety : ");
        int selectArmor=scan.nextInt();
        while(selectArmor<0||selectArmor>Armor.armors().length){
            System.out.print("Invalid value,try again : ");
            selectArmor=scan.nextInt();
        }
        if(selectArmor!=0){
            Armor selectedArmor=Armor.getArmorById(selectArmor);
            if (selectedArmor!=null){
                if(selectedArmor.getPrice()>this.getPlayer().getMoney()){
                    System.out.println("Your money is not enough for buy "+selectedArmor.getName());
                    System.out.println("** Come back another time **");
                }else {
                    this.getPlayer().setMoney(this.getPlayer().getMoney()-selectedArmor.getPrice());
                    System.out.println(this.getPlayer().getMoney()+" left your money.");
                    this.getPlayer().getInventory().setArmor(selectedArmor);
                    System.out.println(this.getPlayer().getInventory().getArmor().getName()+" your new armor.");
                    System.out.println("You're always welcome");
                }
            }
        }
    }
}
