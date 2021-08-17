package patikaStore;

public class Notebook extends Product{
    private int id;
    private String memory;
    private String storage;
    private String screenSize;

    public Notebook(){

    }
    public Notebook(int id,double unitPrice, int discount, int unitsInStock, String name, String brand, String memory, String storage, String screenSize) {
        super(unitPrice, discount, unitsInStock, name, brand);
        this.memory = memory;
        this.storage = storage;
        this.screenSize = screenSize;
        this.id=id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public String getStorage() {
        return storage;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

    public String getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(String screenSize) {
        this.screenSize = screenSize;
    }
}
