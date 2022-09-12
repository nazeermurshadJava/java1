package tqtest1;

import java.util.Scanner;

public class calculpower {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter your base ");
        int base=sc.nextInt();
        System.out.println("enter your index");
        int index=sc.nextInt();
        int power=1;
        for (int i=1;i<=index;i++){
             power=power*base;
            System.out.println("==========");

        }System.out.println(power);

    }
}
