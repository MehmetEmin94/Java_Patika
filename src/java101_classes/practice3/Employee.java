package java101_classes.practice3;

public class Employee {
    String name;
    int salary;
    int workHours;
    int hireYear;

    public Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public int raiseSalary(){
        int workingYear=2021-this.hireYear;
        int raiseVal=0;
        if (workingYear>10){
            raiseVal+=this.salary*0.05;
        }
        if(workingYear>9&&workingYear<20){
            raiseVal+=this.salary*0.1;
        }
        if(workingYear>19){
            raiseVal+=this.salary*0.15;
        }
        return raiseVal;
    }

    public double tax(){
        double salaryTax = 0;
        if (this.salary>1000){
            salaryTax=salary*0.03;
        }
        return salaryTax;
    }

    public int bonus(){
        int salaryBonus=0;
        if(workHours>40){
            salaryBonus=(workHours-40)*30;
        }
        return salaryBonus;
    }
    public void to_String(){
        System.out.println("Name : "+this.name+"\nSalary : "+this.salary+
                "\nWorking hours : "+this.workHours+"\nStart Year : "+this.hireYear+
                "\nTax value : "+tax()+"\nBonus : "+bonus()+"\nSalary raise value : "+raiseSalary()+
                "\nSalary added tax and bonus : "+(this.salary-tax()+bonus())+"\nTotal Salary : "+(this.salary-tax()+raiseSalary()+bonus()));
    }


}
