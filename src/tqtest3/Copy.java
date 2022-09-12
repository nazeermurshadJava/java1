package tqtest3;

import java.util.Scanner;

public class Copy {
    int id,salary;
     String name;
     Copy(int id,int salary,String name){
         this.id=id;
         this.salary=salary;
         this.name=name;
     }
     Copy(Copy ref){
         this.id=ref.id;
         this.salary=ref.salary;
         this.name= ref.name;
     }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the id");
        int id= sc.nextInt();
        System.out.println("enter the salary");
        int salary= sc.nextInt();
        System.out.println("enter the name");
        String name=sc.next();
       Copy c1=new Copy(id,salary,name);
        System.out.println(c1.id+" "+salary+" "+name);
        Copy c2=new Copy(c1);
        System.out.println(c2.id+" "+c2.salary+" "+c2.name);
}
}