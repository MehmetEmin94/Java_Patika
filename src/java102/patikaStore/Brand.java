package java102.patikaStore;

public class Brand implements Comparable<Brand>{
    private int id;
    private String name;

    public Brand(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Brand o) {
        String a=this.getName();
        String b=o.getName();
        return a.compareTo(b);
    }
}
