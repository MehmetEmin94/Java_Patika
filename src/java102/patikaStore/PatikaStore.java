package java102.patikaStore;

import java.util.ArrayList;

public class PatikaStore {
    private ArrayList<Brand> brands;
    private ArrayList<Notebook> notebooks=new ArrayList<>();
    private ArrayList<CellPhone> cellPhones=new ArrayList<>();

    public PatikaStore(){
        Brand[] brand=new Brand[]{new Brand(1,"Samsung"),new Brand(2,"Lenovo"),
                new Brand(3,"Apple"),new Brand(4,"Huawei"),new Brand(5,"Casper"),
                new Brand(6,"Asus"),new Brand(7,"HP"),new Brand(8,"Xiaomi"),
                new Brand(9,"Monster")};
        this.brands =new ArrayList<>();
        this.brands.add(brand[0]);
        this.brands.add(brand[1]);
        this.brands.add(brand[2]);
        this.brands.add(brand[3]);
        this.brands.add(brand[4]);
        this.brands.add(brand[5]);
        this.brands.add(brand[6]);
        this.brands.add(brand[7]);
        this.brands.add(brand[8]);
    }
    public PatikaStore(ArrayList<Notebook> notebooks) {
        this.notebooks = notebooks;
    }

    public ArrayList<CellPhone> getCellPhones() {
        return cellPhones;
    }

    public void setCellPhones(CellPhone cellPhones) {
        this.cellPhones.add(cellPhones);
    }



    public void setBrands(ArrayList<Brand> brands) {
        this.brands = brands;
    }

    public ArrayList<Notebook> getNotebooks() {
        return notebooks;
    }

    public void setNotebooks(Notebook notebooks) {
        this.notebooks.add(notebooks);
    }

    public ArrayList<Brand> getBrands() {
        return brands;
    }

}
