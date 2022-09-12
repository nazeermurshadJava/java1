package tqtest4;

public class Employee extends Person1{
    String companyName;
    int id,salary;
    void setempData(String companyName,int id,int salary){
        this.companyName=companyName;
        this.id=id;
        this.salary=salary;
    }
    void display(){
        System.out.println(name+" "+contact+" "+address+" "+age);
        System.out.println(companyName+" "+id+" "+salary);
    }
}
