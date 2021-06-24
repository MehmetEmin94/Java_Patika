package java101_classes.practic2;

public class Main1 {
    public static void main(String[] args) {
        Fighter f1=new Fighter("x",100,10,90,10);
        Fighter f2=new Fighter("y",75,20,75,100);

        Match match=new Match(f1,f2,74,105);
        match.start();
    }
}
