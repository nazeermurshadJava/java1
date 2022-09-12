package MetodReturn;

import java.util.Scanner;

public class RetrunVal {
    float radius(float r){
    return r*r;

    }
    void area(float rsq){
        float area=3.14f*rsq;
        System.out.println("area of circle"+area);
    }

    public static void main(String[] args) {
        RetrunVal mv=new RetrunVal();
        Scanner sc=new Scanner(System.in);
        System.out.println(" enter  a radius");
        int r=sc.nextInt();
        float rsq=mv.radius(r);
        mv.area(rsq);
    }
}
