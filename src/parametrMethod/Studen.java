package parametrMethod;

import java.util.Scanner;

public class Studen {
    int id,marks;
    String name,dept;
    void data(int i,String n,String d,int m){
        id=i;
        name=n;
        dept=d;
        marks=m;
    }
    void display(){
        System.out.println(id+ " "+name+" "+dept+ " "+marks);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the id");
        int id=sc.nextInt();
        System.out.println("enter the name");
        String name=sc.next();
        System.out.println("enter dept name");
        String dept=sc.next();
        System.out.println("enetr the marks" );
        int mark= sc.nextInt();


        Studen s1=new Studen();
        s1.data(id,name,dept,mark);

        System.out.println("enter the id");
         id=sc.nextInt();
        System.out.println("enter the name");
        name=sc.next();
        System.out.println("enter dept name");
          dept=sc.next();
        System.out.println("enetr the marks" );
         mark= sc.nextInt();


         Studen s2=new Studen();
         s2.data(id,name,dept,mark);
        System.out.println("------STUDENT DETAILS------");
        s1.display();
        s2.display();


    }
}
