package java102.patikaStore;

public class CellPhone extends Product{
    private int id;
    private String phoneStorage;
    private String screenSize;
    private int batterySize;
    private String memory;
    private String color;
    private String camera;

    public CellPhone(){}
    public CellPhone(String camera,double unitPrice, int discount, int unitsInStock, String name, String brand,int id, String phoneStorage, String screenSize, int batterySize, String memory, String color) {
        super(unitPrice, discount, unitsInStock, name, brand);
        this.phoneStorage = phoneStorage;
        this.screenSize = screenSize;
        this.batterySize = batterySize;
        this.memory = memory;
        this.color = color;
        this.id=id;
        this.camera=camera;
    }

    public String getCamera() {
        return camera;
    }

    public void setCamera(String camera) {
        this.camera = camera;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPhoneStorage() {
        return phoneStorage;
    }

    public void setPhoneStorage(String phoneStorage) {
        this.phoneStorage = phoneStorage;
    }

    public String getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(String screenSize) {
        this.screenSize = screenSize;
    }

    public int getBatterySize() {
        return batterySize;
    }

    public void setBatterySize(int batterySize) {
        this.batterySize = batterySize;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
