package java101_classes.practic1;

public class Student {
    String name,stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    double avarageFzk;
    double avarageMat;
    double avarageKim;
    double avarage;
    boolean isPass;

    Student(String name, int classes, String stuNo, Course mat,Course fizik,Course kimya) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        calcAvarage();
        this.isPass = false;
    }
    public void addBulkExamNote(int mat, int fizik, int kimya) {

        if (mat >= 0 && mat <= 100) {
            this.mat.note = mat;
        }

        if (fizik >= 0 && fizik <= 100) {
            this.fizik.note = fizik;
        }

        if (kimya >= 0 && kimya <= 100) {
            this.kimya.note = kimya;
        }

    }
    public void addVivaExamNote(int mat, int fizik, int kimya){
        if (mat >= 0 && mat <= 100) {
            this.mat.vivaNote = mat;
        }

        if (fizik >= 0 && fizik <= 100) {
            this.fizik.vivaNote = fizik;
        }

        if (kimya >= 0 && kimya <= 100) {
            this.kimya.vivaNote = kimya;
        }
    }

    public void isPass() {
        calcAvarage();
        printNote();
        if(this.avarageFzk>55){
            System.out.println("Fizik dersinden Geçti. ");
        }else {
            System.out.println("Fizik dersinden Kaldi. ");
        }System.out.println("Fizik ortalamasi : " + this.avarageFzk);
        if(this.avarageMat>55){
            System.out.println("Matematik dersinden Geçti. ");
        }else {
            System.out.println("Matematik dersinden Kaldi. ");
        }System.out.println("Matematik ortalamasi : " + this.avarageMat);
        if(this.avarageKim>55){
            System.out.println("Kimya dersinden Geçti. ");
        }else {
            System.out.println("Kimya dersinden Kaldi. ");
        }System.out.println("Kimya ortalamasi : " + this.avarageKim);
        if(this.avarage>55){
            System.out.println("Sınıfı Geçti. ");
        }else {
            System.out.println("Sınıfta Kaldi. ");
        }System.out.println("Genel ortalama : " + this.avarage);
    }

    public void calcAvarage() {
        this.avarageFzk=(this.fizik.note*0.8)+(this.fizik.vivaNote*0.2);
        this.avarageMat=(this.mat.note*0.8)+(this.mat.vivaNote*0.2);
        this.avarageKim=(this.kimya.note*0.8)+(this.kimya.vivaNote*0.2);
        this.avarage=(avarageFzk+avarageMat+avarageKim)/3;
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote(){
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Notu : " + this.mat.note);
        System.out.println("Matematik Sozlu : " + this.mat.vivaNote);
        System.out.println("Fizik Notu : " + this.fizik.note);
        System.out.println("Fizik Sozlu : " + this.fizik.vivaNote);
        System.out.println("Kimya Notu : " + this.kimya.note);
        System.out.println("Kimya Sozlu : " + this.kimya.vivaNote);
    }
}
