package parametrMethod;

import java.util.Scanner;

public class CalculateSimpleInt {


    double simple(double p,double r,double t){

        double result=p*r*t;
        return result;
    }
    void calSimple(double result){
        double simpleInt=result/100;
        System.out.println("Simple intrest is:" +simpleInt);

    }


    public static void main(String[] args) {
        CalculateSimpleInt s1= new CalculateSimpleInt();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter principal amount");
        double p=sc.nextDouble();
        System.out.println("enter rate amount");
        double r=sc.nextDouble();
        System.out.println("enter time");
        double t=sc.nextDouble();
        double result=s1.simple(p,r,t);
        s1.calSimple(result);


    }
}
