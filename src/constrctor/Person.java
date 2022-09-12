package constrctor;

import java.util.Scanner;

public class Person {
    int id ,age;
    String name,email,add;
    long contact;

    Person(int i,String n,String e,String a,int ag,long c){
        id=i;
        name=n;
        email=e;
        add=a;
        age=ag;
        contact=c;
    }
    void dispaly(){
        System.out.println(id);
        System.out.println(name);
        System.out.println(email);
        System.out.println(add);
        System.out.println(age);
        System.out.println(contact);

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter id");
        int id=sc.nextInt();
        System.out.println("enter name");
        String name=sc.next();
        System.out.println("enter email");
        String email=sc.next();
        System.out.println("enter add");
        String add=sc.next();
        System.out.println("enter age");
        int age= sc.nextInt();
        System.out.println("enter contact");
        long contact=sc.nextLong();
        Person p=new Person(id,name,email,add,age,contact);
        p.dispaly();
        System.out.println("==================");

        System.out.println("enter id");
        id=sc.nextInt();
        System.out.println("enter name");
         name=sc.next();
        System.out.println("enter email");
       email=sc.next();
        System.out.println("enter add");
         add=sc.next();
        System.out.println("enter age");
         age= sc.nextInt();
        System.out.println("enter contact");
        contact=sc.nextLong();


        Person p1=new Person(id,name,email,add,age,contact);
        p1.dispaly();
        System.out.println("=================");

        System.out.println("enter id");
        id=sc.nextInt();
        System.out.println("enter name");
        name=sc.next();
        System.out.println("enter email");
        email=sc.next();
        System.out.println("enter add");
        add=sc.next();
        System.out.println("enter age");
        age= sc.nextInt();
        System.out.println("enter contact");
        contact=sc.nextLong();


        Person p2=new Person(id,name,email,add,age,contact);
        p2.dispaly();
    }
}
