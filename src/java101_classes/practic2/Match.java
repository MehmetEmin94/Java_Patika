package java101_classes.practic2;

public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;
    public Match(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    public void checkHealth(){
        System.out.println("Healths :\n"+f1.name+" :"+f1.health+"\n"+f2.name+" :"+f2.health+"\n");
    }
    public boolean isFirst(){
        double random=Math.random()*100;
        return random<=50;
    }
    public void start(){
        int i=1;

        if(isCheck()){
            if(isFirst()){
                while (this.f1.health>0&&this.f2.health>0){
                    System.out.println(i++ +". Round\n");
                    f2.health=f1.hit(f2);
                    if (isWin()){
                        checkHealth();
                        break;
                    }
                    f1.health=f2.hit(f1);
                    if (isWin()){
                        checkHealth();
                        break;
                    }
                    checkHealth();
                }
        }
            while (this.f1.health>0&&this.f2.health>0){
                System.out.println(i++ +". Round\n");
                f1.health=f2.hit(f1);
                if (isWin()){
                    checkHealth();
                    break;
                }
                f2.health=f1.hit(f2);
                if (isWin()){
                    checkHealth();
                    break;
                }
                checkHealth();
            }

        }else {
            System.out.println("Out of weight");
        }

    }

    public boolean isCheck(){
        return (this.f1.weight>=minWeight&&this.f1.weight<=maxWeight)&&(this.f2.weight>=minWeight&&this.f2.weight<=maxWeight);
    }
    public boolean isWin(){
        if(this.f1.health==0){
            System.out.println(f2.name+ " win !");
            return true;
        }
        if(this.f2.health==0){
            System.out.println(f1.name+ " win !");
            return true;
        }
        return false;
    }
}
