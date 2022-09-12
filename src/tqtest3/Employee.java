package tqtest3;

import java.util.Scanner;

public class Employee {
    int emp_id,salary;
    String name;
    Employee()
    {
        emp_id=101;
        salary=40000;
        name="demo";
    }
   Employee(int emp_id,int salary,String name){
        this.emp_id=emp_id;
        this.salary=salary;
        this.name=name;
    }
    public String toString()
    {
        return emp_id+" "+salary+" "+name;
    }
    void display(){
        System.out.println(emp_id+ " "+salary+" "+name);
    }

    public static void main(String[] args) {
        System.out.println("default construcotr");
        Employee e1=new Employee();
        e1.display();

        Scanner sc=new Scanner(System.in);
        System.out.println("===========");
        System.out.println("parameterized constructor");
        System.out.println("enter employee id");
        int epm_id= sc.nextInt();
        System.out.println("enter employee salary");
        int salary= sc.nextInt();
        System.out.println("enter employee name");
        String name=sc.next();
        Employee e2=new Employee();
        e2.display();
    }
}
