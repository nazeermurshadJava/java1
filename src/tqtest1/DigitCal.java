package tqtest1;

import java.util.Scanner;

public class DigitCal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a  number of product digit");
        int num=sc.nextInt();
        int product=1;

        while (num!=0){
            int r=num%10;
            product=product*r;
            num=num/10;


        }
        System.out.println(" calculate product digits is" + product);
    }
}
