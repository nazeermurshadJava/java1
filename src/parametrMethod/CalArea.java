package parametrMethod;

import java.util.Scanner;

public class CalArea {
    void areaOfractangle(float l,float b){
        double area=l*b;
        System.out.println("area of ractangle" + area);
    }
    void areaCircle(double r){
      double   area=3.14*r*r;
        System.out.println("area of circle" + area);

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        CalArea a=new CalArea();
        System.out.println("enter a length and breadth");
        float l= sc.nextFloat();
        float b= sc.nextFloat();
        a.areaOfractangle(l,b);

        CalArea s1=new CalArea();

        System.out.println("enter a radious");
        float r= sc.nextFloat();
        s1.areaCircle(r);



    }
}
