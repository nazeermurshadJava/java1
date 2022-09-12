package parametrMethod;

import java.util.Scanner;

public class StudentDetails {
    int id;
    String name, dept;

    double data(int m1, int m2, int m3, int m4, int m5) {
        double result = m1 + m2 + m3 + m4 + m5;
        return result;
    }

    double percent(double result) {

        double percent = result / 5;
        System.out.println("your percentage is:"+ percent);
        return percent;
    }

    double grade(double result) {
        double p = percent(result);
        if (p > 75) {
            System.out.println("distinction");
        } else if (p > 65) {
            System.out.println("first class");

        } else if (p > 40) {
            System.out.println("pass");

        } else {
            System.out.println("fail");
        }
        return p;
    }


    void details(int i, String n, String d) {
        id = i;
        name = n;
        dept = d;
    }
       void display(){
        System.out.println(id+" "+name+" "+dept+ "");
    }


    public static void main(String[] args) {
        int m1,m2,m3,m4,m5;
        StudentDetails s1=new StudentDetails();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the id");
        int id= sc.nextInt();
        System.out.println("enter the name");
        String name= sc.next();
        System.out.println("ente the dept");
        String dept= sc.next();

        System.out.println("enter five subject marks");
        m1=sc.nextInt();
        m2=sc.nextInt();
        m3=sc.nextInt();
        m4=sc.nextInt();
        m5= sc.nextInt();
        s1.details(id,name,dept);
        s1.display();
        System.out.println();

        double result=s1.data(m1,m2,m3,m4,m5);
        s1.grade(result);

        System.out.println("enter the id");
        id= sc.nextInt();
        System.out.println("enter the name");
        name= sc.next();
        System.out.println("ente the dept");
         dept= sc.next();



        System.out.println("enter five subject marks");
        m1=sc.nextInt();
        m2=sc.nextInt();
        m3=sc.nextInt();
        m4=sc.nextInt();
        m5= sc.nextInt();
        s1.details(id,name,dept);
        s1.display();
        System.out.println();

         result=s1.data(m1,m2,m3,m4,m5);
        s1.grade(result);

    }
        }