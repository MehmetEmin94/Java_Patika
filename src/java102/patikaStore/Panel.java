package patikaStore;

import java.util.ArrayList;
import java.util.Scanner;

public class Panel {
    PatikaStore patikaStore=new PatikaStore();
    Scanner scanner=new Scanner(System.in);
    public void show(){

       while (true){
        System.out.println("PatikaStore Ürün Yönetim Paneli !");
        System.out.println("1 - Notebook İşlemleri");
        System.out.println("2 - Cep Telefonu İşlemleri");
        System.out.println("3 - Marka Listele");
        System.out.println("0 - Çıkış Yap");
        System.out.print("Tercihiniz :");
        int select=scanner.nextInt();
        if (select==1){
            notebookOperations(patikaStore);
        }
        if (select==2){
            cellPhoneOperations(patikaStore);
        }
        if (select==3){
            for (Brand b:patikaStore.getBrands()) {
                System.out.println(b.getName());
            }
        }
        if (select==0){
            break;
        }
       }

    }
    public void notebookOperations(PatikaStore patikaStore){
        patikaStore.setNotebooks(new Notebook(1,12000,10,20,"FX504",patikaStore.getBrands().get(5).getName(),"8 GB","512 SSD","16 inch"));
        patikaStore.setNotebooks(new Notebook(2,15000,10,10,"LENOVO V14 IGL",patikaStore.getBrands().get(1).getName(),"16 GB","512 SSD","17 inch" ));

       int a=0;
        while (a==0){
        System.out.println("1 - Urunleri Listele :");
        System.out.println("2 - Urun Ekle :");
        System.out.println("3 - Urun Sil :");
        System.out.println("4 - Urunu Id'ye gore getir  :");
        System.out.println("5 - Urunleri Markaya gore Listele  :");
        System.out.println("0 - Cikis : ");
        System.out.print("Tercihiniz :");
        int select=scanner.nextInt();
        if (select==1){
            listNotebooks(patikaStore.getNotebooks());
        }
        if (select==2){
                addNotebook();
            }
            if (select==3){
                deleteNotebook();
            }
            if (select==4){
                getByNotbookId();
            }
            if (select==5){
                getByNotbookBrand();
            }


            if (select==0){
                a++;
            }
        }
    }
    public void getByNotbookBrand(){
        while (true) {
            System.out.println("Urunler : ");
            for (Notebook n : patikaStore.getNotebooks()) {
                System.out.println(n.getId() + " ) " + n.getBrand() + " - " + n.getName());
            }
            System.out.println("Gormek istediginiz urun Id'si ");
            System.out.println("0 - Cikis");
            System.out.print("Tercihiniz :");
            String brand = scanner.next();

            for (Notebook n:patikaStore.getNotebooks()) {
                if (n.getBrand().toUpperCase().equals(brand.toUpperCase())){
                    System.out.println("| "+n.getId()+"  | "+n.getName()+"\t|\t"+n.getUnitPrice()+"\t|\t"+n.getBrand()+"\t|\t"+n.getStorage()+
                            "\t|\t"+n.getScreenSize()+"\t|\t"+n.getMemory()+"|");
                }
            }

            if (brand.equals("0")){
                break;
            }
        }
    }
    public void getByNotbookId(){
        while (true) {
            System.out.println("Urunler : ");
            for (Notebook n : patikaStore.getNotebooks()) {
                System.out.println(n.getId() + " ) " + n.getBrand() + " - " + n.getName());
            }
            System.out.println("Gormek istediginiz urun Id'si ");
            System.out.println("0 - Cikis");
            System.out.print("Tercihiniz :");
            int id = scanner.nextInt();
            Notebook notebook=patikaStore.getNotebooks().get(id-1);
            System.out.println("| "+notebook.getId()+"  | "+notebook.getName()+"\t|\t"+notebook.getUnitPrice()+"\t|\t"+notebook.getBrand()+"\t|\t"+notebook.getStorage()+
                    "\t|\t"+notebook.getScreenSize()+"\t|\t"+notebook.getMemory());
            if (id==0){
                break;
            }
        }
    }
    public void deleteNotebook(){
        while (true){
        System.out.println("Urunler : ");
        for (Notebook n:patikaStore.getNotebooks()) {
            System.out.println(n.getId()+" ) "+n.getBrand()+" - "+n.getName());
        }
        System.out.println("Slilinecek Id seciniz ");
        System.out.println("0 - Cikis");
        System.out.print("Tercihiniz :");
        int id=scanner.nextInt();
        patikaStore.getNotebooks().remove(id);
        if (id==0){
            break;
        }
        }
    }
    public void addNotebook(){
        System.out.print("Fiyat giriniz : ");
        int price= scanner.nextInt();
        System.out.print("Indirim orani giriniz : ");
        int discount= scanner.nextInt();
        System.out.print("Stok adedi giriniz : ");
        int stock= scanner.nextInt();
        System.out.print("Urun ismi giriniz : ");
        String name= scanner.next();
        System.out.println("Markalar :");
        for (Brand b:patikaStore.getBrands()) {
            System.out.println(b.getId()+" ) "+b.getName());
        }
        System.out.print("Marka seciniz : ");
        int brand= scanner.nextInt();
        System.out.print("Bellek giriniz : ");
        String ram= scanner.next();
        System.out.print("Depolama giriniz : ");
        String storage= scanner.next();
        System.out.print("Ekran boyutu giriniz : ");
        String screen= scanner.next();
        patikaStore.setNotebooks(new Notebook(patikaStore.getNotebooks().size()+1,price,discount,stock,name,patikaStore.getBrands().get(brand-1).getName(),ram,storage,screen));

    }

