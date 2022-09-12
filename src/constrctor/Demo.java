package constrctor;

import java.util.Scanner;

public class Demo {
    int id,price,launchyear;
    String name,brand;


    Demo() {
        id = 00;
        name = "name";
        brand=brand;
        launchyear=0000;
        price=-1;
    }

    Demo(int i, String n,String b,int y,int p){
         id=i;
         name=n;
         brand=b;
         launchyear=y;
         price=p;


    }
    void display(){
        System.out.println(id+" "+name+" "+brand+" "+launchyear+" "+price);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Demo d1=new Demo();
        d1.display();
        System.out.println("enter a id");
        int id=sc.nextInt();
        System.out.println("enter a name");
        String name=sc.next();
        System.out.println("enter brand");
        String brand=sc.next();
        System.out.println("enter yera");
        int year= sc.nextInt();
        System.out.println("enter price");
        int price=sc.nextInt();
        Demo d2=new Demo(id,name,brand,year,price);
        d2.display();
        System.out.println(d2);
    }
}
