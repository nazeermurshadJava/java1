package looping;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {

      Scanner sc=new Scanner(System.in);
        System.out.println("enter a num");
        int num= sc.nextInt();
        int a=0,c;
        c=num;
        while (num>0){            //153          15              1
            int r=num%10;          //3             5              1
            a=(r*r*r)+a;          //0+27+0=27       27+125=152     1*1*1
            num=num/10;           //15              1              0

        }
        if (c==a){                 //153=27    153=151           153=153
            System.out.println("it is aromstrong number");

        }else System.out.println("it is not aromstrong number");

        }
    }

