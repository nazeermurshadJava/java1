package parametrMethod;

import java.util.Scanner;

public class CalculAvrg {
    int totalCal(int m1,int m2,int m3,int m4,int m5){
        int total=m1+m2+m3+m4+m5;
        return total;
    }
    int percentCal(int total){
        int percent=total/5;
        System.out.println("percentage is: "+ percent);
        return percent;
    }
    void grade(int p){
     //   float percentagep=percentCal(total);
        if (p>75){
            System.out.println("distinction");
        }else if(p>65){
            System.out.println("first class");
        } else if (p>55) {
            System.out.println("second class");

        } else if (p>45) {
            System.out.println("pass");

        }else if (p<=35)
            System.out.println("fail");
    }

    public static void main(String[] args) {
        int m1,m2,m3,m4,m5;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 5 subject marks :");
        m1=sc.nextInt();
        m2=sc.nextInt();
        m3=sc.nextInt();
        m4=sc.nextInt();
        m5=sc.nextInt();

        CalculAvrg pc=new CalculAvrg();
        int total=pc.totalCal(m1,m2,m3,m4,m5);
        pc.grade(total);
    }
}
