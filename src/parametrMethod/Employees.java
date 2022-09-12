package parametrMethod;

import java.util.Scanner;

public class Employees {
    int id;
    String name, dept, rating;
    double salary, bounsSalary;

    void empData(int i, String n, String d) {
        id = i;
        name = n;
        dept = d;

    }

    void bonus(double salary) {

        if (rating.equals("A")) {

            bounsSalary = salary + (salary * 20 / 100);
            System.out.println("bonus salry" + bounsSalary);
        } else if (rating.equals("b")) {
            bounsSalary = salary + (salary * 15 / 100);
            System.out.println("bonus salry" + bounsSalary);

        } else if (rating.equals("C")) {
            bounsSalary = salary + (salary * 10 / 100);
            System.out.println("bonus salry" + bounsSalary);


        } else if (rating.equals("D")) {
            bounsSalary = salary + (salary * 5 / 100);
            System.out.println("bonus salry" + bounsSalary);
        }


    }
         void display()
    {
        System.out.println("employee id"+" "+id);
        System.out.println("employee name"+" "+name);
        System.out.println("employee departmetnt"+" " +dept);
        System.out.println("employee rating" +" " +rating);
        System.out.println("employee salary" +" " +salary);
    }



    public static void main(String[] args) {
        Employees e1=new Employees();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the id");
        int id=sc.nextInt();
        System.out.println("enter the name");
         String name=sc.next();
        System.out.println("enter department");
        String dept=sc.next();
        System.out.println("enter rating");
        String rating=sc.next();
        System.out.println("enter salary");
        double salary= sc.nextDouble();
        e1.empData(id,name,dept);
        e1.bonus(salary);
        e1.display();

    }
}
