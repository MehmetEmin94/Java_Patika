package java102.patikaStore;

public class Product {
    private double unitPrice;
    private int discount;
    private int unitsInStock=0;
    private String name;
    private String brand;

    public Product(double unitPrice, int discount, int unitsInStock, String name, String brand) {
        this.unitPrice = unitPrice-(unitPrice*discount/100);
        this.discount = discount;
        this.unitsInStock = unitsInStock;
        this.name = name;
        this.brand = brand;
    }
    public Product(){}

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(int unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public int getUnitsInStock() {
        return unitsInStock;
    }

    public void setUnitsInStock(int unitsInStock) {
        this.unitsInStock = unitsInStock;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
