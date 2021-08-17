package collections.task2;


import java.util.ArrayList;

public class Round {
    private int number;
    ArrayList<String> home=new ArrayList<>();
    ArrayList<String> away=new ArrayList<>();
    public Round(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }


}