    public void listNotebooks(ArrayList<Notebook> notebooks){
        int a=0;
        while (a==0){
        System.out.println("Notebook Listesi\n\n");
        for (int i=0;i<100;i++){
            System.out.print("-");}
        System.out.println();
        System.out.println("| ID | Urun Adi \t| Fiyat \t| Marka \t| Depolama   | Ekran   | RAM");
        for (int i=0;i<100;i++){
            System.out.print("-");}
        System.out.println();
        for (Notebook i:notebooks){
            System.out.println("| "+i.getId()+"  | "+i.getName()+"\t|\t"+i.getUnitPrice()+"\t|\t"+i.getBrand()+"\t|\t"+i.getStorage()+
                    "\t|\t"+i.getScreenSize()+"\t|\t"+i.getMemory());
        }
        for (int i=0;i<1010;i++){
            System.out.print("-");}
        System.out.println();
        System.out.print("Cikis icin 0'i tuslayiniz : ");
        int sc= scanner.nextInt();
        if (sc==0){
            a++;
        }else {
            a=0;
        }
        }
    }
    public void cellPhoneOperations(PatikaStore patikaStore){
        patikaStore.setCellPhones(new CellPhone("12 MP",2000,0,15,"Iphone 8",patikaStore.getBrands().get(2).getName(),1,"128 GB","5 inch",3000,"3 GB","black"));
        int a=0;
        while (a==0){
        System.out.println("1 - Urunleri Listele :");
        System.out.println("2 - Urun Ekle :");
        System.out.println("3 - Urun Sil :");
        System.out.println("4 - Urunu Id'ye gore getir  :");
        System.out.println("5 - Urunleri Markaya gore Listele  :");
        System.out.print("Tercihiniz :");
        int select=scanner.nextInt();
        if (select==1){
            listCellPhones(patikaStore.getCellPhones());
        }
        if (select==2){
            addCellPhone();
        }
        if (select==3){
            deleteCellPhone();
        }
        if (select==4){
            getByCellPhoneId();
        }
        if (select==5){
            getByCellPhoneBrand();
        }


        if (select==0){
            a++;
        }}

    }
    public void  getByCellPhoneBrand(){
        while (true) {
            System.out.println("Urunler : ");
            for (CellPhone n : patikaStore.getCellPhones()) {
                System.out.println(n.getId() + " ) " + n.getBrand() + " - " + n.getName());
            }
            System.out.println("Gormek istediginiz urun Id'si ");
            System.out.println("0 - Cikis");
            System.out.print("Tercihiniz :");
            String brand = scanner.next();

            for (CellPhone n:patikaStore.getCellPhones()) {
                if (n.getBrand().toUpperCase().equals(brand.toUpperCase())){
                    System.out.println("| "+n.getId()+"  | "+n.getName()+"\t|\t"+n.getUnitPrice()+"\t|\t"+n.getBrand()+"\t|\t"+n.getPhoneStorage()+
                            "\t|\t"+n.getScreenSize()+"\t|\t"+n.getCamera()+"\t|\t"+n.getBatterySize()+"\t|\t"+n.getMemory()+"\t|\t"+n.getColor()+"|");

                }
            }

            if (brand.equals("0")){
                break;
            }
        }
    }
    public void getByCellPhoneId(){
        while (true) {
            System.out.println("Urunler : ");
            for (CellPhone n : patikaStore.getCellPhones()) {
                System.out.println(n.getId() + " ) " + n.getBrand() + " - " + n.getName());
            }
            System.out.println("Gormek istediginiz urun Id'si ");
            System.out.println("0 - Cikis");
            System.out.print("Tercihiniz :");
            int id = scanner.nextInt();
            CellPhone cellPhone=patikaStore.getCellPhones().get(id-1);
            System.out.println("| "+cellPhone.getId()+"  | "+cellPhone.getName()+"\t|\t"+cellPhone.getUnitPrice()+"\t|\t"+cellPhone.getBrand()+"\t|\t"+cellPhone.getPhoneStorage()+
                    "\t|\t"+cellPhone.getScreenSize()+"\t|\t"+cellPhone.getCamera()+"\t|\t"+cellPhone.getBatterySize()+"\t|\t"+cellPhone.getMemory()+"\t|\t"+cellPhone.getColor()+"|");
            if (id==0){
                break;
            }
        }
    }
    public void deleteCellPhone(){
        while (true){
            System.out.println("Urunler : ");
            for (CellPhone n:patikaStore.getCellPhones()) {
                System.out.println(n.getId()+" ) "+n.getBrand()+" - "+n.getName());
            }
            System.out.println("Slilinecek Id seciniz ");
            System.out.println("0 - Cikis");
            System.out.print("Tercihiniz :");
            int id=scanner.nextInt();
            patikaStore.getCellPhones().remove(id);
            if (id==0){
                break;
            }
        }
    }
    public void addCellPhone(){
        System.out.print("Fiyat giriniz : ");
        int price= scanner.nextInt();
        System.out.print("Indirim orani giriniz : ");
        int discount= scanner.nextInt();
        System.out.print("Stok adedi giriniz : ");
        int stock= scanner.nextInt();
        System.out.print("Urun ismi giriniz : ");
        String name= scanner.next();
        System.out.println("Markalar :");
        for (Brand b:patikaStore.getBrands()) {
            System.out.println(b.getId()+" ) "+b.getName());
        }
        System.out.print("Marka seciniz : ");
        int brand= scanner.nextInt();
        System.out.print("Kamera giriniz : ");
        String cam= scanner.next();
        System.out.print("Bellek giriniz : ");
        String ram= scanner.next();
        System.out.print("Pil giriniz : ");
        int battery= scanner.nextInt();
        System.out.print("Renk giriniz : ");
        String color= scanner.next();
        System.out.print("Depolama giriniz : ");
        String storage= scanner.next();
        System.out.print("Ekran boyutu giriniz : ");
        String screen= scanner.next();
        patikaStore.setCellPhones(new CellPhone(cam,price,discount,stock,name,patikaStore.getBrands().get(brand-1).getName(),patikaStore.getCellPhones().size()+1,storage,screen,battery,ram,color));

    }


