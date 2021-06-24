package java101_classes.pratic2;

public class Fighter {
    String name;
    int health;
    int damage;
    int weight;
    int dodge;
    public Fighter(String name, int health, int damage, int weight,int dodge) {
        this.name = name;
        this.health = health;
        this.damage = damage;
        this.weight = weight;
        this.dodge=dodge;
    }
    public boolean isDodge(){
        double randomNum=Math.random()*100;
        return randomNum<=this.dodge;
    }

    public int hit(Fighter opponent){
        System.out.println(this.name+" => "+opponent.name+" "+this.damage+" hit damage");
        if (opponent.isDodge()){
            System.out.println(opponent.name+" blocked attack");
            return opponent.health;
        }
        if(opponent.health-this.damage<0){
            System.out.println(this.name+" win");
            return 0;
        }
        return opponent.health-this.damage;
    }
}
