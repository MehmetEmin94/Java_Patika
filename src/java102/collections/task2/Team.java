package collections.task2;

import java.util.ArrayList;

public class Team {
    private String name;
    ArrayList<String> rival=new ArrayList<>();
    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