    public void listCellPhones(ArrayList<CellPhone> cellPhones){
        int a=0;
        while (a==0){
            System.out.println("Telefon Listesi\n\n");
            for (int i=0;i<100;i++){
                System.out.print("-");}
            System.out.println();
            System.out.println("| ID | Urun Adi \t| Fiyat \t| Marka \t| Depolama   | Ekran   | Kamera  \t | Pil \t| RAM \t| Renk \t|");
            for (int i=0;i<100;i++){
                System.out.print("-");}
            System.out.println();
            for (CellPhone i:cellPhones){
                System.out.println("| "+i.getId()+"  | "+i.getName()+"\t|\t"+i.getUnitPrice()+"\t|\t"+i.getBrand()+"\t|\t"+i.getPhoneStorage()+
                        "\t|\t"+i.getScreenSize()+"\t|\t"+i.getCamera()+"\t|\t"+i.getBatterySize()+"\t|\t"+i.getMemory()+"\t|\t"+i.getColor()+"|");
            }
            for (int i=0;i<1010;i++){
                System.out.print("-");}
            System.out.println();
            System.out.print("Cikis icin 0'i tuslayiniz : ");
            int sc= scanner.nextInt();
            if (sc==0){
                a++;
            }else {
                a=0;
            }
        }
    }
}
