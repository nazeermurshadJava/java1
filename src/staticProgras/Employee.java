package staticProgras;

public class Employee {
    int id,salary;
    String name;
    static String compName="Infosys";

    static {
        compName="Infosys pune";
        System.out.println("static block 1");
    }
    static {
        System.out.println("static block 2");
    }

    Employee(int id,String name,int sal){
        this.id=id;
        this.name=name;
        this.salary=sal;
    }
    static void companyInfo(){
        System.out.println("good company ..one of the to most company");
    }
    public String toStrint(){
        return id+" "+name+" "+salary;
    }

    public static void main(String[] args) {
        Employee e1=new Employee(101,"riya",60000);
        System.out.println(Employee.compName);

        Employee e2=new Employee(102,"sonu",70000);
        Employee.companyInfo();
        System.out.println(e1.id+" "+ e1.salary);

    }
}
